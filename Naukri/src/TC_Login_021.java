
public class TC_Login_021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Check whether the Career Navigator sublink is working  ");
		
		NaukriReusables TC_Login_021 =new NaukriReusables();

		TC_Login_021.setPropertyChrome();
		TC_Login_021.chromeBrowser();
		TC_Login_021.naukriURL();
		TC_Login_021.maximizeBrowser();
		TC_Login_021.waitMethod();
		TC_Login_021.mousehoverToolsLink();
		TC_Login_021.waitMethod();
		TC_Login_021.clickonCareerNavigatorSLink();
		TC_Login_021.closeCurrentBrowser();
	
		System.out.println("It should open new tab");
	}

}
