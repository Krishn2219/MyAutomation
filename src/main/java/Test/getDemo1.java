package Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class getDemo1 {

    @BeforeSuite
    void setup() {
        System.out.println("Setup");
    }

    @Test
    void get_req() {
        RestAssured.baseURI = "http://localhost:3000";
        RestAssured.basePath = "/posts";

        // Make the request to "/posts"
        Response response = given().when().get();

        // Log the response and perform assertions
        response.then().log().all().statusCode(200).body("[3].firstName", equalTo("John"));

        // Extract response body as a String (optional)
        String responseBody = response.getBody().asString();
    }

    @AfterSuite
    void tearDown() {
        System.out.println("TearDown");
    }
}
