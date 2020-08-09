
public class TC_Login_018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Check whether the About Companies sublink is working ");
		NaukriReusables TC_Login_018 =new NaukriReusables();
		
		
		TC_Login_018.setPropertyChrome();
		TC_Login_018.chromeBrowser();
		TC_Login_018.naukriURL();
		TC_Login_018.maximizeBrowser();
		TC_Login_018.waitMethod();
		TC_Login_018.mousehoverCompaniesLink();
		TC_Login_018.waitMethod();
		TC_Login_018.clickonAboutCompaniesSLink();
		TC_Login_018.waitMethod();
		TC_Login_018.switchToNewTab();
		TC_Login_018.closeCurrentBrowser();
		
		
			
		
		System.out.println("It should open new tab");
	}

}
