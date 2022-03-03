package step_def;


import org.openqa.selenium.By;

import io.cucumber.java.Before;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.Page_Objects;

public class Login_Valid  {

	
	Page_Objects po;
   
   @Before
   public void init()
   {    
	    po = new Page_Objects();
   }
	
   
   @Given("user is on the login page")
   public void user_is_on_the_login_page() {
   
	   
	   po.gettitle();
	   
   }
     

   @Given("user enters the  username {string}")
   public void user_enters_the_username(String string) {
	   
	  po.enterusername("Shravi"); 
	  //System.out.println(string);
     
   }
   @When("user enters the  password {string}")
   public void user_enters_the_password(String string) {
	   
	   po.enterpassword("Netlife12");
	   //System.out.println(string);
       
   }
   @When("user clicks on the login button")
   public void user_clicks_on_the_login_button() {
	   
	  po.enterlogin(); 
      
   }
  

}




	



	
	
	
	
	
	
	

