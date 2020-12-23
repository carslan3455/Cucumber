package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Asagidaki opsionda calistirmak istedigimiz FEATURE fiellerin
 * pathleri verilerek sadece onöar calistirildi
 * HAngi FEATURE larin calisacagina features parametresine yazilan bolum karar veriyor
 * glue ise bunlara ait Step lerin lokasyonu gosterilir
 *
 * Asagidaki ornekte sadece _01_Login.feature  ve _09_EnteranceExams.feature calisacak
 */

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature","src/test/java/FeatureFiles/_09_EnteranceExams.feature"},
        glue = {"StepDefinitions"},
        dryRun = false

)
public class _02_TestRunnerBelirliTestler extends AbstractTestNGCucumberTests {


}
