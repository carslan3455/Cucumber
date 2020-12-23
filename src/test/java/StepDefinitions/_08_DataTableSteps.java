package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class _08_DataTableSteps {

    DialogContent dialogContent = new DialogContent();
    LeftNav leftNav = new LeftNav();

    @And("^Click on the element in the content class$")
    public void clickOnTheElementInTheContentClass(DataTable elements) {

        List<String > elementsToClick = elements.asList(String.class);
        for (int i = 0; i < elementsToClick.size(); i++) {

            System.out.println(  elementsToClick.get(i)  );
            dialogContent.findElementAndClickFunction(elementsToClick.get(i));

        }
    }

    @And("^Click on the element in the left class$")
    public void clickOnTheElementInTheLeftClass(DataTable elements) {
        List<String > elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            System.out.println(  elementsToClick.get(i)  );
            leftNav.findElementAndClickFunction(elementsToClick.get(i));

        }
    }

    @When("^User sending the keys in the dialog content class$")
    public void userSendingTheKeysInTheDialogContentClass(DataTable elements) {

        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {

            System.out.println(elementsNameAndValue.get(i).get(0));   // elemanin adi
            System.out.println(elementsNameAndValue.get(i).get(1));   // gonderilecek deger value

//            |nameInput|yeniBirDunya|   -->  elementsNameAndValue.get(i).get(0)
//            |codeInput|3455|           -->  elementsNameAndValue.get(i).get(1)
        dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(1));


        }

    }



}
