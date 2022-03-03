package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Connection;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Page_Objects extends Connection {
	
	@FindBy(xpath="//input[@id='USER']")
	WebElement username ;
	
	@FindBy(xpath="//input[@id='PASSWORD']")
	WebElement password ;
	
	@FindBy(xpath="//input[@id='loginFormSubmit']")
	WebElement login ;
	
	
	
	public Page_Objects()
	{   
		setup();
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void gettitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public void enterusername(String name)
	{
		username.sendKeys(name);
	}
	
	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	
	public void enterlogin()
	
	{
		login.click();
	}
	

}
