
public class TC_Login_003 {

	public static void main(String[] args)
	{

		System.out.println("Check whether the textbox outline is in red color");
		
		NaukriReusables TC_Login_003 = new NaukriReusables();
		
		// TODO Auto-generated method stub
		TC_Login_003.setPropertyChrome();
		TC_Login_003.chromeBrowser();
		TC_Login_003.naukriURL();
		TC_Login_003.maximizeBrowser();
		TC_Login_003.waitMethod();
		TC_Login_003.clickLoginLink();

		//wait
		TC_Login_003.waitMethod();
		TC_Login_003.enterUsername("!@20");
		
		System.out.println("Email ID Textbox outline should be in red colour");
	}

}
