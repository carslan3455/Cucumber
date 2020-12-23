Feature: Testing JDBC Country

  Background:
    Given Navigate to website basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to country page

  Scenario: Country testing with JDBC

    Then Send the query  the database "SELECT * FROM country ORDER BY id DESC" and control match


