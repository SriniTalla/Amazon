package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhonesAndAccessoriesPage extends BasePage{

    //By Locators
    private By mobileAndSmartPhoneLinkLocator = By.xpath("//a[text()='Mobile Phones & Smartphones']");

    //Constructor
    public PhonesAndAccessoriesPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnMobileAndSmartPhoneLink(){
        WebElement mobileAndSmartPhoneElement = driver.findElement(mobileAndSmartPhoneLinkLocator);
        waitForElement(mobileAndSmartPhoneElement).click();
    }

}
