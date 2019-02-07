package Apiautomation.api;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Agentstatus {
	HashMap<String, Object> head=new HashMap<String, Object>();


	@Test
	public void AgentstatusGet() {
		head.put("Content-Type", "application/json");
		head.put("brandId", 6221);
		head.put("brandUserId", 4507843);

		RestAssured.baseURI="http://testing.onedirectdev117.in";
		Response resp =RestAssured.given().headers(head).get("/kong/brandapi/v1/agentStatus");

		int status=resp.statusCode();
		System.out.println(resp.asString());
		System.out.println(status);	

	}

	@Test
	public void AgentstatusPost() {

		JSONObject json=new JSONObject();
		json.put("name", "toobusy1");
		json.put("description", "restaubvhw111");
		json.put("inactivityThreshold", 30);
		json.put("isDefault", "false");
		json.put("statusType", 4);                 //1=online   2=Busy   4=offline
		json.put("userInactivityEnabled", "false");
		json.put("displayOrder", "1528083760");


		head.put("Content-Type", "application/json");
		head.put("brandId", 6221);
		head.put("brandUserId", 4507843);


		RestAssured.baseURI="http://172.16.1.117:9080";
		Response resp = RestAssured.given().
				headers(head).body(json).post("/brandapi/v1/agentStatus");
		int status=resp.statusCode();
		System.out.println(resp.asString());
		System.out.println(status);	

	}

	@Test
	public void AgentstatusPut() {
		JSONObject json=new JSONObject();
		json.put("name", "to");
		json.put("id",2007);
		json.put("description", "restaubvhw111");
		json.put("inactivityThreshold", 30);
		json.put("isDefault", "false");
		json.put("statusType", 2);                 //1=online   2=Busy   4=offline
		json.put("userInactivityEnabled", "false");
		json.put("displayOrder", "1528083760");


		head.put("Content-Type", "application/json");
		head.put("brandId", 6221);
		head.put("brandUserId", 4507843);


		RestAssured.baseURI="http://172.16.1.117:9080";
		Response resp = RestAssured.given().
				headers(head).body(json).put("/brandapi/v1/agentStatus");
		int status=resp.statusCode();
		System.out.println(resp.asString());
		System.out.println(status);	

	}

	//Delete method:
	@Test

	public void AgentstatusDelete() {
		head.put("Content-Type", "application/json");
		head.put("brandId", 6221);
		head.put("brandUserId", 4507843);


		RestAssured.baseURI="http://172.16.1.117:9080";
		Response resp = RestAssured.given().
				headers(head).delete("/brandapi/v1/agentStatus/2007");
		int status=resp.statusCode();
		System.out.println(resp.asString());
		System.out.println(status);	
	}











}
