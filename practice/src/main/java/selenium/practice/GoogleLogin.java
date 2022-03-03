package selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLogin {
	
	public static WebDriver driver;
	
	
	public void init() {
		System.setProperty("webdriver.driver.chrome","C:\\Users\\SHRESSIN\\eclipse-workspace\\practice\\chromedriver.exe" );
		driver = new ChromeDriver();
	}

	public void load()
	{
		driver.get("https://www.google.com/");
	}
	
	
	public void title()
	{
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}
	
	public void capgemini() {
		
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("Capgemini India");
	search.submit();
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
	}
	
	public void gettitle()
	{
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
	}
	public void image()
	{
		driver.findElement(By.linkText("Images")).click();
		
	}
	
	public void countanchortag()
	{
		List<WebElement> count = driver.findElements(By.tagName("a"));
		int size = count.size();
		for(int i = 0 ; i <=size-1 ; i++)
		{
			System.out.println(count.get(i).getText());
			
	
		}
		
		
	}
	
	public void close()
	{
		driver.quit();
	}
}
