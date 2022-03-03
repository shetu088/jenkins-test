package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstep {
	
	public static WebDriver driver ;
	
	@Given("user is on login page")
	public void user_is_on_login_page()
	{
		System.setProperty("webdriver.driver.chrome","C:\\Users\\SHRESSIN\\eclipse-workspace\\cucumber\\chromedriver.exe");
		driver = new ChromeDriver();
	    
	}

	@When("user enters <username> & <password>")
	public void user_enters_username_password() {
	   
	}
	
	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() 
	{
	   
	}
	
	@Then("user is on home Page")
	public void user_is_on_home_page() 
	{
	    
	}




}
