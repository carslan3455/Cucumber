


Feature: Country Creat Edit Delete Functionality

     #Senaryolarda ayni olan ilk kisimlar Background olarak yazilabilir
  Background:
    Given Navigate to website basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to country page

  @RegressionTest
  Scenario: Create a country
    When Creat a country name as "ISS35" and code as "00000"
    Then Success message should be displayed


  Scenario: Edit a country
    When User edit the  "ISS35"  to "IA3449"
    Then Success message should be displayed

  Scenario: Delete a country
    When User delete the "IA3449"
    Then Success message should be displayed

