package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage  extends BasePage{

    //By Locators
    private By hamBurgerLocator = By.id("nav-hamburger-menu");
    private By electronicsAndComputers = By.xpath("//a/div[text()='Electronics & Computers']");
    private By phoneAndAccessories = By.xpath("//li/a[text()='Phones & Accessories']");

    //Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Page Methods/Actions
    public void clickHamBurger(){
        WebElement hamBurger = driver.findElement(hamBurgerLocator);
        hamBurger.click();
    }

    public void clickElectronics(){
        WebElement electronics = driver.findElement(electronicsAndComputers);
        waitForElement(electronics).click();

    }

    public void clickPhones(){
        WebElement phones = driver.findElement(phoneAndAccessories);
        waitForElement(phones);
        mouseClick(phones);
    System.out.println("testing");

    }
}
