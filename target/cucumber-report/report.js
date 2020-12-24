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
  "duration": 313600,
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
  "duration": 9555910700,
  "status": "passed"
});
formatter.match({
  "location": "_01_LoginSteps.enter_username_and_password_and_click_Login_button()"
});
formatter.result({
  "duration": 1220495500,
  "status": "passed"
});
formatter.match({
  "location": "_01_LoginSteps.user_should_login_successfully()"
});
formatter.result({
  "duration": 46500,
  "status": "passed"
});
formatter.after({
  "duration": 4805150000,
  "status": "passed"
});
formatter.uri("_04_CountryCreateEditDelete.feature");
formatter.feature({
  "line": 4,
  "name": "Country Creat Edit Delete Functionality",
  "description": "",
  "id": "country-creat-edit-delete-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 122300,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 6,
      "value": "#Senaryolarda ayni olan ilk kisimlar Background olarak yazilabilir"
    }
  ],
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "Navigate to website basqar",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Enter username and password and click Login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Navigate to country page",
  "keyword": "And "
});
formatter.match({
  "location": "_01_LoginSteps.navigate_to_website_basqar()"
});
formatter.result({
  "duration": 7334431300,
  "status": "passed"
});
formatter.match({
  "location": "_01_LoginSteps.enter_username_and_password_and_click_Login_button()"
});
formatter.result({
  "duration": 3818531100,
  "status": "passed"
});
formatter.match({
  "location": "_01_LoginSteps.user_should_login_successfully()"
});
formatter.result({
  "duration": 84400,
  "status": "passed"
});
formatter.match({
  "location": "_02_CountrySteps.navigate_to_country_page()"
});
formatter.result({
  "duration": 1647827700,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Create a country",
  "description": "",
  "id": "country-creat-edit-delete-functionality;create-a-country",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Creat a country name as \"ISS35\" and code as \"00000\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Success message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ISS35",
      "offset": 25
    },
    {
      "val": "00000",
      "offset": 45
    }
  ],
  "location": "_02_CountrySteps.creat_a_country_name_as_and_code_as(String,String)"
});
formatter.result({
  "duration": 1319715400,
  "status": "passed"
});
formatter.match({
  "location": "_02_CountrySteps.success_message_should_be_displayed()"
});
formatter.result({
  "duration": 334449600,
  "status": "passed"
});
formatter.after({
  "duration": 3180466400,
  "status": "passed"
});
});