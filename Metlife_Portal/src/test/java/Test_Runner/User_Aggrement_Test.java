package Test_Runner;

import org.junit.Test;

import Testing.Metlife_Portal.User_Aggrement;

public class User_Aggrement_Test {
	
	User_Aggrement ua = new User_Aggrement();
	
	@Test
	public void User_Aggre_Test()
	{
		
		ua.tearup();
		ua.User_On_User_Aggrement_Page();
		ua.User_Aggrement_Checkbox();
		ua.User_Aggrement_Radio();
	}
	
	
			
}
