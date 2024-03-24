package org.amazon.stepdefs;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.amazon.pages.BasePage;
import org.amazon.pages.LoginPage;
import org.amazon.pages.PhonesAndAccessoriesPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class PhonesAndAccessoriesPageStepDef extends BasePage {

    private PhonesAndAccessoriesPage phonesAndAccessoriesPage = new PhonesAndAccessoriesPage(driver);

    @Given("I click on Mobile Phones & Smartphones")
    public void i_click_on_mobile_phones_smartphones() {
        phonesAndAccessoriesPage.clickOnMobileAndSmartPhoneLink();
    }

}
