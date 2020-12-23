package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;


public class FormContent extends _Parent {

    List<WebElement> myList;
    WebElement myElement;

    public FormContent() {
        PageFactory.initElements(driver, this);
        myList = new ArrayList<>();
    }


    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[2]")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    private WebElement documentType;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    private WebElement option1;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    private WebElement option2;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
    private WebElement option3;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[4]")
    private WebElement option4;

    @FindBy(xpath = "//span[text()='Add']")
    private WebElement examsAddBtn;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='firstName']/input")
    private WebElement firstName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']/input")
    private WebElement lastName;

    @FindBy(xpath = "//span[text()='Gender']")
    private WebElement gender;

    @FindBy(xpath = "//span[text()='School Department']")
    private WebElement schoolDepartment;

    @FindBy(xpath = "//span[text()='Section']")
    private WebElement section;

    @FindBy(xpath = "//span[text()='Citizenship']")
    private WebElement citizienShip;

    @FindBy(xpath = "(//div[@class='mat-tab-label-content'])[2]")
    private WebElement representatives;

    @FindBy(xpath = "//ms-add-button[@class='ng-star-inserted']")
    private WebElement repAddBtn;

    @FindBy(xpath = "//span[text()='Representative']")
    private WebElement repSelect;

    @FindBy(xpath = "//input[@formcontrolname='firstName']")
    private WebElement repFirstName;

    @FindBy(xpath = "//input[@formcontrolname='lastName']")
    private WebElement repLastName;

    @FindBy(xpath = "//input[@formcontrolname='phone']")
    private WebElement repMobilPhone;

    @FindBy(xpath = "//span[text()=' Add ']")
    private WebElement repAddBtn2;

    @FindBy(xpath = "//span[text()='Document Type']")
    private WebElement studentDocumentType;

    @FindBy(xpath = "//input[@formcontrolname='documentNumber']")
    private WebElement studentDocumentNumber;


    @FindAll(
            {
                    @FindBy(xpath = "//tbody/tr/td[3]")
            }
    )
    private List<WebElement> studentNameList;

    @FindAll(
            {
                    @FindBy(xpath = "//ms-edit-button/button")
            }
    )
    private List<WebElement> studentEditBtnList;

    @FindAll(
            {
                    @FindBy(xpath = "//ms-delete-button/button")
            }
    )
    private List<WebElement> studentDeleteBtnList;

    @FindBy(css = "div[id='toast-container']")
    private WebElement msjContainer;

    @FindBy(xpath = "//span[text()=' Search ']")
    private WebElement searchBtn;


    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "academicPeriod":
                myElement = academicPeriod;
                break;
            case "gradeLevel":
                myElement = gradeLevel;
                break;
            case "documentType":
                myElement = documentType;
                break;
            case "option1":
                myElement = option1;
                break;
            case "option2":
                myElement = option2;
                break;
            case "option3":
                myElement = option3;
                break;
            case "option4":
                myElement = option4;
                break;
            case "examsAddBtn":
                myElement = examsAddBtn;
                break;
            case "saveBtn":
                myElement = saveBtn;
                break;
            case "gender":
                myElement = gender;
                break;
            case "schoolDepartment":
                myElement = schoolDepartment;
                break;
            case "section":
                myElement = section;
                break;
            case "citizienShip":
                myElement = citizienShip;
                break;
            case "representatives":
                myElement = representatives;
                break;
            case "repAddBtn":
                myElement = repAddBtn;
                break;
            case "repAddBtn2":
                myElement = repAddBtn2;
                break;
            case "repSelect":
                myElement = repSelect;
                break;
            case "studentDocumentType":
                myElement = studentDocumentType;
                break;
            case "searchBtn":
                myElement = searchBtn;
                break;

        }


        clickFuntion(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) {
            case "nameInput":
                myElement = nameInput;
                break;
            case "firstName":
                myElement = firstName;
                break;
            case "lastName":
                myElement = lastName;
                break;
            case "repFirstName":
                myElement = repFirstName;
                break;
            case "repLastName":
                myElement = repLastName;
                break;
            case "repMobilPhone":
                myElement = repMobilPhone;
                break;
            case "studentDocumentNumber":
                myElement = studentDocumentNumber;
                break;

        }


        sendKeysFuntion(myElement, value);
    }

    public void nameEditAndDeleteFunction(String firstName, String editOrDelete) {
        // bulundugu sayfadaki edit||delete list dolmasini bekletiyoruz
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//ms-edit-button/button"), 1));
        // yukarıdaki bölüm mesajlar kaybolmadan edit ve deleteye tıklatamıyordu ,
        // yukarıdaki kod ile bu eleman invisible olana kadar bekle dedik.


        // aşağıda editOrDelete den gelen edit veya delete kelimesine
        // göre hangi buton tipine tıklatılacaksa onun LİST i alınıyor.

        List<WebElement> btnList = new ArrayList<>();

        if (editOrDelete.equalsIgnoreCase("delete")) {
            btnList = studentDeleteBtnList;
        } else
            btnList = studentEditBtnList;

        // nameList içerisinde (table ın 2 stunundaki isimlerin olduğu
        // liste) ülke adı aranıyor. bulunduğunda o indexteki butona
        // (edit veya delete) tıklanarak. Dialog penceresi açılıyor.

        List<WebElement> nameListNew = waitVisibleListAllElement(studentNameList);
        System.out.println("FirstName: " + firstName);
        // sayfa yenilendiğinde isimler değişiyor, bu yüzden
        // tekrar bulması için süre eklendi.(stale problemini burası çözdü)
        for (int i = 0; i < nameListNew.size(); i++) {

            if (nameListNew.get(i).getText().contains(firstName)) {
                System.out.println(btnList.get(i));
//                clickFuntion(searchBtn);
                clickFuntion(btnList.get(i));
            }
        }
        waiting(2000);

    }

}
