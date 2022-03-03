package Shreshtha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	
	
	public static WebDriver driver ;
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRESSIN\\eclipse-workspace\\practice\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	}

	public void EnterText()
	{
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("shreshtha");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.CONTROL,Keys.ENTER);
		
	}
	

}
