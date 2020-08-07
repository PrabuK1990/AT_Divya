
public class TC_Login_030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Check whether the SOP sublink is working  ");
		
		NaukriReusables TC_Login_30 = new NaukriReusables();

		TC_Login_30.setPropertyChrome();
		TC_Login_30.chromeBrowser();
		TC_Login_30.naukriURL();
		TC_Login_30.maximizeBrowser();
		TC_Login_30.waitMethod();
		TC_Login_30.mousehoverMoreLink();
		TC_Login_30.waitMethod();
		TC_Login_30.clickonSOPSLink();
		TC_Login_30.waitMethod();
		TC_Login_30.closeCurrentBrowser();
	
		System.out.println("It should open new tab");
	}

}
