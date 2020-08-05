import java.awt.AWTException;
public class TC_Employer_003 implements NaukriEmployerInputs
{

	public static void main(String[] args) throws AWTException
	{
		// TODO Auto-generated method stub
		System.out.println("Check Wether The Contact Number accept the Valid Input");

		NaukriReusables TC_Employer_003 = new NaukriReusables();
		
		TC_Employer_003.setPropertyChrome();
		TC_Employer_003.chromeBrowser();
		TC_Employer_003.naukriURL();
		TC_Employer_003.maximizeBrowser();
		TC_Employer_003.waitMethod();
		TC_Employer_003.ForEmployers();
		TC_Employer_003.switchToNewTab();
		TC_Employer_003.waitMethod();
		TC_Employer_003.saleEnquiry();
		
		String usr[] = {NaukriEmployerInputs_EmployeContactNumber1, NaukriEmployerInputs_EmployeContactNumber2};
		
		for(int i = 0; i < usr.length; i++)
		{
			TC_Employer_003.empoyerContactNumber(usr[i]);
			//employerName(usr[i]);
			System.out.println(usr[i]);
			TC_Employer_003.waitMethod();
			TC_Employer_003.employerSubmitEnquiry();
			TC_Employer_003.waitMethod();
			TC_Employer_003.clearEmployerContactNumber();
		}
		
		TC_Employer_003.closeCurrentBrowser();
		TC_Employer_003.switchToDefaultTab();
		TC_Employer_003.waitMethod();
		TC_Employer_003.ForEmployers();
		System.out.println("Contact Number TextBox Accept the Valid Input");
	}

}
