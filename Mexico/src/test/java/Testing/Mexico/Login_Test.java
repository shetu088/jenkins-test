package Testing.Mexico;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\SHRESSIN\\eclipse-workspace\\Mexico\\src\\main\\java\\features\\login.feature" 
, glue ="step_def" ,tags ="@Valid",monochrome = true , plugin = {"pretty"})
public class Login_Test {
	
	
	
	

}
