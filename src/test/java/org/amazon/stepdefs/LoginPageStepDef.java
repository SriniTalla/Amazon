package org.amazon.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BasePage;
import pages.LoginPage;
import org.openqa.selenium.By;

import java.time.Duration;

public class LoginPageStepDef extends BasePage{

    private LoginPage loginPage = new LoginPage(driver);

    @Given("I am on the Amazon login page")
    public void i_am_on_the_amazon_login_page() {
        driver.get("https://www.amazon.co.uk/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }

    @Given("I have entered a valid username and password")
    public void i_have_entered_a_valid_username_and_password() {
        loginPage.clickSignIn();
        loginPage.enterEmail("TestUser@yahoo.com");
        loginPage.clickContinueButton();
        loginPage.enterPassword("Vihaan@1009");
    }

    @When("I click on the signin button")
    public void i_click_on_the_signin_button() {
        loginPage.clickSignInButton();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {

        Assert.assertTrue(loginPage.checkSignInConfirmation());
    }

    @Given("I have entered invalid {string}")
    public void i_have_entered_invalid_username(String username) {
        loginPage.enterEmail(username);
    }

    @When("I click on the continue button")
    public void i_click_on_the_continue_button() {
        loginPage.clickContinueButton();
    }

    @Then("I should see an error message indicating {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")).isDisplayed(),true);
    }
}
