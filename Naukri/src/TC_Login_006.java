
public class TC_Login_006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Check whether the password field accepts Login valid inputs Login");
		
		NaukriReusables TC_Login_006 = new NaukriReusables();
		
		//set property for chrome
		TC_Login_006.setPropertyChrome();
		
		//Launch Crome
		TC_Login_006.chromeBrowser();
		
		//Enter URL
		TC_Login_006.naukriURL();
		
		//wait
		TC_Login_006.waitMethod();
		
		//Maximise
		TC_Login_006.maximizeBrowser();
		
		//click on login Link
		TC_Login_006.clickLoginLink();
		
		//wait
		TC_Login_006.waitMethod();
		
		//Enter username
		TC_Login_006.enterUsername();
		
		//Enter Password
		TC_Login_006.enterPassword();

		//wait
		TC_Login_006.waitMethod();
		
		//Click on Login Button
		TC_Login_006.clickLoginButton();
		
		System.out.println("Open to the web page/Home page");
	
	}

}
