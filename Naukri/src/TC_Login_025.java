
public class TC_Login_025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check whether the Resume Quality Scare-Free sublink is working   ");
		
		NaukriReusables TC_Login_025 =new NaukriReusables();

		TC_Login_025.setPropertyChrome();
		TC_Login_025.chromeBrowser();
		TC_Login_025.naukriURL();
		TC_Login_025.maximizeBrowser();
		TC_Login_025.waitMethod();
		TC_Login_025.mousehoverServicesLink();
		TC_Login_025.waitMethod();
		TC_Login_025.clickonResumeQualityScooreFreeSLink();
		TC_Login_025.waitMethod();
		TC_Login_025.switchToNewTab();
		TC_Login_025.closeCurrentBrowser();
	
		System.out.println("It should open new tab");

	}

}
