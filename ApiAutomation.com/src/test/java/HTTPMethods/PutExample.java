package HTTPMethods;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PutExample {

	@Test
	public void PutMentod1() {
		
		JSONObject Jo = new JSONObject();
		Jo.put("Name", "Adi");
		Jo.put("Job", "BA");
		
		System.out.println(Jo);
		
		given()
			.body(Jo.toJSONString())
		.when()
			.put("https://reqres.in/api/users/2")
		.then()
			.statusCode(200);
	}
	
}
