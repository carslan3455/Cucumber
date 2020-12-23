$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("_01_Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Senaryo ;"
    },
    {
      "line": 2,
      "value": "#1- siteyi açınız."
    },
    {
      "line": 3,
      "value": "#2- username ve password u gönderin ve Login butonuna tıklatın."
    },
    {
      "line": 4,
      "value": "#3- Login olduğunuzu doğrulayın."
    }
  ],
  "line": 7,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 417800,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 9,
      "value": "# username ve password girerek login dogrulama"
    }
  ],
  "line": 11,
  "name": "Login with valid username and password",
  "description": "",
  "id": "login-functionality;login-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@SmokeTest"
    },
    {
      "line": 10,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 13,
      "value": "# sitey ac - basqar a git"
    }
  ],
  "line": 14,
  "name": "Navigate to website basqar",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 16,
      "value": "# username ve password gir ve login butonuna tiklat"
    }
  ],
  "line": 17,
  "name": "Enter username and password and click Login button",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 19,
      "value": "# login oldugunu dogrula"
    }
  ],
  "line": 20,
  "name": "User should login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "_01_LoginSteps.navigate_to_website_basqar()"
});
formatter.result({
  "duration": 9797071900,
  "status": "passed"
});
formatter.match({
  "location": "_01_LoginSteps.enter_username_and_password_and_click_Login_button()"
});
formatter.result({
  "duration": 3293933100,
  "status": "passed"
});
formatter.match({
  "location": "_01_LoginSteps.user_should_login_successfully()"
});
formatter.result({
  "duration": 65900,
  "status": "passed"
});
formatter.after({
  "duration": 4280266700,
  "status": "passed"
});
formatter.uri("_02_Country.feature");
formatter.feature({
  "line": 4,
  "name": "Country functionality",
  "description": "",
  "id": "country-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 221100,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#Senaryodaki adimlar otomatik Login.feature dan cektik"
    }
  ],
  "line": 8,
  "name": "",
  "description": "",
  "id": "country-functionality;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Navigate to website basqar",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Enter username and password and click Login button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should login successfully",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "# country sayfasina git"
    }
  ],
  "line": 13,
  "name": "Navigate to country page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 14,
      "value": "# Bir ulke creat et"
    }
  ],
  "line": 15,
  "name": "Creat a country",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 16,
      "value": "# Mesaji dogrula"
    }
  ],
  "line": 17,
  "name": "Success message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "_01_LoginSteps.navigate_to_website_basqar()"
});
formatter.result({
  "duration": 7459930300,
  "status": "passed"
});
formatter.match({
  "location": "_01_LoginSteps.enter_username_and_password_and_click_Login_button()"
});
formatter.result({
  "duration": 3291312000,
  "status": "passed"
});
formatter.match({
  "location": "_01_LoginSteps.user_should_login_successfully()"
});
formatter.result({
  "duration": 22200,
  "status": "passed"
});
formatter.match({
  "location": "_02_CountrySteps.navigate_to_country_page()"
});
formatter.result({
  "duration": 1404443800,
  "status": "passed"
});
formatter.match({
  "location": "_02_CountrySteps.creat_a_country()"
});
formatter.result({
  "duration": 1432604700,
  "status": "passed"
});
formatter.match({
  "location": "_02_CountrySteps.success_message_should_be_displayed()"
});
formatter.result({
  "duration": 125798700,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:969)\r\n\tat org.testng.Assert.assertTrue(Assert.java:43)\r\n\tat org.testng.Assert.assertTrue(Assert.java:53)\r\n\tat Pages._Parent.verifyElementContainsText(_Parent.java:85)\r\n\tat Pages.DialogContent.findElementAndFindVerifyContainsText(DialogContent.java:215)\r\n\tat StepDefinitions._02_CountrySteps.success_message_should_be_displayed(_02_CountrySteps.java:38)\r\n\tat ✽.Then Success message should be displayed(_02_Country.feature:17)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 3650434600,
  "status": "passed"
});
formatter.uri("_06_Nationalities.feature");
formatter.feature({
  "line": 1,
  "name": "Nationalities functionality",
  "description": "",
  "id": "nationalities-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 158200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Navigate to website basqar",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter username and password and click Login button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Navigate to Nationalities page",
  "keyword": "And "
});
formatter.match({
  "location": "_01_LoginSteps.navigate_to_website_basqar()"
});
formatter.result({
  "duration": 6753026900,
  "status": "passed"
});
formatter.match({
  "location": "_01_LoginSteps.enter_username_and_password_and_click_Login_button()"
});
formatter.result({
  "duration": 3781587400,
  "status": "passed"
});
formatter.match({
  "location": "_01_LoginSteps.user_should_login_successfully()"
});
formatter.result({
  "duration": 52900,
  "status": "passed"
});
formatter.match({
  "location": "_06_NationalitiesSteps.navigateToNationalitiesPage()"
});
formatter.result({
  "duration": 1178339000,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Nationalities All functionality",
  "description": "",
  "id": "nationalities-functionality;nationalities-all-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Create a Nationality name as \"weblich\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Success message should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User edit the  \"weblich\"  to \"weblich2\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Success message should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User delete the \"weblich2\"",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Success message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "weblich",
      "offset": 30
    }
  ],
  "location": "_06_NationalitiesSteps.createANationalityNameAs(String)"
});
formatter.result({
  "duration": 1264852100,
  "status": "passed"
});
formatter.match({
  "location": "_02_CountrySteps.success_message_should_be_displayed()"
});
formatter.result({
  "duration": 350963700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "weblich",
      "offset": 16
    },
    {
      "val": "weblich2",
      "offset": 30
    }
  ],
  "location": "_03_CountryCreatEditDeleteSteps.user_edit_the_to(String,String)"
});
formatter.result({
  "duration": 6776103300,
  "status": "passed"
});
formatter.match({
  "location": "_02_CountrySteps.success_message_should_be_displayed()"
});
formatter.result({
  "duration": 443502600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "weblich2",
      "offset": 17
    }
  ],
  "location": "_03_CountryCreatEditDeleteSteps.user_delete_the(String)"
});
formatter.result({
  "duration": 6491403700,
  "status": "passed"
});
formatter.match({
  "location": "_02_CountrySteps.success_message_should_be_displayed()"
});
formatter.result({
  "duration": 397584700,
  "status": "passed"
});
formatter.after({
  "duration": 3183812700,
  "status": "passed"
});
});