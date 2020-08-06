
public class TC_Login_020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Check whether the Salary Trends sublink is working   ");
		NaukriReusables TC_Login_020 =new NaukriReusables();
		
		
		TC_Login_020.setPropertyChrome();
		TC_Login_020.chromeBrowser();
		TC_Login_020.naukriURL();
		TC_Login_020.maximizeBrowser();
		TC_Login_020.waitMethod();
		TC_Login_020.mousehoverToolsLink();
		TC_Login_020.waitMethod();
		TC_Login_020.clickonSalaryTrendsSLink();
		TC_Login_020.closeCurrentBrowser();
		
		
			
		
		System.out.println("It should open new tab");
	}

}
