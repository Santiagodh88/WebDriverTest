package TravelBussiness.WebDriverTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {
	WebDriver driver;
	String url = "https://www.google.com.ar/";
	
	@Test
	public void test() {
		//driver.navigate().to("https://www.google.com.ar");
		driver.get("https://wordpress.com/");
	}
	
	@BeforeMethod
	public void setUp () {
		System.setProperty("webdriver.chrome.driver", "src/main/chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	    public void tearDown() {
		//logout
		driver.quit();
	    
	    }
	/////PAge Example Chap 2 Creating Automated Framework
}