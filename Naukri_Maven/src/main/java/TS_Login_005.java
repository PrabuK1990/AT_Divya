import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_Login_005 extends NaukriInputs {
	public NaukriReusables TS_Login_005;
	
	//Run Before All Test case
	@BeforeTest
	public void BeforeAllTestCase() throws IOException
	{
		TS_Login_005 = new NaukriReusables();
		NaukriInputs inputs = new NaukriInputs();
		inputs.loadExcel();
		TS_Login_005.setPropertyChrome();
		TS_Login_005.chromeBrowser();
		TS_Login_005.naukriURL();
		TS_Login_005.waitMethod();
		TS_Login_005.maximizeBrowser();	
	}
	//Run Before Each Test Case
	@BeforeMethod
	public void BeforeEachTestCase()
	{
		TS_Login_005.refreshBrowser();
		TS_Login_005.waitMethod();
		TS_Login_005.mousehoverToolsLink();
		TS_Login_005.waitMethod();
	}
	//Actual test Case 020
	@Test
	public void testcase_020()
	{
		TS_Login_005.clickonSalaryTrendsSLink();
		System.out.println("It Should Open Salary Trends WebPage");
		TS_Login_005.waitMethod();
	}
	//Actual Test Case 021
	@Test
	public void testcase_021()
	{
		TS_Login_005.clickonCareerNavigatorSLink();
		System.out.println("It Should Open Career Navigator WebPage");
		TS_Login_005.waitMethod();
	}
	//Actual Test case 022
	@Test
	public void testcase_022()
	{
		TS_Login_005.clickonPeopleFlowSLink();
		System.out.println("It Should Open People Flow WebPage");
		TS_Login_005.waitMethod();
	}
	//Run After Each Test Case
	@AfterMethod
	public void AfterEachTestCase() throws AWTException
	{
		TS_Login_005.pressCtrlW();
		TS_Login_005.waitMethod();
	}
	//Run After All Test Case
	@AfterTest
	public void AfterAllTestCase()
	{
		TS_Login_005.closeAllBrowser();
	}

}
