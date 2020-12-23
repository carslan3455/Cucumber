


Feature: Country functionality

  #Senaryodaki adimlar otomatik Login.feature dan cektik
  @SmokeTest
  Scenario:
    Given Navigate to website basqar
    When Enter username and password and click Login button
    Then User should login successfully
    # country sayfasina git
    And Navigate to country page
    # Bir ulke creat et
    When Creat a country
    # Mesaji dogrula
    Then Success message should be displayed


