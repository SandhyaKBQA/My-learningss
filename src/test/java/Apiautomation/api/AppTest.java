package Apiautomation.api;

import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class AppTest 
{
	HashMap<String, Object> head=new HashMap<String, Object>();

	//GET METHOD:
	@Test
	public void BrandtagsGet() {
		head.put("Content-Type", "application/json");
		head.put("brandId", 6221);
		head.put("brandUserId", 4507843);


		RestAssured.baseURI="http://172.16.1.117:9080";
		Response resp = RestAssured.given().
				headers(head).get("/wifeapi/v2/brand_info/6221/brandTags");
		int status=resp.statusCode();
		System.out.println(resp.asString());
		System.out.println(status);	
	}


	//POST METHOD:
	@Test
	public void BrandtagPost() {

		JSONObject json=new JSONObject();
		json.put("brandId", 6221);
		json.put("tagName", "restaubvhw111");
		JSONArray a=new JSONArray();
		a.add(json);
		System.out.println(a);
		head.put("Content-Type", "application/json");
		head.put("brandId", 6221);
		head.put("brandUserId", 4507843);


		RestAssured.baseURI="http://172.16.1.117:9080";
		Response resp = RestAssured.given().
				headers(head).body(a.toString()).post("/brandapi/v1/brandTags");
		int status=resp.statusCode();
		System.out.println(resp.asString());
		System.out.println(status);	

	}

	//PUT METHOD:

	@Test
	public void BrandtagPut() {

		JSONObject j=new JSONObject();
		j.put("brandId", 6221);
		j.put("id",9655);
		j.put("tagName", "rest");	
		head.put("Content-Type", "application/json");
		head.put("brandId", 6221);
		head.put("brandUserId", 4507843);

		RestAssured.baseURI="http://172.16.1.117:9080";
		Response resp = RestAssured.given().
				headers(head).body(j.toString()).put("/brandapi/v1/brandTag/");
		int status=resp.statusCode();
		System.out.println(resp.asString());
		System.out.println(status);
	}

	//Delete method:
	@Test
	public void BrandtagDelete() {
		head.put("Content-Type", "application/json");
		head.put("brandId", 6221);
		head.put("brandUserId", 4507843);


		RestAssured.baseURI="http://172.16.1.117:9080";
		Response resp = RestAssured.given().
				headers(head).delete("/brandapi/v1/brandTag/9556");
		int status=resp.statusCode();
		System.out.println(resp.asString());
		System.out.println(status);	
	}



}
