package org.amazon.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import pages.BasePage;
import pages.HomePage;
import org.openqa.selenium.By;

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
