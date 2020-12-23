package Pages;

import Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class _Parent {

    /**
     * Bu dosya diğer bütün page ler için ortak click ve sendkeys
     * için ekleme, scroll ve clear gibi bütün işlemleri tek yereden
     * yapabilmek için eklendi.Bu class diğer pageler tarafından extend edilerek
     * kullanılacak. Böylece tüm pagelerdeki elemanların click ve sendkeys özelliği
     * hem bekleme hem scroll hem de clear özelliği kazanmış olacak.
     */


    WebDriver driver;
    WebDriverWait wait;

    public _Parent() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public void clickFuntion(WebElement element) {

        waitUntilClickable(element);// eleman clickable olana kadar bekle
        scrollToElement(element);  // eleman a kadar scroll yap
        element.click(); // click yap
    }


    public void sendKeysFuntion(WebElement element, String value) {

        waitUntilVisible(element); // eleman görünür olana kadar bekle
        scrollToElement(element); // eleman a kadar scroll yap
        element.clear();         // eleman clear yap
        element.sendKeys(value);// value gönder

    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void scrollToElement(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
     //   js.executeScript("window.scrollBy(0,1000)");

    }


    public void waiting (int ms){
        try {
            Thread.sleep(ms);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList){
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
        return elementList;
    }

    public void verifyElementContainsText(WebElement element, String text){
        waitUntilVisible(element);
        System.out.println(element.getText());
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

//    public void selectMetod(WebElement element,String value){
//
//        Select select = new Select(element);
//        select.selectByVisibleText(value);
//    }
}
