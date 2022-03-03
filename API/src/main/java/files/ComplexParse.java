package files;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;


// by mocking response we are doing this when we don't have any implemented API with us
public class ComplexParse {

	public static void main(String args[])
	{
	JsonPath res = new JsonPath(Payload.courceprice());
	int count = res.getInt("courses.size()");
	System.out.println(count);
	
	int finalamount = 0 ;
	int sum = 0;
	//print purchase amount 
	int purchaseamount = res.getInt("dashboard.purchaseAmount");
	System.out.println(purchaseamount);
	
	//print title of the first course
	
	String titleoffirstcourse = res.get("courses[0].title");
	System.out.println(titleoffirstcourse);

	for(int i = 0 ; i<count ; i++)
	{
		String title = res.get("courses["+i+"].title");
		int price = res.getInt("courses["+i+"].price");
		System.out.println(title +":"+price);
	}
	
	
	//no of copies 
	
	for(int i = 0 ; i<count; i++)
	{
		String title = res.get("courses["+i+"].title");
		if(title.equalsIgnoreCase("RPA"))
		{
			int countcopies = res.getInt("courses["+i+"].copies");
			System.out.println(countcopies);
		}
	}
	
	
	// verify if sum of all prices is equal to purchase amount 
	
	for(int i = 0 ; i<count ; i++)
	{
		int price = res.getInt("courses["+i+"].price");
		int countcopies = res.getInt("courses["+i+"].copies");
		
		 finalamount = price *countcopies;
		System.out.println(finalamount);
		sum = sum + finalamount;
		
		
	}
	
	
	
	Assert.assertEquals(sum,purchaseamount,"the sum is correct ");
	
	}	
	
	
	
}
