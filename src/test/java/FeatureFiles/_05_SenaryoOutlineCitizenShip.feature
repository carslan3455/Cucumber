Feature: Citizenship with senaryooutline

  Background:
    Given Navigate to website basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Citizenship page


  Scenario Outline: Citizenship create and delete with senaryo outline

    When User Create a Citizenship name as "<CitizenshipName>" short name as "<CitizenshipShortName>"
    Then Success message should be displayed

    When User Create a Citizenship name as "<CitizenshipName>" short name as "<CitizenshipShortName>"
    Then Error message should be displayed
    And Click on close button

    Then User delete the "<CitizenshipName>"
    Then Success message should be displayed


    Examples:
      | CitizenshipName | CitizenshipShortName |
      | Anadolum11       | Andl1                |
      | Anadolum22       | Andl2                |
      | Anadolum32       | Andl3                |

