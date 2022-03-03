package selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSwitch {
public static WebDriver driver ;
	
	
	public void setup()
	{
		System.setProperty("webdriver.driver.chrome","C:\\Users\\SHRESSIN\\eclipse-workspace\\practice\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/deprecated.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000 , TimeUnit.SECONDS);
		
	}

	
	public void switchperform()
	{
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();
		System.out.println(driver.getTitle());
	}
	
	

}
