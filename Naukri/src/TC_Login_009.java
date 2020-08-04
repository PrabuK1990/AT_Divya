
public class TC_Login_009 implements NaukriInputs{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Check whether error message text is in red color");
		NaukriReusables TC_Login_009 = new NaukriReusables();
		
		//set property for chrome
		TC_Login_009.setPropertyChrome();
		
		//Launch Crome
		TC_Login_009.chromeBrowser();
		
		//Enter URL
		TC_Login_009.naukriURL();
		
		//wait
		TC_Login_009.waitMethod();
		
		//Maximise
		TC_Login_009.maximizeBrowser();
		
		//click on login Link
		TC_Login_009.clickLoginLink();
		
		//wait
		TC_Login_009.waitMethod();
		
		//Enter username
		TC_Login_009.enterUsername("NaukriInputs_UserName1");
		
		//Enter Password
		TC_Login_009.enterPassword("NaukriInputs_INPassWord");

		//wait
		TC_Login_009.waitMethod();
		
		//Click on Login Button
		TC_Login_009.clickLoginButton();
		
		System.out.println("Error message should be display in red colour");
	
	}

}
