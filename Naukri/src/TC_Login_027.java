
public class TC_Login_027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check whether the FAQ sublink is working  ");
		
		NaukriReusables TC_Login_027 =new NaukriReusables();

		TC_Login_027.setPropertyChrome();
		TC_Login_027.chromeBrowser();
		TC_Login_027.naukriURL();
		TC_Login_027.maximizeBrowser();
		TC_Login_027.waitMethod();
		TC_Login_027.mousehoverMoreLink();
		TC_Login_027.waitMethod();
		TC_Login_027.clickonFAQSLink();
		TC_Login_027.closeCurrentBrowser();
	
		System.out.println("It should open new tab");

	}

}
