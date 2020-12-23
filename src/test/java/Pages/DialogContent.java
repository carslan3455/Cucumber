package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class DialogContent extends _Parent {
    WebElement myElement;
    List<WebElement> myList;
    WebDriverWait wait = new WebDriverWait(driver, 5);

    public DialogContent() {
        PageFactory.initElements(driver, this);
        myList = new ArrayList<>();

    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginBtn;

    @FindBy(linkText = "Got it!")
    private WebElement gotItBtn;

    @FindAll(
            {
                    @FindBy(linkText = "Got it!")
            }
    )
    private List<WebElement> gotItBtnss;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    // bu sekilde de oluyor//ms-save-button//button
    // bu sekilde de oluyor//ms-save-button[@class='ng-star-inserted']/button
    private WebElement saveBtn;

    @FindBy(css = "div[id='toast-container']")
    private WebElement msjContainer;

    @FindAll(
            {
                    @FindBy(css = "div[id='toast-container']")
            }
    )
    private List<WebElement> msjContainerList;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement errorMessage;

    @FindAll(
            {
                    @FindBy(xpath = "//table/tbody/tr/td[2]")
            }
    )
    public List<WebElement> nameList;

    @FindAll(
            {
                    @FindBy(xpath = "//ms-edit-button/button")
            }
    )
    private List<WebElement> editBtnList;

    @FindAll(
            {
                    @FindBy(xpath = "//ms-delete-button/button")
            }
    )
    private List<WebElement> deleteBtnList;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortName;

    @FindBy(css = "button[aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement searchNameInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//input[@class='mat-autocomplete-trigger mat-chip-input mat-input-element']")
    private WebElement userTypeDropdown;

    @FindAll({
            @FindBy(xpath = "//mat-option[@class='mat-option mat-focus-indicator ng-star-inserted']")
    })
    private List<WebElement> userTypeAllOptions;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']/input")
    private WebElement integrationCode;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='priority']/input")
    private WebElement priority;




    public void findElementAndClickFunction(String elementName) {
        /**
         * Buraya sadece tiklanacak butonun adi gonderilecek
         * Burada hangi eleman oldugu bulunuyor
         * ve tiklaniyor
         */
        switch (elementName) {
            case "loginBtn":
                myElement = loginBtn;
                break;
            case "gotItBtn":
                // got it coklu olarak liste attik
                // eger gercekten yok ise size 0 oldugu icin gececek
                // 0 dan farkli ise islemi surdurecek
                // bekletmeye düşmesin diye fonksiyonu geri gönderdik.
                if (gotItBtnss.size() == 0)
                    return;
                myElement = gotItBtn;
                break;
            case "addBtn":
                myElement = addBtn;
                break;
            case "saveBtn":
                myElement = saveBtn;
                break;
            case "yesBtn":
                myElement = yesBtn;
                break;

            case "closeDialog":
                myElement = closeDialog;
                break;
            case "searchButton":
                myElement = searchButton;
                break;
            case "userTypeDropdown":
                myElement = userTypeDropdown;
                break;


        }

        clickFuntion(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName, String value) {
        /**
         * Buraya input yapilacak elemnt adi gonderilecek
         * Burada hangi eleman oldugu bulunuyor
         * ve value yollaniyor
         */
        switch (elementName) {
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
            case "nameInput":
                myElement = nameInput;
                break;
            case "codeInput":
                myElement = codeInput;
                break;
            case "shortName":
                myElement = shortName;
                break;
            case "searchNameInput":
                myElement = searchNameInput;
                break;
            case "integrationCode":
                myElement = integrationCode;
                break;
            case "priority":
                myElement = priority;
                break;
        }

        sendKeysFuntion(myElement, value);
    }

    public void findElementAndFindVerifyContainsText(String elementName, String mesaj) {
        switch (elementName) {
            case "msjContainer":
                myElement = msjContainer;
                break;
            case "errorMessage":
                myElement = errorMessage;
                break;

        }

        verifyElementContainsText(myElement, mesaj);

    }

    public void editAndDeleteFunction(String countryName, String editOrDelete) {
        // bazi yerlerde kod islerken mesaj kutucugu olmadigi icin hata veriyordu. Ondan kurtulmak icin bu kodu yazdik
        if (msjContainerList.size() > 0) {
            if (msjContainer.isDisplayed())
                wait.until(ExpectedConditions.invisibilityOfAllElements(msjContainer));
        }
        // yukarıdaki bölüm mesajlar kaybolmadan edit ve deleteye tıklatamıyordu ,
        // yukarıdaki kod ile bu eleman invisible olana kadar bekle dedik.


        // aşağıda editOrDelete den gelen edit veya delete kelimesine
        // göre hangi buton tipine tıklatılacaksa onun LİST i alınıyor.

        List<WebElement> btnList = new ArrayList<>();

        if (editOrDelete.equalsIgnoreCase("delete")) {
            btnList = waitVisibleListAllElement(deleteBtnList);
        } else
            btnList = waitVisibleListAllElement(editBtnList);

        // nameList içerisinde (table ın 2 stunundaki isimlerin olduğu
        // liste) ülke adı aranıyor. bulunduğunda o indexteki butona
        // (edit veya delete) tıklanarak. Dialog penceresi açılıyor.

        List<WebElement> nameListNew = waitVisibleListAllElement(nameList);
        // sayfa yenilendiğinde isimler değişiyor, bu yüzden
        // tekrar bulması için süre eklendi.(stale problemini burası çözdü)
        for (int i = 0; i < nameListNew.size(); i++) {

            if (nameListNew.get(i).getText().equalsIgnoreCase(countryName)) {
                clickFuntion(btnList.get(i));
            }
        }
        waiting(2000);

    }

    public void findElementListSelect(String elementName, String options) {

        switch (elementName) {
            case "userTypeAllOptions":
                myList = userTypeAllOptions;
                break;
        }

        wait.until(ExpectedConditions.visibilityOfAllElements(myList));
        for (WebElement element : myList) {
            if (element.getText().contains(options)) {
                System.out.println(element.getText());
                element.click();
                break;
            }

        }


    }

}
