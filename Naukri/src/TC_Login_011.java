
public class TC_Login_011 {

	public static void main(String[] args) {
		
		
		System.out.println("Check whether the Search Job sublink is working");
		
		NaukriReusables TC_Login_011 = new NaukriReusables();
		
		TC_Login_011.setPropertyChrome();
		TC_Login_011.chromeBrowser();
		TC_Login_011.naukriURL();
		TC_Login_011.waitMethod();
		TC_Login_011.maximizeBrowser();
		TC_Login_011.mousehoverJobLink();
		TC_Login_011.waitMethod();
		TC_Login_011.clickonSearchJobsSLink();
		TC_Login_011.waitMethod();
		TC_Login_011.closeCurrentBrowser();
		
		System.out.println("It should open new tab");
	}

}
