Feature: Amazon Search

  As a user of the Amazon website
  I want to list all the Samsung phones
  With specifications: Camera Resolution - 20 MP and above, Model Year – 2023, Price Range between £200 - £250
  So I can purchase the phone

  Scenario Outline: List all the Samsung phones with specification as Camera Resolution - 20 MP and above, Model Year – 2023 & Price Range between £200 - £250
    Given I am on the Amazon home page
    And I click on hamburger menu bar
    And I click on Electronics And Computers
    And I click on Phones and Accessories
    And I click on Mobile Phones & Smartphones
    When I select brand as "<brandName>"
    And I select Camera Resolution as "<cameraResolution>"
    And I select Model Year as "<modelYear>"
    And I select Price Range between £"<minPrice>" to £"<maxPrice>"
    And I click on Go button
    Then I can see list of products matching search criteria
    And I can see only "<expectedBrand>" products in the results
    Examples:
    |brandName|cameraResolution|modelYear|minPrice|maxPrice|expectedBrand|
    |Samsung         |20 MP & above|2023 |200     |250     |Samsung      |
    |Samsung         |20 MP & above|2023 |200     |250     |Iphone      |





