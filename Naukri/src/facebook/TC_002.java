package facebook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_002 {

	public static void main(String[] args) {

		System.out.println("TC_002 : To Verify Login Funcionality");

		//Create new instance for FacebookReusables
		//And store it in object and name it as "TC_002" 
		//And Mention interface as FacebookReusables itself
	
		FacebookReusables TC_002 = new FacebookReusables();
		
		//Using object name "TC_002' call the required functions/methods.
		TC_002.setPropertyChrome();
		TC_002.chromeBrowser();
		TC_002.maximizeBrowser();
		TC_002.facebookURL();
		TC_002.enterEmailID();
		TC_002.enterPassword();
		TC_002.clickLoginButton();
		
		System.out.println("Login Functionality Verified Successfully");

	}

}
