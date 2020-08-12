import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_Login_004 extends NaukriInputs {
	public NaukriReusables TS_Login_004;
	
	//Run Before All Test
	@BeforeTest
	public void BeforeAllTest() throws IOException 
	{
	TS_Login_004 = new NaukriReusables();
	NaukriInputs inputs = new NaukriInputs();
	inputs.loadExcel();
	TS_Login_004.setPropertyChrome();
	TS_Login_004.chromeBrowser();
	TS_Login_004.naukriURL();
	TS_Login_004.waitMethod();
	TS_Login_004.maximizeBrowser();		
	}

	//Run Before Each Test
	@BeforeMethod
	public void BeforeEachTest()
	{
		TS_Login_004.refreshBrowser();
		TS_Login_004.waitMethod();
		TS_Login_004.mousehoverCompaniesLink();
		TS_Login_004.waitMethod();
	}
	//Actual Test Case 017
	@Test
	public void testcase_017()
	{
		TS_Login_004.clickonBrowseAllCompaniesSLink();
		System.out.println("It Should Open Browse All Companies Web Page");
		TS_Login_004.waitMethod();
	}
	//Actual Test case 018
	@Test
	public void testcase_018()
	{
		TS_Login_004.clickonAboutCompaniesSLink();
		System.out.println("It Should Open About Companies WebPage");
	}
	//Actual Test Case 019
	@Test
	public void testcase_019()
	{
		TS_Login_004.clickonInterviewQuestionSLink();
		System.out.println("It Should open Interview Quations WebPage");
	}
	//Run After Each Test
	@AfterMethod
	public void  AfterEachTest() throws AWTException
	{
		TS_Login_004.waitMethod();
		TS_Login_004.pressCtrlW();
	}
	
	//Run After All Test
	@AfterTest
	public void AfterAllTest()
	{
		TS_Login_004.closeAllBrowser();
	}
}
