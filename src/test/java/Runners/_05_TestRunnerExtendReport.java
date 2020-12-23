package Runners;


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

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
public class _05_TestRunnerExtendReport extends AbstractTestNGCucumberTests {


    @AfterClass
    public static void afterClass() {


        Reporter.loadXMLConfig("src/test/java/XMLFiles/extendReportSet.xml");
        //todo ayarlar alindi, cucumber extend reporttan haberi oldu
        Reporter.setSystemInfo("User Name", "Cigdem Arslan");
        Reporter.setSystemInfo("Application Name", "Basqar");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));  // Isletim sisteminin adini aliyor
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test execution Cucumber report"); // Rapordaki ozel baslik kismi


    }

}
