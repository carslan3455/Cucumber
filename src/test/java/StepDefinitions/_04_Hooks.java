package StepDefinitions;

import Utilities.Driver;
import Utilities.ExcelUtility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _04_Hooks {
    // Hooks  => Bütün senaryolara kanca atar gibi, oncesinde ve sonrasinda calisiyor
    // todo bir projeye Hooks sonradan eklenirse proje ve pom dosyasi reload yapilmali.
    //  Yoksa hata veriyor...

    // Her senaryodan once calisiyor
    @Before
    public void before(Scenario scenario) {

        System.out.println("Senaryo Basladi");
        System.out.println("Senaryonun id si: " + scenario.getId());
        System.out.println("Senaryonun adi: " + scenario.getName());

    }

    // Her senaryodan sonra calisiyor
    @After  // bu Cucumber after ekran resmi bu kisimda almaliyiz
    public void after(Scenario scenario) {

        System.out.println("Senaryo bitti");
        System.out.println("Senaryonun sonucu: " + scenario.getStatus());


        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH mm ss");  // istedigim formati olusturdum
        String strDate = formatter.format(now);                 // suandaki zamani istedigim formata donusturdum
        System.out.println("Cevirmeden onceki hali: " + strDate);


        if (scenario.getStatus() == "failed") {

            // Senaryo adi202001011000  gibi her hata resmini anlik kaydetsin
            String scenarioName = scenario.getName();
            strDate = strDate.replace(":", " ");    // gelen tarih  bilgisindeki : karakterini bosalttim


            // todo Ekran kaydetme islemleri burada olacak...

            // 1. Asama Ekran goruntusu alma degiskenimizi tanimladik
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();

            // 2. Asama alinacak ekran goruntu dosyasi tipi secilerek hafizada olusturuldu
            File ekranDosyasi = ts.getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(ekranDosyasi, new File("target/FailedScreenShots/"
                        + Driver.threadBrowserName.get() + scenarioName + strDate + ".png"));

            } catch (IOException e) {
                e.printStackTrace();
            }


        }

        ExcelUtility.exceleYaz(scenario, strDate, Driver.threadBrowserName.get());

        // En son cikmadan ekrani gorelim diye koyduk.
        // Calisma mantigi ile ilgisi yok
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Driver.quitDriver();
    }
}
