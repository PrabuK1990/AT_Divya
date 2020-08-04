
public class TC_Employer_001 implements NaukriEmployerInputs  
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Check Wether Name Text Box Accept Valid Input");

		NaukriReusables TC_Employer_001 = new NaukriReusables();
		
		TC_Employer_001.setPropertyChrome();
		TC_Employer_001.chromeBrowser();
		TC_Employer_001.naukriURL();
		TC_Employer_001.maximizeBrowser();
		TC_Employer_001.waitMethod();
		TC_Employer_001.ForEmployers();
		TC_Employer_001.waitMethod();
		TC_Employer_001.saleEnquiry();
		
		String usr[] = {NaukriEmployerInputs_EmployeName1,NaukriEmployerInputs_EmployeName2,NaukriEmployerInputs_EmployeName3};
		
		for(int i = 0; i < usr.length; i++)
		{
			TC_Employer_001.employerName(usr[i]);
			System.out.println(usr[i]);
			TC_Employer_001.waitMethod();
			TC_Employer_001.employerSubmitEnquiry();
			TC_Employer_001.clearEmployerName();
		}
		System.out.println("It Should Accept the Valid Input");
	}

}
