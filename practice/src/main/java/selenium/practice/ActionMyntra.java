package selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMyntra {

	public static WebDriver driver ; 
	Actions action;
	
	public void setup()
	{
		System.setProperty("webdriver.driver.chrome","C:\\Users\\SHRESSIN\\eclipse-workspace\\practice\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000 , TimeUnit.SECONDS);
		action = new Actions(driver);
		
	}
	
	public void actionperform()
	{
		
		WebElement mens = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a"));
		action.moveToElement(mens).perform();
		driver.findElement(By.linkText("Bags & Backpacks")).click();
		driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[2]/ul/li[3]/label")).click();
		
		WebElement right = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[5]/div/a"));
		action.contextClick().perform();
	}
}

