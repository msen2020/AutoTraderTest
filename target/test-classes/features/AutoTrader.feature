@smoke_test
Feature:


  @unit_test
  Scenario: User goes to Autotrader Website
    Given User is in Landing page
    Then Verify that "Browse by Make" are present
    Then Verify that "Browse by style" are present
    Then Verify that "Advance Search" are present
    And Verify that search button is present
    Then Verify that "Any Make" and "Any Model" is visible

  @integration_test
  Scenario: Entering the advanced search link
    Given User click "Advance search link" on the homepage
    Then User enters "30004" in the zip code textbox
    Then User select "certified" checkbox under "condition"
    Then Send User select convert "convertible" checkbox under "Style"
    Then User update year "2017" to "2020"
    Then User select "BMW" car from Match, Model and Trim Section
    Then User clicks Search Button
    Then User verifies that he is in the result page
    Then User verifies that he sees only "BMW" cars in listing
    Then display in console, the number of cars listed in result page

 #Here we use # hashtag to comment
#cntr+alt+l
  Scenario Outline: testing the multiple entry
    Given choose make as "<model>"
    Examples:
      | model    |
      | BMW      |
      | Audi     |
      | Mercedes |
      | Toyota   |
      | Acura    |
