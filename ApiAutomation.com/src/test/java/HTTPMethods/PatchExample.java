package HTTPMethods;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class PatchExample {

	@Test
	public void PatchMethod()
	{
		JSONObject Js = new JSONObject();
		Js.put("name", "aditya");
		System.out.println(Js);
		
		given()
			.body(Js.toJSONString())
		.when()
			.patch("https://reqres.in/api/users/2")
		.then()
			.statusCode(200);
	}
	
	
}
