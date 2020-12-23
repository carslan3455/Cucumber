#Senaryo ;
#1- siteyi açınız.
#2- username ve password u gönderin ve Login butonuna tıklatın.
#3- Login olduğunuzu doğrulayın.


Feature: Login Functionality

    # username ve password girerek login dogrulama
  @SmokeTest @RegressionTest
  Scenario: Login with valid username and password

    # sitey ac - basqar a git
    Given Navigate to website basqar

    # username ve password gir ve login butonuna tiklat
    When Enter username and password and click Login button

    # login oldugunu dogrula
    Then User should login successfully


# Gherkin dilinde 4 kelime var  Given, When , And , Then
  #Senaryonun adimlarini manali bir sekilde birbirine baglamak icin kullaniliyor
  #Baska hic bir onemi yok, hic bir seyi etkilemiyor.
  #Amac : Teknik olmayan personelin senaryoya bakarak testin ne yaptigini anlamasi

#  driver.get("https://test.basqar.techno.study/");
# daulet2030@gmail.com
# TechnoStudy123@

