
public class TC_Login_029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check whether the MS sublink is working  ");
		
		NaukriReusables TC_Login_029 =new NaukriReusables();

		TC_Login_029.setPropertyChrome();
		TC_Login_029.chromeBrowser();
		TC_Login_029.naukriURL();
		TC_Login_029.maximizeBrowser();
		TC_Login_029.waitMethod();
		TC_Login_029.mousehoverMoreLink();
		TC_Login_029.waitMethod();
		TC_Login_029.clickonMSSLink();
		TC_Login_029.waitMethod();
		TC_Login_029.switchToNewTab();
		TC_Login_029.closeCurrentBrowser();
	
		System.out.println("It should open new tab");
	}

}
