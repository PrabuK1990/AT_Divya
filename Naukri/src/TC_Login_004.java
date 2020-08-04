
public class TC_Login_004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check whether error message text is in red color");
		
		NaukriReusables TC_Login_004 = new NaukriReusables();
		
		//Set Property
		TC_Login_004.setPropertyChrome();
		
		//Launch Chrome
		TC_Login_004.chromeBrowser();
		
		//Enter URL
		TC_Login_004.naukriURL();
		
		//Maximise
		TC_Login_004.maximizeBrowser();
		
		//Wait
		TC_Login_004.waitMethod();
		
		//Click On Login Link
		TC_Login_004.clickLoginLink();
		
		//wait
		TC_Login_004.waitMethod();
		
		//Enter username
		
		String usr[] = {"NaukriInputs_InUserName1","NaukriInputs_InUserName2","NaukriInputs_InUserName3"};
		
		for(int i = 0; i < usr.length; i++)
		{
			//Enter username
			TC_Login_004.enterUsername(usr[i]);//Passing Parameter/Arguement
			System.out.println(usr[i]);
			TC_Login_004.waitMethod();
			TC_Login_004.clickLoginButton();
			TC_Login_004.clearUsername();
		}
		
		System.out.println("Error Message should be in Red Colour");

	}

}
