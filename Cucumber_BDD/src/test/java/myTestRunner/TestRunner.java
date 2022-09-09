package myTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features"//specify the folder name of feature
		,glue="stepDefinitions"//specify the package name of step definition	
		)
public class TestRunner {

}
