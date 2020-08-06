
public class TC_Login_022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Check whether the People Flow sublink is working  ");
		
		NaukriReusables TC_Login_022 =new NaukriReusables();

		TC_Login_022.setPropertyChrome();
		TC_Login_022.chromeBrowser();
		TC_Login_022.naukriURL();
		TC_Login_022.maximizeBrowser();
		TC_Login_022.waitMethod();
		TC_Login_022.mousehoverToolsLink();
		TC_Login_022.waitMethod();
		TC_Login_022.clickonPeopleFlowSLink();
		TC_Login_022.closeCurrentBrowser();
	
		System.out.println("It should open new tab");
	}

	

}
