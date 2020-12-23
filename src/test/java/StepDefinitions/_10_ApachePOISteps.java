package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class _10_ApachePOISteps {

    DialogContent dialogContent = new DialogContent();

    @When("^User Create citizenship with ApachePOI$")
    public void userCreateCitizenshipWithApachePOI() {
        List<List<String >> list = ExcelUtility.getListData("src/main/resources/ApacheExcel1.xlsx", "testCitizen1",2);

        for (int i = 0; i < list.size(); i++) {

            dialogContent.findElementAndClickFunction("addBtn");
            dialogContent.findElementAndSendKeysFunction("nameInput", list.get(i).get(0));
            dialogContent.findElementAndSendKeysFunction("shortName", list.get(i).get(1));
            dialogContent.findElementAndClickFunction("saveBtn");
            dialogContent.findElementAndFindVerifyContainsText("msjContainer","successfully");

        }

    }

    @Then("^User delete citizenship with ApachePOI$")
    public void userDeleteCitizenshipWithApachePOI() {
        List<List<String >> list = ExcelUtility.getListData("src/main/resources/ApacheExcel1.xlsx", "testCitizen1",1);

        for (int i = 0; i < list.size(); i++) {
            dialogContent.editAndDeleteFunction(list.get(i).get(0), "delete");
            dialogContent.findElementAndClickFunction("yesBtn");

        }
    }
}
