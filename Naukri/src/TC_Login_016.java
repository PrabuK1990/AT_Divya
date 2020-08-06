
public class TC_Login_016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check whether the Go To NaukriRecruiter sublink is working ");
		
		NaukriReusables TC_Login_016 =new NaukriReusables();
		
		TC_Login_016.setPropertyChrome();
		TC_Login_016.chromeBrowser();
		TC_Login_016.naukriURL();
		TC_Login_016.maximizeBrowser();
		TC_Login_016.waitMethod();
		TC_Login_016.mousehoverCompaniesLink();
		TC_Login_016.waitMethod();
		TC_Login_016.clickonInterviewQuestionSLink();
		TC_Login_016.closeCurrentBrowser();
		System.out.println("It should open new tab");
	}

}
