@Search-Cars
Feature: Acceptance testing to validate Search Cars Page is working.
  In order to validate that 
  the Search Cars page is working
  Doing the Acceptance Testing

  Background: 
    Given I am on the Home Page "https://www.carsguide.com.au" of CarsGuide Website
    When I move to Car For Sale Menu
      | Menu        |
      | buy + Sell  |
      | Search cars |

  @Search-Cars-Positive
  Scenario: Validate Search Cars Page
    And click on "Search Cars" link
    And select carbrand as "BMW" from AnyMake dropdown
    And select "1 Series" as car model
    And select location as "ACT - All" from SelectLocation dropdown
    And select "$1,000" as price
    And click on Find_My_Next_Car button
    Then I should see list of searched cars
    And the page title should be "Bmw 1 Series Under 1000 for Sale ACT | carsguide"

		@Used-Cars
    Scenario: Validate used Cars Page
    And click on "Used Cars" link on Used car page
    And select carbrand as "Kia" from AnyMake dropdown on Used car page
    And select car model on Used car page
      | car model |
      | Carnival  |
      | Cerato    |
    And select location as "ACT - All" from SelectLocation dropdown on Used car page
    And select "$2,000" as price on Used car page
    And click on Find_My_Next_Car button on Used car page
    Then I should see list of searched cars on Used car page
    And the page title should be "Used Kia Carnival Under 2000 for Sale ACT | carsguide"