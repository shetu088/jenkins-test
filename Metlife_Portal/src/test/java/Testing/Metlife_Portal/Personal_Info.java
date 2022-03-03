package Testing.Metlife_Portal;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Set_Up;



public class Personal_Info extends Set_Up {
	
	
	
	
	
	public void login_click() throws InterruptedException
	
	{
		//driver.findElement(By.xpath("//span[contains(text(),'CREATE A NEW ACCOUNT')]")).click();
		
		WebElement login = driver.findElement(By.xpath("//button[@class = 'login-btn ml-button-primary loginButton']"));
		
		// to clear the text field
		login.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		
		
		
		
		//Used ArrayList to use the indexing 
        ArrayList<String> index = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(index.get(1));
	    
		System.out.println(driver.getTitle());
		
		
	}

	public void enter_username()
	{
		
		WebElement name = driver.findElement(By.xpath("//p[contains(text(),'Enter your username and password.')]"));
		System.out.println(name.getText());
		
		WebElement user = driver.findElement(By.id("USER"));
		user.click();

		user.sendKeys("shreshtha.cs093@gmail.com");
	
	}
	
	public void enter_password()
	{
		driver.findElement(By.xpath("//*[@id=\"PASSWORD\"]")).sendKeys("Netlife101");
		
	}
	
	public void loginforsubmit()
	{
		driver.findElement(By.xpath("//*[@id=\"loginFormSubmit\"]")).click();
		
		//driver.navigate().refresh();
		
	}
	
	public void Personal_information_Email()
	{
		driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/main/div[1]/div/div[1]/div[2]/a")).click();
//		driver.findElement(By.id("addEmail")).click();
//		driver.findElement(By.id("email")).sendKeys("shreshtha.singhal@capgemini.com");
//		
//	    WebDriverWait wait = new WebDriverWait(driver , 20);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Set as Primary')]"))).click();
//		
//		driver.findElement(By.id("savePersonalInfoButton")).click();
	}
	
	public void Remove_Email()
	{
		
//		try
//		{
//		driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div[2]/form/div[2]/div[2]/a[2]")).click();
//		
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//		}
		
	}
	
	
	public void Edit_Email()
	{
		
		
		driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div[2]/form/div[2]/div[2]/a[1]")).click();
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"alternateEmail\"]"));

		email.sendKeys(Keys.chord(Keys.CONTROL ,"a") , Keys.BACK_SPACE);
		
		email.sendKeys("newmail@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
		
	}
	
	public void Back_To_Home()
	{
		driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div[1]/div[2]/a")).click();
	}
	
}
