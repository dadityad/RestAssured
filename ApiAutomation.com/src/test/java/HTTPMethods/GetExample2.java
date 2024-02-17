package HTTPMethods;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetExample2 {

	public static void main(String[] args)
	{
	
		Response res = RestAssured .get("https://reqres.in/api/users?page=2");
		 System.out.println(res.getStatusCode());
		 System.out.println(res.getTime());
		 System.out.println(res.getBody().asString());
		 
		 int actualStatusCode = res.getStatusCode();
		 int expectedStatusCode = 200;
		 
		 //assert.assertEquals(actualStatusCode, expectedStatusCode);
		Assert.assertEquals(actualStatusCode, expectedStatusCode);
	}
}
