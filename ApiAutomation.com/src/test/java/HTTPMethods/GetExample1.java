package HTTPMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetExample1 {

	@Test
	public void testget()
	{
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(res.getStatusCode());
		System.out.println(res.getTime());
		System.out.println(res.getBody().asString());
		int actualStatusCode = res.getStatusCode();
		Assert.assertEquals(actualStatusCode, 201);
	}
	 
}
