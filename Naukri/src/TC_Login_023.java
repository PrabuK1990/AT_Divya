
public class TC_Login_023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check whether the Text Resume sublink is working  ");
		
		NaukriReusables TC_Login_023 =new NaukriReusables();

		TC_Login_023.setPropertyChrome();
		TC_Login_023.chromeBrowser();
		TC_Login_023.naukriURL();
		TC_Login_023.maximizeBrowser();
		TC_Login_023.waitMethod();
		TC_Login_023.mousehoverServicesLink();
		TC_Login_023.waitMethod();
		TC_Login_023.clickonTextResumeSLink();
		TC_Login_023.closeCurrentBrowser();
	
		System.out.println("It should open new tab");

	}

}
