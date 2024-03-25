package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class SearchResultPage extends BasePage{

    public static List<String> productSearchResult = new ArrayList<>();

    //By Locators
    private By searchResultHeadings = By.xpath("//*[@data-cy=\"title-recipe\"]");

    //Constructor
    public SearchResultPage(WebDriver driver){
        this.driver = driver;
    }

    public void printProductSearchResult(){
        String messageToLog = "";
        List<WebElement> elements = driver.findElements(searchResultHeadings);
        for (int i = 0; i < elements.size(); i++) {
            productSearchResult.add(elements.get(i).getText());
            System.out.println(i+" -> "+elements.get(i).getText());
            messageToLog = messageToLog+"\n"+i+" -> "+elements.get(i).getText();
        }

        scenario.log(messageToLog);
    }

    public void verifyProductDisplayed(String brandName) {
        for (int i = 0; i <productSearchResult.size(); i++) {
            Assert.assertTrue(productSearchResult.get(i).contains(brandName));
        }
    }
}
