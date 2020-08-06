
public class TC_Login_017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check whether the Browse All Companies sublink is working ");
		NaukriReusables TC_Login_017 =new NaukriReusables();
		
		
		TC_Login_017.setPropertyChrome();
		TC_Login_017.chromeBrowser();
		TC_Login_017.naukriURL();
		TC_Login_017.maximizeBrowser();
		TC_Login_017.waitMethod();
		TC_Login_017.mousehoverCompaniesLink();
		TC_Login_017.waitMethod();
		TC_Login_017.clickonBrowseAllCompaniesSLink();
		TC_Login_017.closeCurrentBrowser();
		
		
			
		
		System.out.println("It should open new tab");
	}

}
