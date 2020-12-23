package Runners;

import Utilities.Driver;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = {"@RegressionTest"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        dryRun = false,
        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
                // todo (listener = gozlemci ) olusturulacak raporun yeri ve adi

                //  to generate a extend report we need this plugin
        }

)
public class _06_TestRunnerCrossBrowser extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browser")
    public static void beforeClass(String browser){
        Driver.threadBrowserName.set(browser);


    }

    @AfterClass
    public static void afterClass(){

        Reporter.loadXMLConfig("src/test/java/XMLFiles/extendReportSet.xml");
        //todo ayarlar alindi, cucumber extend reporttan haberi oldu
        Reporter.setSystemInfo("User Name","Cigdem Arslan");
        Reporter.setSystemInfo("Application Name","Basqar");
        Reporter.setSystemInfo("Operating System Info",System.getProperty("os.name"));  // Isletim sisteminin adini aliyor
        Reporter.setSystemInfo("Department","QA");
        Reporter.setTestRunnerOutput("Test excetuion Cucumber report"); // Rapordaki ozel baslik kismi



    }

}
