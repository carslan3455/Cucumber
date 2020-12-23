
  #Ödev :  DB de bir city table ı oluşturunuz, bu db ye 5 tane şehir
  #ekleyiniz. Daha sonra Setup-> Cities deki şehirlerle karşılaştırınız.

Feature: Testing JDBC Cities

  Background:
    Given Navigate to website basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Cities page

  Scenario: Cities testing with JDBC

    Then Send the query  the database "SELECT * FROM city" and control match
                                    # ORDER BY id DESC