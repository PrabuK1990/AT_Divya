
public class TC_Login_019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Check whether the Interview Questions sublink is working  ");
		NaukriReusables TC_Login_019 =new NaukriReusables();
		
		
		TC_Login_019.setPropertyChrome();
		TC_Login_019.chromeBrowser();
		TC_Login_019.naukriURL();
		TC_Login_019.maximizeBrowser();
		TC_Login_019.waitMethod();
		TC_Login_019.mousehoverCompaniesLink();
		TC_Login_019.waitMethod();
		TC_Login_019.clickonInterviewQuestionSLink();
		TC_Login_019.waitMethod();
		TC_Login_019.switchToNewTab();
		TC_Login_019.closeCurrentBrowser();
		
		
			
		
		System.out.println("It should open new tab");

	}

}
