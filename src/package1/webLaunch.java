package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webLaunch {
	
		
		@Test
	    public static void launched() {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:/Mayamd new/mayamd_web_testcases/ChromeDriver/chromedriver.exe");

	        // Create a new instance of the Chrome driver
	        WebDriver driver = new ChromeDriver();

	        // Launch the browser and open a website
	        driver.get("https://www.google.com");

	        // Close the browser
	        driver.quit();
	    }
	}
