
public class TC_Login_013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check whether the Create a Free JobAlert sublink is working  ");
		
		NaukriReusables TC_Login_013 = new NaukriReusables();
		
		TC_Login_013.setPropertyChrome();
		TC_Login_013.chromeBrowser();
		TC_Login_013.naukriURL();
		TC_Login_013.waitMethod();
		TC_Login_013.maximizeBrowser();
		TC_Login_013.mousehoverJobLink();
		TC_Login_013.waitMethod();
		TC_Login_013.clickonCreateFreeJobAlertsLink();
		TC_Login_013.waitMethod();
		TC_Login_013.switchToNewTab();
		TC_Login_013.closeCurrentBrowser();
		
		System.out.println("It should open new tab");
	}

}
