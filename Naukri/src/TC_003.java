import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_003 {

	public static void main(String[] args) {
		
		//Launch Chrome Browser and enter Facebook URL
		System.out.println("TC_003 : To Verify Signup Functionality");
		
		FacebookReusables TC_003 = new FacebookReusables();
		
		TC_003.setPropertyChrome();
		TC_003.chromeBrowser();
		TC_003.facebookURL();
		TC_003.maximizeBrowser();
		TC_003.enterName();
		TC_003.EnterSurName();
		TC_003.EnterMobileNum();
		TC_003.enterSignupPassword();
		TC_003.EnterDOBDate();
		TC_003.EnterDOBMonth();
		TC_003.EnterDOBYear();
		TC_003.ClickGender();
		TC_003.ClickSignUP();
		
		
		
		System.out.println("Signup Functionality Verified Successfully");
	}
}
