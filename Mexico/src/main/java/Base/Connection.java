package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Connection {

public static	WebDriver driver ;



public  void setup()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRESSIN\\eclipse-workspace\\Mexico\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://qa.identity.metlife.mx/public/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	
} 
	
	
	
	
}
