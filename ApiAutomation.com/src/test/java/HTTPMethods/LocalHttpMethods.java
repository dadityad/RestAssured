package HTTPMethods;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class LocalHttpMethods {
	JSONObject Js = new JSONObject();
	@Test (priority = 1)
	public void getMethod() {
		
		when().get("http://localhost:3000/data").then().statusCode(200);
	}
	@Test (priority = 2)
	public void PostMethod() {
		//JSONObject Js = new JSONObject();
		//Js.put("id", 13);
		Js.put("email", "raj.mile@reqres.in");
		Js.put("first_name", "Raj");
		Js.put("last_name","Mile");
		Js.put("avatar", "https://reqres.in/img/faces/13-image.jpg");
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(Js.toJSONString()).
		when().
			post("http://localhost:3000/data").
		then().
			statusCode(201);
	}
	
	@Test (priority = 3)
	public void PutMethod() {
		
		Js.put("email", "PUTraj.mile@reqres.in");
		Js.put("first_name", "PUTRaj");
		Js.put("last_name","PutMile");
		Js.put("avatar", "https://PUTreqres.in/img/faces/13-image.jpg");
		
		given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(Js.toJSONString())
		.when().
			put("http://localhost:3000/data/13")
		.then()
			.statusCode(200);
	}	

	@Test (priority = 4)
	public void PatchMethod()
	{
		
		Js.put("last_name", "Patch");
		
		given().
			contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(Js.toJSONString())
		.when()
			.patch("http://localhost:3000/data/13")
		.then()
			.statusCode(200);
	}
	
	@Test (priority = 5)
	public void DeleteMethod()
	{
		
	when().
		delete("http://localhost:3000/data/13").
	then().
		statusCode(200);
		
	}
}
