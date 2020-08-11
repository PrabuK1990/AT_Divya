import java.awt.AWTException;

public class TC_Employer_005 implements NaukriEmployerInputs {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.out.println("Check Wether Company Name Accept the Valid Input");
		
		NaukriReusables TC_Employer_005 = new NaukriReusables();
		TC_Employer_005.setPropertyChrome();
		TC_Employer_005.chromeBrowser();
		TC_Employer_005.naukriURL();
		TC_Employer_005.maximizeBrowser();
		TC_Employer_005.waitMethod();
		TC_Employer_005.ForEmployers();
		TC_Employer_005.switchToNewTab();
		TC_Employer_005.waitMethod();
		TC_Employer_005.saleEnquiry();
		TC_Employer_005.employerCompanyName("Radha");
		
	/*	String usr[]={NaukriEmployerInputs_EmployeCompanyName1 ,NaukriEmployerInputs_EmployeCompanyName2};
		for(int i = 0; i < usr.length; i++)
		{
			TC_Employer_005.employerCompanyName(usr[i]);
			System.out.println(usr[i]);
			TC_Employer_005.waitMethod();
			TC_Employer_005.employerSubmitEnquiry();
			TC_Employer_005.waitMethod();
			TC_Employer_005.clearEmployerCompanyName();          
		}

		TC_Employer_005.closeCurrentBrowser();
		TC_Employer_005.switchToDefaultTab();
		TC_Employer_005.waitMethod();
		TC_Employer_005.ForEmployers(); */
		System.out.println("Company Name TextBox Accept the Valid Input");
		}

}
