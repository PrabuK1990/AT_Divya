
public class TC_Login_007 implements NaukriInputs{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Check whether the password field accepts Login Invalid inputs Login");
		NaukriReusables TC_Login_007 = new NaukriReusables();
		
		//set property for chrome
		TC_Login_007.setPropertyChrome();
		
		//Launch Crome
		TC_Login_007.chromeBrowser();
		
		//Enter URL
		TC_Login_007.naukriURL();
		
		//wait
		TC_Login_007.waitMethod();
		
		//Maximise
		TC_Login_007.maximizeBrowser();
		
		//click on login Link
		TC_Login_007.clickLoginLink();
		
		//wait
		TC_Login_007.waitMethod();
		
		//Enter username
		TC_Login_007.enterUsername("NaukriInputs_UserName1");
		
		//Enter  Invalid Password
		TC_Login_007.enterPassword("NaukriInput_INPassWord");

		//wait
		TC_Login_007.waitMethod();
		
		//Click on Login Button
		TC_Login_007.clickLoginButton();
		
		System.out.println("Error message should be display as Invalid details, plese check Email ID-password");
	
	}

}
