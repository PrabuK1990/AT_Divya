import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_Login_006 extends NaukriInputs{
public NaukriReusables TS_Login_006;
	
	//Run Before All Test case
	@BeforeTest
	public void BeforeAllTestCase() throws IOException
	{
		TS_Login_006 = new NaukriReusables();
		NaukriInputs inputs = new NaukriInputs();
		inputs.loadExcel();
		TS_Login_006.setPropertyChrome();
		TS_Login_006.chromeBrowser();
		TS_Login_006.naukriURL();
		TS_Login_006.waitMethod();
		TS_Login_006.maximizeBrowser();	
	}
	//Run Before Each Test Case
	@BeforeMethod
	public void BeforeEachTestCase()
	{
		TS_Login_006.refreshBrowser();
		TS_Login_006.waitMethod();
		TS_Login_006.mousehoverServicesLink();
		TS_Login_006.waitMethod();
	}
	//Actual test Case 023
	@Test
	public void testcase_023()
	{
		TS_Login_006.clickonTextResumeSLink();
		System.out.println("It Should Open Test Resume WebPage");
		TS_Login_006.waitMethod();
	}
	//Actual Test Case 024
	@Test
	public void testcase_024()
	{
		TS_Login_006.clickonVisualResumeSLink();
		System.out.println("It Should Open Visual Resume WebPage");
		TS_Login_006.waitMethod();
	}
	//Actual Test case 025
	@Test
	public void testcase_025()
	{
		TS_Login_006.clickonResumeQualityScooreFreeSLink();
		System.out.println("It Should Open Presume Quality Scoore Free WebPage");
		TS_Login_006.waitMethod();
	}
	//Run After Each Test Case
	@AfterMethod
	public void AfterEachTestCase() throws AWTException
	{
		TS_Login_006.pressCtrlW();
		TS_Login_006.waitMethod();
	}
	//Run After All Test Case
	@AfterTest
	public void AfterAllTestCase()
	{
		TS_Login_006.closeAllBrowser();
	}


}
