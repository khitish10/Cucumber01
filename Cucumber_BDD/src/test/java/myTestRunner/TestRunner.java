package myTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="Features",//specify the folder name of feature
		features="C:/Users/khitish/git/repository4/Cucumber_BDD/Features/Hooks.feature",//provide complete path when there are multiple feature files
		glue="stepDefinitions",//specify the package name of step definition	
		
		dryRun=false,//verifies for each feature corresponding step definition is there or not(default value is false)
		monochrome=true,//gives detailed logs
		plugin={"pretty",
                "json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-report/cucumber.html"},//plugins generate reports in different formats
		//tags= "@SanityTest and @RegressionTest"//Use and/or to execute multiple features together
		//tags="not @SanityTest and @RegressionTest"//exculde Sanity , include Regression
		tags="not @SanityTest and not @RegressionTest"//exclude sanity and regression
		)
		
public class TestRunner {

}
