package org.amazon.stepdefs;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.amazon.pages.BasePage;
import org.amazon.pages.SmartPhonesPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class SmartPhonesPageStepDef extends BasePage {

    private SmartPhonesPage smartPhonesPage = new SmartPhonesPage(driver);

    @When("I select brand as {string}")
    public void i_select_brand_as(String brandName, Scenario scenario) {
       smartPhonesPage.selectBrand(brandName);
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] src = ts.getScreenshotAs(OutputType.BYTES);
        scenario.attach(src, "image/png", "screenshot");
    }
    @When("I select Camera Resolution as {string}")
    public void i_select_camera_resolution_as(String cameraResolution, Scenario scenario) {
        smartPhonesPage.selectCameraResolution(cameraResolution);
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] src = ts.getScreenshotAs(OutputType.BYTES);
        scenario.attach(src, "image/png", "screenshot");
    }
    @When("I select Model Year as {string}")
    public void i_select_model_year_as(String year, Scenario scenario) {
        smartPhonesPage.selectModelYear(year);
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] src = ts.getScreenshotAs(OutputType.BYTES);
        scenario.attach(src, "image/png", "screenshot");
    }
    @When("I select Price Range between £{string} to £{string}")
    public void i_select_price_range_between_£_to_£(String minPriceRange, String maxPriceRange) {
        smartPhonesPage.enterMinPriceRange(minPriceRange);
        smartPhonesPage.enterMaxPriceRange(maxPriceRange);
    }
    @And("I click on Go button")
    public void I_click_on_go_button(Scenario scenario){
        smartPhonesPage.clickOnGoButton();
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] src = ts.getScreenshotAs(OutputType.BYTES);
        scenario.attach(src, "image/png", "screenshot");
    }

}
