package org.amazon.stepdefs;

import io.cucumber.java.en.And;
import pages.BasePage;
import pages.SmartPhonesPage;
import io.cucumber.java.en.When;

public class SmartPhonesPageStepDef extends BasePage {

    private SmartPhonesPage smartPhonesPage = new SmartPhonesPage(driver);

    @When("I select brand as {string}")
    public void i_select_brand_as(String brandName) {
       smartPhonesPage.selectBrand(brandName);
    }
    @When("I select Camera Resolution as {string}")
    public void i_select_camera_resolution_as(String cameraResolution) {
        smartPhonesPage.selectCameraResolution(cameraResolution);

    }
    @When("I select Model Year as {string}")
    public void i_select_model_year_as(String year) {
        smartPhonesPage.selectModelYear(year);
    }
    @When("I select Price Range between £{string} to £{string}")
    public void i_select_price_range_between_£_to_£(String minPriceRange, String maxPriceRange) {
        smartPhonesPage.enterMinPriceRange(minPriceRange);
        smartPhonesPage.enterMaxPriceRange(maxPriceRange);
    }
    @And("I click on Go button")
    public void I_click_on_go_button(){
        smartPhonesPage.clickOnGoButton();

    }

}
