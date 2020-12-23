package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _05_CitizenshipSteps {

    LeftNav leftNav=new LeftNav();
    DialogContent dialogContent=new DialogContent();

    @And("^Navigate to Citizenship page$")
    public void navigateToCitizenshipPage() {

        leftNav.findElementAndClickFunction("setupOne");
        leftNav.findElementAndClickFunction("parameters");
        leftNav.findElementAndClickFunction("citizenships");
    }

    @When("^User Create a Citizenship name as \"([^\"]*)\" short name as \"([^\"]*)\"$")
    public void userCreateACitizenshipNameAsShortNameAs(String name, String shortname) {

        dialogContent.findElementAndClickFunction("addBtn");
        dialogContent.findElementAndSendKeysFunction("nameInput", name);
        dialogContent.findElementAndSendKeysFunction("shortName", shortname);
        dialogContent.findElementAndClickFunction("saveBtn");
    }

    @Then("^Error message should be displayed$")
    public void errorMessageShouldBeDisplayed() {
        dialogContent.findElementAndFindVerifyContainsText("errorMessage","Error");

    }


    @And("^Click on close button$")
    public void clickOnCloseButton() {
        dialogContent.findElementAndClickFunction("closeDialog");
    }

    @And("^Navigate to Cities page$")
    public void navigateToCitiesPage() {
        leftNav.findElementAndClickFunction("setupOne");
        leftNav.findElementAndClickFunction("parameters");
        leftNav.findElementAndClickFunction("cities");

    }
}
