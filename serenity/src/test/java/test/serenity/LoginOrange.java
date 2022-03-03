package test.serenity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/")
public class LoginOrange extends PageObject{
	
	@FindBy(id = "txtUsername")
	WebElement username ;
	
	@FindBy(id = "txtPassword")
	WebElement password ;
	
	@FindBy(id = "btnLogin")
	WebElement submit ;
	
	
	public void login()
	{
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		submit.click();
	}

}
