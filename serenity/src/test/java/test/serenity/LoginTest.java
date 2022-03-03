package test.serenity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class LoginTest {
	
	
	@Managed(driver = "chrome")
	WebDriver driver;

	@Managed(uniqueSession = true)
	
	@Steps
	LoginSteps ls;
	
	@Test
	public void logintest()
	{
		
		ls.onlogin();
	}
}
