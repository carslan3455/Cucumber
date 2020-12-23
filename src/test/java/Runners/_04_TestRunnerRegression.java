package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Asagidaki secenekde tags eklendi icinde grup adina
 * sahip senaryolar calistiralacak sadece tum senaryolardan
 * tags etiketi sinirlama yapti sadece bu etikete veya grup adina sahip olanlar calisacak.
 * plugin kısmı ise basit rapor oluşturan kısım
 * "html:target/cucumber-report" : target klasörünün altında cucumber-report un
 * altında basit bir rapor oluşturacak.
 *
 * "json:target/cucumber.json" : aynı raporu JSON formatında oluşturacak.
 */

@CucumberOptions(
        tags = {"@RegressionTest"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        dryRun = false,
        plugin = {  // basit rapor olusturan plugin
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        }
)
public class _04_TestRunnerRegression extends AbstractTestNGCucumberTests {

}
