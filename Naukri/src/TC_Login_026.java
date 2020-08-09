
public class TC_Login_026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check whether the Naukri Blog sublink is working ");
		
		NaukriReusables TC_Login_026 =new NaukriReusables();

		TC_Login_026.setPropertyChrome();
		TC_Login_026.chromeBrowser();
		TC_Login_026.naukriURL();
		TC_Login_026.maximizeBrowser();
		TC_Login_026.waitMethod();
		TC_Login_026.mousehoverMoreLink();
		TC_Login_026.waitMethod();
		TC_Login_026.clickonNaukriBlogSLink();
		TC_Login_026.waitMethod();
		TC_Login_026.switchToNewTab();
		TC_Login_026.closeCurrentBrowser();
	
		System.out.println("It should open new tab");

	}

}
