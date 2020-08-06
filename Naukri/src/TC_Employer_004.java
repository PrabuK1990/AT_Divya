import java.awt.AWTException;
public class TC_Employer_004 implements NaukriEmployerInputs{

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.out.println("Check Wether The Contact Number accept the Invalid Input");

		NaukriReusables TC_Employer_004 = new NaukriReusables();
		
		TC_Employer_004.setPropertyChrome();
		TC_Employer_004.chromeBrowser();
		TC_Employer_004.naukriURL();
		TC_Employer_004.maximizeBrowser();
		TC_Employer_004.waitMethod();
		TC_Employer_004.ForEmployers();
		TC_Employer_004.switchToNewTab();
		TC_Employer_004.waitMethod();
		TC_Employer_004.saleEnquiry();
		
		String usr[] = {NaukriEmployerInputs_EmployeContactINNumber1, NaukriEmployerInputs_EmployeContactINNumber2};
		
		for(int i = 0; i < usr.length; i++)
		{
			TC_Employer_004.empoyerContactNumber(usr[i]);
			System.out.println(usr[i]);
			TC_Employer_004.waitMethod();
			TC_Employer_004.employerSubmitEnquiry();
			TC_Employer_004.waitMethod();
			TC_Employer_004.clearEmployerContactNumber();
		}
		
		TC_Employer_004.closeCurrentBrowser();
		TC_Employer_004.switchToDefaultTab();
		TC_Employer_004.waitMethod();
		TC_Employer_004.ForEmployers();
		System.out.println("Error Message Should Display");
	}

}
