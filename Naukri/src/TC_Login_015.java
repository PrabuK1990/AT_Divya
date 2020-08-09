
public class TC_Login_015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check whether the Recruiters Connection sublink is working ");
		NaukriReusables TC_Login_015 = new NaukriReusables();
		
		TC_Login_015.setPropertyChrome();
		TC_Login_015.chromeBrowser();
		TC_Login_015.naukriURL();
		TC_Login_015.waitMethod();
		TC_Login_015.maximizeBrowser();
		TC_Login_015.mousehoverCompaniesLink();
		TC_Login_015.clickonAboutCompaniesSLink();
		TC_Login_015.waitMethod();
		TC_Login_015.switchToNewTab();
		TC_Login_015.closeCurrentBrowser();
		
				
		System.out.println("It should open new tab");
	}

}
