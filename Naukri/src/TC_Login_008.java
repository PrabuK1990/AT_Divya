
public class TC_Login_008 implements NaukriInputs{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Check whether the textbox outline is in red color");
		NaukriReusables TC_Login_008 = new NaukriReusables();
		
		//set property for chrome
		TC_Login_008.setPropertyChrome();
		
		//Launch Crome
		TC_Login_008.chromeBrowser();
		
		//Enter URL
		TC_Login_008.naukriURL();
		
		//wait
		TC_Login_008.waitMethod();
		
		//Maximise
		TC_Login_008.maximizeBrowser();
		
		//click on login Link
		TC_Login_008.clickLoginLink();
		
		//wait
		TC_Login_008.waitMethod();
		
		//Enter username
		TC_Login_008.enterUsername("NaukriInputs_UserName1");
		
		//Enter Password
		TC_Login_008.enterPassword("NaukriInputs_INPassWord");

		//wait
		TC_Login_008.waitMethod();
		
		//Click on Login Button
		TC_Login_008.clickLoginButton();
		
		System.out.println("Error message should display as Please Enter Valid Email/Password");
	
	}

}
