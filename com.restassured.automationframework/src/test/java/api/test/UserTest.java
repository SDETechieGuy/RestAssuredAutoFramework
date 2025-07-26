package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import api.endpoints.UserEndpointsFile;
import api.payload.User;
import io.restassured.response.Response;

public class UserTest 
{
	User user ;
	Response resp;
	
	@BeforeClass
	public void setUp()
	{
		user= new User();
		user.setEmail("test123@xyz.com");
		user.setFirstName("XYZ");
		user.setId(1278);
		user.setLastName("ABC");
		user.setPassword("12rt%4AB");
		user.setPhone("0000000000");
		user.setUsername("u134");
		user.setUserStatus(1);
		
	}
	
	@Test(priority=1,description="Creates a user emulating POST API Call")
	public void testCreateUser()
	{
		resp = UserEndpointsFile.createUserMethod(user);
		resp.then().log().all();//log all response
		
		Assert.assertEquals(resp.getStatusCode(),200);		
		
	}
	
	@Test(priority=2,description="Updates a user emulating PUT API Call")
	public void testUpdateUser()
	{
		//String updUser
		resp=UserEndpointsFile.updateUserMethod(user, null);
	}
	
	@Test(priority=3,description="Get a user emulating GET API Call")
	public void testGetUser()
	{
	  	resp = UserEndpointsFile.getUserMethod(this.user.getUsername());
	  	resp.then().log().all();
	  	
	  	Assert.assertEquals(resp.getStatusCode(), 200);
	}

}
