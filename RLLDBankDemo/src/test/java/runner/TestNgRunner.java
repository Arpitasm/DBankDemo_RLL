package runner;
//import org.testng.annotations.Listeners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import utilities.ITestlisteners;

@CucumberOptions(
        features = {"C:\\Users\\Exam\\eclipse-workspace\\RLL Project\\RLLDBankDemo\\src\\test\\java\\features\\directPaymentToVisa.feature",
                    },
        glue = {"stepDefs" },
        dryRun = false,
        plugin = {
            "pretty",
            "html:targettestng/cucumberreport_search.html",
            "json:targettestng/cucumber.json",
            "junit:targettestng/xmlReport.xml",
            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:\", \"timeline:test-output-thread/"
            
          
        },
        monochrome=true
)

//@Listeners(ITestlisteners.class)
public class TestNgRunner extends AbstractTestNGCucumberTests {
}