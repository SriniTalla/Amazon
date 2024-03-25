package org.amazon.stepdefs;

import io.cucumber.java.en.Given;
import pages.BasePage;
import pages.PhonesAndAccessoriesPage;

public class PhonesAndAccessoriesPageStepDef extends BasePage {

    private PhonesAndAccessoriesPage phonesAndAccessoriesPage = new PhonesAndAccessoriesPage(driver);

    @Given("I click on Mobile Phones & Smartphones")
    public void i_click_on_mobile_phones_smartphones() {
        phonesAndAccessoriesPage.clickOnMobileAndSmartPhoneLink();
    }

}
