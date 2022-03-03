package Testing.Metlife_Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Utilities.Set_Up;

public class User_Aggrement extends Set_Up {
	
	
	Personal_Info pi = new Personal_Info();
	
	
	
	public void User_On_User_Aggrement_Page()
	{
		try {
			pi.login_click();
			pi.enter_username();
			pi.enter_password();
			pi.loginforsubmit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void User_Aggrement_Checkbox()
	{
		driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/main/div[3]/div/div[1]/div[2]/a")).click();
		WebElement checkbox = driver.findElement(By.xpath("//span[@class = 'radio-input']"));
		
		if(!checkbox.isSelected())
		{
			checkbox.click();
		}
		
		else
		{
		     System.out.println("The Checkbox is already Checked");
		}
		
		
	}
	
	public void User_Aggrement_Radio()
	{
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		
		driver.findElement(By.xpath("//*[@id=\"notAgree\"]")).click();
		
		driver.findElement(By.linkText("Cancel")).click();
		
	}
	

}
