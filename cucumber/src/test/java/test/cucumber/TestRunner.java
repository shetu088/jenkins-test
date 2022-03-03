package test.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\SHRESSIN\\eclipse-workspace\\cucumber\\src\\test\\java\\feature\\login.feature" , 
glue ="stepdef" , dryRun=false , monochrome = true , plugin = {"pretty", "html:target/index.html" , "json:target/cucumber.json"})
public class TestRunner {

}
