package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//cucumber->  TestNG, junit

@CucumberOptions(features="C:\\Users\\manishng8\\eclipse-workspace\\selenium\\src\\test\\java\\feature\\practice.feature"
,glue="stepDefinitions",
monochrome=true, tags = "", plugin= {"html:target/cucumber.html"})

public class TestNGTestRunner extends AbstractTestNGCucumberTests{
 
	
}
