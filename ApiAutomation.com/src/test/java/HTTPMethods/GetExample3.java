package HTTPMethods;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class GetExample3 {

	@Test
	public void getMethodTest1()
	{
		Response res = get("https://reqres.in/api/users?page=2");
		System.out.println(res.statusCode());
	}
	
	@Test
	public void getMethodTest2()
	{
		baseURI = "https://reqres.in/api/";
		given().
			get("users?page=2").
			then().
			statusCode(200).
			body("data[0].email", equalTo("michael.lawson@reqres.in"));
	}
	
	@Test
	public void getMethod3()
	{
		given().get("https://jsonplaceholder.typicode.com/todos/1").then().statusCode(200).body("title", equalTo("delectus aut autem"));
	}
	
}
