package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Asagidaki secenekde tags eklendi icinde grup adina
 * sahip senaryolar calistiralacak sadece tum senaryolardan
 * tags etiketi sinirlama yapti sadece bu etikete veya grup adina sahip olanlar calisacak.
 */

@CucumberOptions(
        tags = {"@SmokeTest"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        dryRun = false

)
public class _03_TestRunnerSmoke extends AbstractTestNGCucumberTests {


}
