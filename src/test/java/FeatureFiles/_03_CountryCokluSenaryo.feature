


Feature: Country Multi Scenario

  #Senaryolarda ayni olan ilk kisimlar Background olarak yazilabilir
  Background:
    Given Navigate to website basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to country page

  Scenario: Creat a country

    # Bir ulke creat et
    When Creat a country
    # Mesaji dogrula
    Then Success message should be displayed


  Scenario: Creat a country parameter data

    # Parametre ile  ulke creat ediyoruz
    When Creat a country name as "gerany1234" and code as "12345"
    # Mesaji dogrula
    Then Success message should be displayed