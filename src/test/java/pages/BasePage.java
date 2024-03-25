package pages;

import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.logging.Logger;

public class BasePage {

    public static WebDriver driver;
    public static Scenario scenario;
    public WebElement waitForElement(WebElement element){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void mouseClick(WebElement clickable){

        new Actions(driver)
                .click(clickable)
                .perform();
    }

    public WebElement moveToElement(WebElement element){

        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        return element;
    }


}
