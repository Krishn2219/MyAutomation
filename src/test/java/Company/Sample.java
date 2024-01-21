package Company;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	 public static void main(String[] args) {
		//configure your browser
		        System.setProperty("webdriver.chrome.driver", "path");
		//Instantiate for webdrivers
		                WebDriver driver=new ChromeDriver();
		//to maximize browser
		        driver.manage().window().maximize();
		//to launch given url
		        driver.get("https://www.facebook.com");
		//to get the title of the webpage launched
		        String title = driver.getTitle();
		        System.out.println(title);
		//to get the url of the current page
		        String url = driver.getCurrentUrl();
		        System.out.println(url);
		//to quit the browser
		        driver.quit();
		    }

}


