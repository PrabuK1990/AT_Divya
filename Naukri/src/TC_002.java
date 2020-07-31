import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_002 {

	public static void main(String[] args) {

		System.out.println("Test Starts");

		// Set path to locate firefox.exe file
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		// Create instance of FirefoxDriver() class
		// Store it in object and name it as "firefox"
		// Declare the interface type before as "WebDriver"
		
		WebDriver firefox = new FirefoxDriver();
		// Enter URL in the browser
	
		firefox.get("https://www.naukri.com/");
		// Close current browser
		
		firefox.close();
		// Close all browsers
		
		firefox.quit();

		System.out.println("Test Ends");

	}

}
