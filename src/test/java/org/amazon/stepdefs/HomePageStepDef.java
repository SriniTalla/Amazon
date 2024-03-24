package org.amazon.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.amazon.pages.BasePage;
import org.amazon.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class HomePageStepDef extends BasePage {

    private HomePage homePage = new HomePage(driver);

    @Given("I am on the Amazon home page")
    public void iAmOnTheAmazonHomePage() {
        driver.get("https://www.amazon.co.uk");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        try {
            driver.findElement(By.id("sp-cc-accept")).click();
        }catch (Exception e){

        }
    }

    @Given("I click on hamburger menu bar")
    public void i_click_on_hamburger_menu_bar() {
        homePage.clickHamBurger();
    }

    @And("I click on Electronics And Computers")
    public void i_click_on_electronics_And_Computers(){
        homePage.clickElectronics();

    }

    @And("I click on Phones and Accessories")
    public void i_click_on_phones_and_Accessories(){
        homePage.clickPhones();

    }

}
