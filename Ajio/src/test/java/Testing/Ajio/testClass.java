package Testing.Ajio;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\SHRESSIN\\eclipse-workspace\\Ajio\\src\\main\\java\\feature\\test.feature" ,
glue="stepdef" , monochrome = true , plugin = {"pretty", "html:target/index.html"})
public class testClass {

}
