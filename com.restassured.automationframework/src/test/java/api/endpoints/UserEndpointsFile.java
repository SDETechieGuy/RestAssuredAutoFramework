package api.endpoints;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import api.payload.User;
import io.restassured.http.ContentType;

/**
 * CRUD methods implementation for Users space
 * Its created to perform actions like Create,Update, Retrieve, Delete on Users API.
 */

public class UserEndpointsFile {

	public static Response createUserMethod(User payloadFile)
	{
		Response resp = given().
		    accept(ContentType.JSON)
		    .contentType(ContentType.JSON)
		    .body(payloadFile)
		    .when()
		    .post(RoutesPath.createUser_post_url);
		    
		return resp;		
	}
	
	public static Response getUserMethod(String username)
	{
		Response resp = given().
				        pathParam("username",username).
		    accept(ContentType.JSON)
		    .contentType(ContentType.JSON)
		    .when()
		    .get(RoutesPath.getUser_get_url);
		    
		return resp;		
	}
	
	public static Response updateUserMethod(User payloadFile,String username)
	{
		Response resp = given().
				        pathParam("username",username).
		                accept(ContentType.JSON).
		                contentType(ContentType.JSON).
		                body(payloadFile).
		                when().
		                put(RoutesPath.updateUser_put_url);
		    
		return resp;		
	}

	public static Response deleteUserMethod(String username)
	{
		Response resp = given().pathParam("username",username).
		               accept(ContentType.JSON).
		               contentType(ContentType.JSON).
		               when().
		               delete(RoutesPath.deleteUser_delete_url);
		    
		return resp;		
	}
	
	public static Response patchUpdateUser(User payloadFile,String username)
	{
		Response resp = given().pathParam("username",username).
		                accept(ContentType.JSON)
		                .contentType(ContentType.JSON)
		                .body(payloadFile)
		                .when()
		                .patch(RoutesPath.updatePartially_User_patch_url);
		    
		return resp;		
	}
}
