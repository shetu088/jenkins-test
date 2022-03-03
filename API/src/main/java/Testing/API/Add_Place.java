package Testing.API;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.ReusuableMethods;
import files.Payload;

import static io.restassured.RestAssured.*;

public class Add_Place {

	
	
	public static void main(String[] args) {
		// Validate if Add Place API IS working as expected 
		
		
		//given : all input details
		//when  : submit the api + resource and http method 
	    //then  : validate the response
		
		RestAssured.baseURI ="https://rahulshettyacademy.com";
		
	String response = given().log().all().queryParam("key","qaclick123").header("Content-Type" , "application/json")
	.body(Payload.AddPlace()).when().post("maps/api/place/add/json")
       .then().log().all().statusCode(200).body("scope", equalTo("APP")).header("Server","Apache/2.4.18 (Ubuntu)")
        .extract().response().asString();
		
		
		
		//Add Place and then Update Place with new Address -> get place to validate of new address is updated 
		//successfully or not  and present in the response
	
	
	JsonPath jp = ReusuableMethods.rawToJson(response); // for response parsing 
	
	String placeid = jp.getString("place_id");
	
	System.out.println(placeid);
		
	String newAddress = "Maharishi Puram , USA";
	
	//update api
	
	given().log().all().queryParam("key","qaclick123").header("Content-Type" , "application/json")
	.body("{\r\n"
			+ "\"place_id\":\""+placeid+"\",\r\n"
			+ "\"address\":\""+newAddress+"\",\r\n"
			+ "\"key\":\"qaclick123\"\r\n"
			+ "}").when().put("maps/api/place/update/json").then().log().all().assertThat().statusCode(200)
	.body("msg", equalTo("Address successfully updated"));
		
		
	// Get api to validate
	
	String updatedAddress = given().log().all().queryParam("key","qaclick123").queryParam("place_id",placeid)
	.when().get("maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract().response().asString();

	JsonPath js1 = ReusuableMethods.rawToJson(updatedAddress);
	String actualAddress = js1.getString("address");
	
	System.out.println(actualAddress);
	
	Assert.assertEquals(actualAddress, newAddress, "The two addresses are same");
	
	
	}

}
