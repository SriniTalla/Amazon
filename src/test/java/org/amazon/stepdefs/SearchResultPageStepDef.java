package org.amazon.stepdefs;

import pages.BasePage;
import pages.SearchResultPage;
import io.cucumber.java.en.Then;

public class SearchResultPageStepDef extends BasePage {


    private SearchResultPage searchResultPage = new SearchResultPage(driver);

    @Then("I can see list of products matching search criteria")
    public void i_can_see_list_of_phones() {
        searchResultPage.printProductSearchResult();

    }

    @Then("I can see only {string} products in the results")
    public void i_can_see_only_samsung_products_in_the_results(String brandName) {
      searchResultPage.verifyProductDisplayed(brandName);

    }
}
