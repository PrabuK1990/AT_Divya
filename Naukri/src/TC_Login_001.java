
public class TC_Login_001 {

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
		TC_Login_001.enterUsername();
		//TC_Login_001.closeAllBrowser();
		
		System.out.println("No error message should display.");

	}

}
