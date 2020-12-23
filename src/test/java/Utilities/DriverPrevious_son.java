package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverPrevious_son {

    /**
     * todo Interview  Sorusu
     *      Singleton driver nedir?
     *      Bütün projede ayni ve tek bir driverin kullanilmasidir...
     *      Wir benutzen nur ein driver im complate Project   ==>Deutsch
     */

    private static WebDriver driver;

    public static WebDriver getDriver(){

        if (driver==null){

//            WebDriverManager.chromedriver().setup();  // System.setProperty nin karsiligi chrome Driver set etmis olduk
//            driver = new ChromeDriver();


            // firefox icin de asagidaki sekilde yaziyoruz
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }

        return driver;
    }

    public static void quitDriver(){

        if (driver != null){
            driver.quit();      // acik kalan browserlari ciktiktan sonra temizle
            driver = null;      // cikarken secili browser temizliyoruz null esitleyerek. yoksa getDriver dusmez
        }


    }


}
