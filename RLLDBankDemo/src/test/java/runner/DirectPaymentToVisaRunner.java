package runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features =  "C:\\Users\\Exam\\eclipse-workspace\\RLL Project\\RLLDBankDemo\\src\\test\\java\\features\\directPaymentToVisa.feature", glue = {
		"stepDefs" }, plugin = { "html:target/Cucumberreport_Login.html", "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/" })
public class DirectPaymentToVisaRunner {
	
	
	// A cucumber runner file is used to build a communication between your feature
		// files and step definition file
		// Whenever we have to run multiple features or multiple steps, then we use
		// Cucumber runner file.
		// Whenever have to generate reports , we will use cucumber runner file

		/*
		 * - cucumber report - Extent report - Cucumber reports in PDF format - HTML
		 * Reports - TestNG Reports
		 * 
		 * Various Cucumber options or properties :
		 * 
		 * features : comma separated paths to feature file. dryRun=true : It will check
		 * if every steps has an step definition method implemented or not glue : comma
		 * separated package names of step def. file plugin = pretty : Tags
		 * 
		 */

	

}
