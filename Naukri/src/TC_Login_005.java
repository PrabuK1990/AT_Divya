
public class TC_Login_005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check whether the default included in the email text box");
		
		NaukriReusables TC_Login_005 = new NaukriReusables();
		
		//Set Property
		TC_Login_005.setPropertyChrome();
		
		//Launch Chrome
		TC_Login_005.chromeBrowser();
		
		//Enter URL
		TC_Login_005.naukriURL();
		
		//Maximise
		TC_Login_005.maximizeBrowser();
		
		//Wait
		TC_Login_005.waitMethod();
		
		//Click On Login Link
		TC_Login_005.clickLoginLink();
		
		//wait
		TC_Login_005.waitMethod();
		
		//the Default is not going to username or emailid
		System.out.println("Default Text will be display in Email Id Text Box");

	}

}
