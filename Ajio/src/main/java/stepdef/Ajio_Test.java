package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Ajio_Test {
	
	
	public static WebDriver driver ;
	
	@Given("user is on the ajio home page")
	public void user_is_on_the_ajio_home_page() {
		
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\SHRESSIN\\eclipse-workspace\\Ajio\\src\\main\\java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
	    
	}

	
	@And("user enter the jeans into the search bar")
	public void user_enter_the_jeans_into_the_search_bar() {
	   
	}
	@And("user click on the search button")
	public void user_click_on_the_search_button() {
	    
	}
	@Then("user pick the first {int} jeans")
	public void user_pick_the_first_jeans(Integer int1) {
	    
	}
	@And("user print the name , disconted price and actual price of all the {int} jeans on console")
	public void user_print_the_name_disconted_price_and_actual_price_of_all_the_jeans_on_console(Integer int1) {
	    
	}
	@Then("user print the highest price from all the {int} prices")
	public void user_print_the_highest_price_from_all_the_prices(Integer int1) {
	    
	}


}
