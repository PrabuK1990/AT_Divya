import java.awt.AWTException;

public class TC_Employer_002 implements NaukriEmployerInputs  
{

	public static void main(String[] args) throws AWTException
	{
		// TODO Auto-generated method stub
				System.out.println("Check Weather Name TextBox Show Error Message When we given the Invalid Name ");

				NaukriReusables TC_Employer_002 = new NaukriReusables();
				
				TC_Employer_002.setPropertyChrome();
				TC_Employer_002.chromeBrowser();
				TC_Employer_002.naukriURL();
				TC_Employer_002.maximizeBrowser();
				TC_Employer_002.waitMethod();
				TC_Employer_002.ForEmployers();
				TC_Employer_002.switchToNewTab();
				TC_Employer_002.waitMethod();
				TC_Employer_002.saleEnquiry();
				
				String usr[] = {NaukriEmployerInputs_EmployeINName1, NaukriEmployerInputs_EmployeINName2};
				
				for(int i = 0; i < usr.length; i++)
				{
					TC_Employer_002.employerName(usr[i]);
					System.out.println(usr[i]);
					TC_Employer_002.waitMethod();
					TC_Employer_002.employerSubmitEnquiry();
					TC_Employer_002.waitMethod();
					TC_Employer_002.clearEmployerName();
				}
				
				TC_Employer_002.closeCurrentBrowser();
				TC_Employer_002.switchToDefaultTab();
				TC_Employer_002.waitMethod();
				TC_Employer_002.ForEmployers();
				System.out.println("It Should Show the Error Message");
	}

}
