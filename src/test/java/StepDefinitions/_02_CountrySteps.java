package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class _02_CountrySteps {


    DialogContent dialogContent = new DialogContent();
    LeftNav leftNav = new LeftNav();


    @Then("^Navigate to country page$")
    public void navigate_to_country_page()  {

        leftNav.findElementAndClickFunction("setupOne");
        leftNav.findElementAndClickFunction("parameters");
        leftNav.findElementAndClickFunction("country");

    }

    @When("^Creat a country$")
    public void creat_a_country(){
        dialogContent.findElementAndClickFunction("addBtn");
        // her teset icin value degistirmemiz lazim
        dialogContent.findElementAndSendKeysFunction("nameInput","Gsakfldyy49");
        dialogContent.findElementAndSendKeysFunction("codeInput","0490");
        dialogContent.findElementAndClickFunction("saveBtn");


    }

    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed()  {
        dialogContent.findElementAndFindVerifyContainsText("msjContainer","successfully");

    }

    @When("^Creat a country name as \"([^\"]*)\" and code as \"([^\"]*)\"$")
    public void creat_a_country_name_as_and_code_as(String name, String code)  {
        dialogContent.findElementAndClickFunction("addBtn");
        dialogContent.findElementAndSendKeysFunction("nameInput",name);
        dialogContent.findElementAndSendKeysFunction("codeInput",code);
        dialogContent.findElementAndClickFunction("saveBtn");



    }



}
