Feature: Amazon Search

  As a user of the Amazon website
  I want to list all the Samsung phones
  With specifications: Camera Resolution - 20 MP and above, Model Year – 2023, Price Range between £200 - £250
  So I can purchase the phone

  Scenario: List all the Samsung phones with specification as Camera Resolution - 20 MP and above, Model Year – 2023 & Price Range between £50 - £100
    Given I am on the Amazon home page
    And I click on hamburger menu bar
    And I click on Electronics And Computers
    And I click on Phones and Accessories
    And I click on Mobile Phones & Smartphones
    When I select brand as "Samsung"
    And I select Camera Resolution as "20 MP & above"
    And I select Model Year as "2023"
    And I select Price Range between £"200" to £"250"
    And I click on Go button
    Then I can see list of products matching search criteria
    And I can see only "Onida" products in the results




