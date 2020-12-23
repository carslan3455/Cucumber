package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends _Parent{

    public LeftNav() {

        PageFactory.initElements(driver,this);
    }

    WebElement myElement;

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement country;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationality;

    @FindBy(xpath = "//span[text()='Cities']")
    private WebElement cities;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenships;

    @FindBy(xpath = "//span[text()='Inventory']")
    private WebElement inventory;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement inventorySetup;

    @FindBy(xpath = "//span[text()='Item Categories']")
    private WebElement itemCategory;

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    private WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsParent;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement entranceExamsSetup;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsChild;


    @FindBy(xpath = "//span[text()='Student']")
    private WebElement studentParent;

    @FindBy(xpath = "//span[text()='Students']")
    private WebElement studentsChild ;



    public void findElementAndClickFunction(String elementName) {
        /**
         * Buraya sadece tiklanacak butonun adi gonderilecek
         * Burada hangi eleman oldugu bulunuyor
         * ve tiklaniyor
         */
        switch (elementName) {
            case "setupOne":
                myElement = setupOne;
                break;
            case "parameters":
                myElement = parameters;
                break;
            case "country":
                myElement = country;
                break;
            case "cities":
                myElement = cities;
                break;
            case "citizenships":
                myElement = citizenships;
                break;
            case "nationality":
                myElement = nationality;
                break;
            case "inventory":
                myElement = inventory;
                break;
            case "inventorySetup":
                myElement = inventorySetup;
                break;
            case "itemCategory":
                myElement = itemCategory;
                break;
            case "fees":
                myElement = fees;
                break;
            case "entranceExamsParent":
                myElement = entranceExamsParent;
                break;
            case "entranceExamsSetup":
                myElement = entranceExamsSetup;
                break;
            case "entranceExamsChild":
                myElement = entranceExamsChild;
                break;
            case "studentParent":
                myElement = studentParent;
                break;
            case "studentsChild ":
                myElement = studentsChild ;
                break;
        }

        clickFuntion(myElement);
    }


}
