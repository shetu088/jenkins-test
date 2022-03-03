package Testing.Metlife_Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.Set_Up;

public class Login_Info extends Set_Up{

	Personal_Info pi = new Personal_Info();
	
	
	public void login_to_portal()
	{
	    try 
	    {
			pi.login_click();
		  
	    }
	    
	    catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	    
	    pi.enter_username();
	    pi.enter_password();
	    pi.loginforsubmit();
	}
	
	
	public void username_update() {
		
		driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/main/div[1]/div/div[3]/div[1]/div[2]/div/div/div/a")).click();
		
		String passwords[] = {"Shetu088" , "rashmi088" , "kajal088" };
		
		WebElement passValue = driver.findElement(By.xpath(""));
		
		for(String password : passwords)
		
		{
			passValue.sendKeys(password);
			driver.findElement(By.xpath("")).click();
			
		}
		
	}
}
