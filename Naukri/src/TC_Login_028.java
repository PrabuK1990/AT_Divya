
public class TC_Login_028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check whether the Take Home Calculator sublink is working  ");
		
		NaukriReusables TC_Login_028 =new NaukriReusables();

		TC_Login_028.setPropertyChrome();
		TC_Login_028.chromeBrowser();
		TC_Login_028.naukriURL();
		TC_Login_028.maximizeBrowser();
		TC_Login_028.waitMethod();
		TC_Login_028.mousehoverMoreLink();
		TC_Login_028.waitMethod();
		TC_Login_028.clickonTakeHomeCalculatorSLink();
		TC_Login_028.closeCurrentBrowser();
	
		System.out.println("It should open new tab");

	}

}
