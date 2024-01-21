package Company;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.RestAssured;
public class test4 
{
public static void main (String [] args) 
{
	System.setProperty("webdriver.chrome.driver", "chrome path");
	
	WebDriver driver = new ChromeDriver();
	
	  driver.get("https://www.irctc.co.in/nget/train-search");
	  WebElement login =driver.findElement(By.xpath("//a[normalize-space()='LOGIN'])"));
	  login.click();
	  WebElement loginid = driver.findElement(By.xpath("//input[@id='5954612'])"));
	  loginid.sendKeys("abcd");

	  RestAssured.baseURI ="http://wallet-transaction-service.staging.sharechat.internal/wallet-transaction-service/v1.0.0/";
	  String body = "{\n"
	  		+ "    \"amount\": 150,\n"
	  		+ "    \"currencyType\": \"COIN\",\n"
	  		+ "    \"source\": \"GIFT\",\n"
	  		+ "    \"urn\": \"4hrfwxj9zfpm1ofz\",\n"
	  		+ "    \"userId\": \"2178112424\"\n"
	  		+ "}";
}
	
}
