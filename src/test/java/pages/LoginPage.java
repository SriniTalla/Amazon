package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{


    //By Locators
    private By signInLocator = By.id("nav-link-accountList-nav-line-1");
    private By emailInputLocator = By.id("ap_email");
    private By continueButtonLocator = By.id("continue");
    private By passwordInputLocator = By.id("ap_password");
    private By signInButtonLocator = By.id("signInSubmit");
    private By forgotPasswordLinkLocator = By.linkText("Forgot Password");
    private By signInConfirmationLocator = By.id("nav-link-accountList-nav-line-1");

    //Constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Page Methods/Actions
    public void clickSignIn(){
        WebElement signIn = driver.findElement(signInLocator);
        signIn.click();
    }

    public void enterEmail(String email){
        WebElement emailInput = driver.findElement(emailInputLocator);
        emailInput.sendKeys(email);
    }

    public void clickContinueButton(){
        WebElement continueButton = driver.findElement(continueButtonLocator);
        continueButton.click();
    }

    public void enterPassword(String password){
        WebElement passwordInput = driver.findElement(passwordInputLocator);
        passwordInput.sendKeys(password);
    }

    public void clickForgotPassword(){
        WebElement forgotPassword = driver.findElement(forgotPasswordLinkLocator);
        forgotPassword.click();
    }

    public boolean checkForgotPasswordLink(){
        return driver.findElement(forgotPasswordLinkLocator).isDisplayed();
    }

    public void clickSignInButton(){
        WebElement signInButton = driver.findElement(signInButtonLocator);
        signInButton.click();
    }

    public boolean checkSignInConfirmation(){
        return driver.findElement(signInConfirmationLocator).isDisplayed();
    }

    public String getForgotPasswordPageUrl(){
        String forgotPasswordPageUrl = driver.getCurrentUrl();
        return forgotPasswordPageUrl;
    }

}
