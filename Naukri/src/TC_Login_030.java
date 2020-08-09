
public class TC_Login_030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Check whether the SOP sublink is working  ");
		
		NaukriReusables TC_Login_030 = new NaukriReusables();

		TC_Login_030.setPropertyChrome();
		TC_Login_030.chromeBrowser();
		TC_Login_030.naukriURL();
		TC_Login_030.maximizeBrowser();
		TC_Login_030.waitMethod();
		TC_Login_030.mousehoverMoreLink();
		TC_Login_030.waitMethod();
		TC_Login_030.clickonSOPSLink();
		TC_Login_030.waitMethod();
		TC_Login_030.switchToNewTab();
		TC_Login_030.closeCurrentBrowser();
	
		System.out.println("It should open new tab");
	}

}
