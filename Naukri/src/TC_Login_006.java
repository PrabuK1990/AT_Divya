
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
		TC_Login_006.enterUsername("divya@gmail.com");
		
		String usr[] = {"pass123", "Divya123"};
		
		for(int i = 0; i < usr.length; i++)
		{
			TC_Login_006.enterPassword(usr[i]);//Passing Parameter/Arguement
			System.out.println(usr[i]);
			TC_Login_006.waitMethod();
			TC_Login_006.clickLoginButton();
			TC_Login_006.clearPassword();
		}
		
		System.out.println("Open to the web page/Home page");
	
	}

}
