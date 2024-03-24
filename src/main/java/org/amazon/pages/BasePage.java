package org.amazon.pages;

import io.cucumber.messages.types.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public static WebDriver driver;

    public WebElement waitForElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
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
