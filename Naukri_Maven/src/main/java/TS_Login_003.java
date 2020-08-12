import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.AWTException;

public class TS_Login_003 extends NaukriInputs 
{
	public NaukriReusables TS_Login_003;

	// Run Before all Test
	@BeforeTest
	public void BeforeAllTest() throws IOException 
	{
		TS_Login_003 = new NaukriReusables();
		NaukriInputs inputs = new NaukriInputs();
		inputs.loadExcel();
		TS_Login_003.setPropertyChrome();
		TS_Login_003.chromeBrowser();
		TS_Login_003.naukriURL();
		TS_Login_003.waitMethod();
		TS_Login_003.maximizeBrowser();
	}
	//Run Before Each test
	@BeforeMethod
	public void BeforeEachTest() 
	{
		TS_Login_003.refreshBrowser();
		TS_Login_003.waitMethod();
		TS_Login_003.mousehoverRecruitersLink();
		TS_Login_003.waitMethod();
	}
	//Actual Test case 014
	@Test
	public void testcase_014()
	{
		TS_Login_003.clickonBrowseAllRecruitersSLink();
		System.out.println("It Should open Browse All Recruiters Sub Link Page ");
		TS_Login_003.waitMethod();
	}
	
	//Actual Test Case  015
	@Test
	public void testcase_015()
	{
		TS_Login_003.clickonRecruiterConnectionSLink();
		System.out.println("It Should open Recruiters Connection Sub Link Page ");
		TS_Login_003.waitMethod();
	}
	//Actual Test Case 016
	@Test
	public void testcase_016()
	{
		TS_Login_003.clickonGoTONaukriRecruiterSLink();
		System.out.println("It Should open GO To Naukri Recruiters Link");
	}
	//Run After Each Test
	@AfterMethod
	public void AfterEachTest() throws AWTException
	{
			TS_Login_003.waitMethod();
			TS_Login_003.pressCtrlW();
	}
	// Run After All Test Case
	@AfterTest
	public void afterAllTest() 
	{
		TS_Login_003.closeAllBrowser();
	}
	
	
}
