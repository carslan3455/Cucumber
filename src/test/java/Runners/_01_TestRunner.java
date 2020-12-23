package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Runner Classlar ne için kullanılır: Belirli veya grupladığımı testleri toplu olarak çalıştırma imkanı verir.
 * Bunun için;
 * 1- Java Class açılır.
 * 2- AbstractTestNGCucumberTests  extend alınır. Böylece RUN özelliği kazanır
 * 3- Class a   @CucumberOptions annotition  eklenerek , buraya parametreleri verilerek kullanılır.
 * Genel olarak TestNG deki XML  olarak düşünebilirsiniz.
 *
 * SmokeTest : En genel manada ana unsurlari test etme
 * RegressionTest : Butun birimlerin uyumlu sekilde calisma testi
 */

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"},   // buraya feature files in path verilecek
        glue = {"StepDefinitions"},      // Step definitions in klasoru yaziliyor
        dryRun = false   // true oldugunda testi calistirma, sadece feature lara ait steplerin varligini kontrol eder
                        // false oldugunda ise testi calistirir

)
public class _01_TestRunner extends AbstractTestNGCucumberTests {


}
