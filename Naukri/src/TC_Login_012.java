
public class TC_Login_012 {

	public static void main(String[] args) {
		
		System.out.println("Check whether the Advanced Search sublink is working ");
		
		NaukriReusables TC_Login_012 = new NaukriReusables();
		
		TC_Login_012.setPropertyChrome();
		TC_Login_012.chromeBrowser();
		TC_Login_012.naukriURL();
		TC_Login_012.waitMethod();
		TC_Login_012.maximizeBrowser();
		TC_Login_012.mousehoverJobLink();
		TC_Login_012.waitMethod();
		TC_Login_012.clickonAdvancedSLink();
		TC_Login_012.closeCurrentBrowser();
		
		System.out.println("It should open new tab");
	}

}
