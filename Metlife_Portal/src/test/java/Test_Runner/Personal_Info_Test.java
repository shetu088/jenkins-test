package Test_Runner;

import org.junit.Test;

import Testing.Metlife_Portal.Personal_Info;

public class Personal_Info_Test {
	
	Personal_Info login = new Personal_Info();
	
	@Test
	public void Test_Login() throws InterruptedException
	{
		login.tearup();
		login.login_click();
	}
	
	
	@Test
	public void Login()
	
	{
		login.enter_username();
		login.enter_password();
		login.loginforsubmit();
		login.Personal_information_Email();
		//login.Remove_Email();
		login.Edit_Email();
		login.Back_To_Home();
	}

	
}
