package shopperstop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginOnShopperStop {
	
	public static WebDriver driver;
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		

		System.setProperty("webdriver.driver.chrome","C:\\Users\\SHRESSIN\\eclipse-workspace\\cucumber\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.shoppersstop.com/#login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	    
	}


	

	@Then("click on the sign in with email")
	public void click_on_the_sign_in_with_email() {
	   
		driver.findElement(By.xpath("//*[@id=\"member-scroller\"]/div/div[1]/div[1]/div/a")).click();
	}
	@Then("user enters the {string} & {string}")
	public void user_enters_the(String email, String pass) {
		
		driver.findElement(By.id("j_username")).sendKeys(email);
		driver.findElement(By.id("j_password")).sendKeys(pass);
	    
	}
	@Then("click on the Sign in button")
	public void click_on_the_sign_in_button() {
		
		driver.findElement(By.xpath("//*[@id=\"loginajax\"]")).click();
	   
	}
	@And("user is able to login")
	public void user_is_able_to_login() {
		
		System.out.println(driver.getTitle());
	    
	}



}
