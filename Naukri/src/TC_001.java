
public class TC_001 {

	public static void main(String[] args) {
		
		System.out.println("TC_001 : Launch Chrome Browser, Enter Facebook URL and Quit all Browsers");		
		
		FacebookReusables tc_001 = new FacebookReusables();
		tc_001.setPropertyChrome();
		tc_001.chromeBrowser();
		tc_001.facebookURL();
		tc_001.closeAllBrowser();

		System.out.println("Successfully Executed TC_001");

	}

}
