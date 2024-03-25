package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartPhonesPage extends BasePage{

    //Constructor
    public SmartPhonesPage(WebDriver driver){
        this.driver = driver;
    }

    private By goButtonLocator = By.xpath("//span[input[@type=\"submit\"]]//span[contains(text(),'Go')]");
    private By minimumPriseRangeTextBoxLocator = By.id("low-price");
    private By maximumPriseRangeTextBoxLocator = By.id("high-price");

    public void selectBrand(String brandName){
        By brandNameCheckboxLocator = By.xpath("//input[@type='checkbox'][@aria-labelledby='"+brandName+"']");
        WebElement brandNameCheckboxElement = driver.findElement(brandNameCheckboxLocator);
        waitForElement(brandNameCheckboxElement);
        moveToElement(brandNameCheckboxElement);
        mouseClick(brandNameCheckboxElement);
    }

    public void selectModelYear(String year){

        WebElement modelYear = driver.findElement(By.xpath("//li[@aria-label=\"2023\"]//a"));
        waitForElement(modelYear);
        moveToElement(modelYear);
        mouseClick(modelYear);
    }

    public void selectCameraResolution(String cameraResolution){
        WebElement cameraResolutionCheckbox = driver.findElement(By.xpath("//li[@aria-label='"+cameraResolution+"']//input"));
        waitForElement(cameraResolutionCheckbox);
        moveToElement(cameraResolutionCheckbox);
        mouseClick(cameraResolutionCheckbox);
    }

    public void enterMinPriceRange(String minPriceRange){
        driver.findElement(minimumPriseRangeTextBoxLocator).sendKeys(minPriceRange);
    }

    public void enterMaxPriceRange(String maxPriceRange){
        driver.findElement(maximumPriseRangeTextBoxLocator).sendKeys(maxPriceRange);
    }

    public void clickOnGoButton(){
        WebElement GoButtonElement = driver.findElement(goButtonLocator);
        mouseClick(GoButtonElement);
    }

}
