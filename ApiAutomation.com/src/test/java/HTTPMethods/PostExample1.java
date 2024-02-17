package HTTPMethods;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.internal.path.json.mapping.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

public class PostExample1 {

	@Test
	public void PostMethod1(){
		
		Map<String, Object> map = new HashMap<String, Object>();
		{
			map.put("name", "adi");
			map.put("id", 1);
			
			System.out.println(map);
			JSONObject jo = new JSONObject(map);
			System.out.println(jo);
		}
	}
	
	@Test
	public void PostMethod2()
	{
		
		JSONObject Jo = new JSONObject();
		Jo.put("name","adi");
		Jo.put("job", "QA");
		
		given()
			.body(Jo.toJSONString())
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.statusCode(201);
		
	}
	
}
