
public class TC_Login_014 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println("Check whether the Browse All Recruiters sublink is working   ");
		
		NaukriReusables TC_Login_014 = new NaukriReusables();
		
		TC_Login_014.setPropertyChrome();
		TC_Login_014.chromeBrowser();
		TC_Login_014.naukriURL();
		TC_Login_014.waitMethod();
		TC_Login_014.maximizeBrowser();
		TC_Login_014.mousehoverRecruitersLink();
		TC_Login_014.waitMethod();
		TC_Login_014.clickonBrowseAllRecruitersSLink();
		TC_Login_014.closeCurrentBrowser();
	System.out.println("It should open new tab");
	}

}
