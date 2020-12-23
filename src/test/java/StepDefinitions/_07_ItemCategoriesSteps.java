package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class _07_ItemCategoriesSteps {

    LeftNav leftNav = new LeftNav();
    DialogContent dialogContent = new DialogContent();

    @And("^Navigate to Categories page$")
    public void navigateToCategoriesPage() {
        leftNav.findElementAndClickFunction("inventory");
        leftNav.findElementAndClickFunction("inventorySetup");
        leftNav.findElementAndClickFunction("itemCategory");

    }

    @When("^User creat a item categories name as \"([^\"]*)\" user type as \"([^\"]*)\"$")
    public void userCreatAItemCategoriesNameAsUserTypeAs(String itemName, String userType)  {
        dialogContent.findElementAndClickFunction("addBtn");
        dialogContent.findElementAndSendKeysFunction("nameInput", itemName);
        dialogContent.findElementAndClickFunction("userTypeDropdown");
        dialogContent.findElementListSelect("userTypeAllOptions", userType);
        dialogContent.findElementAndClickFunction("saveBtn");

    }
}
