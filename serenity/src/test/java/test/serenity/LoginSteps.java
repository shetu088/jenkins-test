package test.serenity;

import static org.junit.Assert.assertTrue;

import junit.framework.Assert;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
	
	LoginOrange lo;
	
	
	@Step("#actor try to login")
	public void onlogin()
	{
		
	     lo.open();
		lo.login();
		System.out.println(lo.getTitle());
		//Assert.assertEquals(lo.getTitle(),"OrangeHRM");
		
	}
	
	

}
