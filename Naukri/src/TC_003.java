import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_003 {

	public static void main(String[] args) {
		
		//Launch Chrome Browser and enter Facebook URL
System.out.println("Test Starts");
		
		//Set path to locate chromedriver exe file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Create instance of ChromeDriver() class
		//Store it in object and name it as "chrome"
		//Declare the interface type before as "WebDriver"
		WebDriver chrome = new ChromeDriver();
		
		//Enter URL in the browser
		chrome.get("https://www.facebook.com/");
		
		//Close current browser
		//chrome.close();
		
		//Close all browsers
		chrome.quit();
		
		System.out.println("Test Ends");
	}
}
