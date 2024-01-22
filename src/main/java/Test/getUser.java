package Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class getUser 
{
	public static void main (String []args) 
	
	{
		RestAssured.baseURI ="https://reqres.in/api/users";
//		given().
//		      queryParam("page", "2")
//		        .body("")
//		        .when()
//		        .get()
//		        .then()
//	            .assertThat().statusCode(200)
//		        .body("page", equalTo(2));

//       RestAssured.baseURI = "https://reqres.in/api/users";
////		given()
////				.queryParam("page", "2")
////				.when()
////				.get()
////				.then()
////				.assertThat().statusCode(200)
////				.body("data[0].id", equalTo(7));
//
		Response responseBody = given()
				.queryParam("page", "2")
				.when()
				.get();

		responseBody.then()
				.statusCode(200)
				.body("page", equalTo(2));


		int pageValue = responseBody.path("page");
		if (pageValue == 2) {
			System.out.println("Page is equal to Value: " + pageValue);
		} else {
			System.out.println("Page is not equal to 2. Value: " + pageValue);
		}

		System.out.println("Response Body: " + responseBody.getBody().asString());
	}


    }


