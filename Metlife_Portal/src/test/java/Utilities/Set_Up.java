package Utilities;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//      coolcheckonce@ml.com

//      shreshtha.cs093@gmail.com

//      Nettest123

//      Netlife101

//      https://qa2.servicing.online.metlife.com/prof/home


public class Set_Up {

	public static WebDriver driver ;

	@BeforeClass
	public void tearup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRESSIN\\eclipse-workspace\\Metlife_Portal\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://qa2.servicing.online.metlife.com/prof/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80000, TimeUnit.SECONDS);
	}
	
	
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
}
