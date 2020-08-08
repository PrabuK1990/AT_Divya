
public class TC_Login_002 implements NaukriInputs {

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

		String usr[] = {NaukriInputs_InUserName1,NaukriInputs_InUserName2,NaukriInputs_InUserName3};
		
		for(int i = 0; i < usr.length; i++)
		{
			//Enter username
			TC_Login_002.enterUsername(usr[i]);//Passing Parameter/Arguement
			System.out.println(usr[i]);
			TC_Login_002.waitMethod();
			TC_Login_002.clickLoginButton();
			TC_Login_002.clearUsername();
		}
		
		System.out.println("Error message should display as Please Enter Valid Email/Password");
	
	}

}
