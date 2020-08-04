
public class TC_Login_001 implements NaukriInputs {

	public static void main(String[] args) {
		
		System.out.println("Check whether the username field accepts login valid inputs login");
		
		NaukriReusables TC_Login_001 = new NaukriReusables();
		
		TC_Login_001.setPropertyChrome();
		TC_Login_001.chromeBrowser();
		TC_Login_001.naukriURL();
		TC_Login_001.maximizeBrowser();
		TC_Login_001.waitMethod();
		TC_Login_001.clickLoginLink();
		TC_Login_001.waitMethod();
		
		String usr[] = {NaukriInputs_UserName1, NaukriInputs_UserName2, NaukriInputs_UserName3, NaukriInputs_UserName4};
		
		for(int i = 0; i < usr.length; i++)
		{
			TC_Login_001.enterUsername(usr[i]);//Passing Parameter/Arguement
			System.out.println(usr[i]);
			TC_Login_001.waitMethod();
			TC_Login_001.clickLoginButton();
			TC_Login_001.clearUsername();
		}
		
		/*String usr = "divya@gmail.com";
		String usr1 = "Divya";
		
		TC_Login_001.enterUsername(usr);
		TC_Login_001.waitMethod();
		TC_Login_001.clickLoginButton();
		TC_Login_001.clearUsername();
		
		TC_Login_001.enterUsername(usr1);
		TC_Login_001.waitMethod();
		TC_Login_001.clickLoginButton();
		TC_Login_001.clearUsername();*/
		
		
		//TC_Login_001.closeAllBrowser();
		
		System.out.println("No error message should display.");

	}

}
