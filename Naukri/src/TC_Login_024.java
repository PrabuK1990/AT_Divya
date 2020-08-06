
public class TC_Login_024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check whether the visual Resume sublink is working  ");
		
		NaukriReusables TC_Login_024 =new NaukriReusables();

		TC_Login_024.setPropertyChrome();
		TC_Login_024.chromeBrowser();
		TC_Login_024.naukriURL();
		TC_Login_024.maximizeBrowser();
		TC_Login_024.waitMethod();
		TC_Login_024.mousehoverServicesLink();
		TC_Login_024.waitMethod();
		TC_Login_024.clickonVisualResumeSLink();
		TC_Login_024.closeCurrentBrowser();
	
		System.out.println("It should open new tab");

	}

}
