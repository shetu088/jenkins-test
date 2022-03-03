package test.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\SHRESSIN\\eclipse-workspace\\cucumber\\src\\test\\java\\feature\\shopperstoplogin.feature"
, glue = "shopperstop" , monochrome = true , plugin= {"pretty"})
 public class shopperstopRunner
  {

	
  }
