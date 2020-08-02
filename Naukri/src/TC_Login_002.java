
public class TC_Login_002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Check whether the username field accepts Login Invalid inputs Login");
		NaukriReusables TC_Login_002 = new NaukriReusables();
		
		//set property for chrome
		TC_Login_002.setPropertyChrome();
		
		//Launch Crome
		TC_Login_002.chromeBrowser();
		
		//Enter URL
		TC_Login_002.naukriURL();
		
		//wait
		TC_Login_002.waitMethod();
		
		//Maximise
		TC_Login_002.maximizeBrowser();
		
		//click on login Link
		TC_Login_002.clickLoginLink();
		
		//wait
		TC_Login_002.waitMethod();
		
		//Enter username
		TC_Login_002.enterInvalidUsername();
		
		//Enter Password
		TC_Login_002.enterPassword();
		
		//Click on Login Button
		TC_Login_002.clickLoginButton();
		
		System.out.println("Error message should display as Please Enter Valid Email/Password");
	
	}

}
