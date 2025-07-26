package api.endpoints;

/* 	 Swagger URI: https://petstore.swagger.io/v2
 * 
 *  Create User(POST): /user
 *  Get User(GET): /user/{username}
 *  Update User(PUT): /user/{username}
 *  Delete User(DELETE): /user/{username} : No payload needed
 * 
 * This file would contain only the URL's.
 * 
 */

public class RoutesPath {

	public static String baseUrl="https://petstore.swagger.io/v2";
	
	//Users space
	public static String createUser_post_url=baseUrl+"/user";
	public static String getUser_get_url=baseUrl+"/user/{username}";
	public static String updateUser_put_url=baseUrl+"/user/{username}";
	public static String deleteUser_delete_url=baseUrl+"/user/{username}";
	public static String updatePartially_User_patch_url=baseUrl+"/user/{username}";
	
}
