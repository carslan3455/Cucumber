Feature: ApachePOI Citizen Functionality
  Background:
    Given Navigate to website basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Citizenship page

  Scenario: Creat and delete citizenship from Excel
    When User Create citizenship with ApachePOI
    Then User delete citizenship with ApachePOI


