Feature: Nationalities functionality

  Background:
    Given Navigate to website basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Nationalities page


  Scenario: Create Nationalities
    Then Create a Nationality name as "weblich"
    Then Success message should be displayed

  Scenario: Edit Nationalities
    Then User edit the  "weblich"  to "weblich2"
    Then Success message should be displayed

  Scenario: Delete Nationalities
    Then User delete the "weblich2"
    Then Success message should be displayed

  @SmokeTest
  Scenario: Nationalities All functionality
    Then Create a Nationality name as "weblich"
    Then Success message should be displayed
    Then User edit the  "weblich"  to "weblich2"
    Then Success message should be displayed
    Then User delete the "weblich2"
    Then Success message should be displayed