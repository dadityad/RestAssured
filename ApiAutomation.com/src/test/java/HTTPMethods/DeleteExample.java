package HTTPMethods;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteExample {

	@Test
	public void DeleteMethod() {
		
		
		JSONObject Js = new JSONObject();
		Js.put("name", "adi");
		
		/*
		given().
			body(Js.toJSONString()).
		when().
			delete("https://reqres.in/api/users/2").
		then().
			statusCode(204);
		*/	
			
		when().delete("https://reqres.in/api/users/2").then().statusCode(204);
	}
	
}
