import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_login_007 extends NaukriInputs
{
	public NaukriReusables TS_Login_007;
	//Run Before All Test Case
	@BeforeTest
	public void BeforeAllTestCase() throws IOException
	{
		TS_Login_007 = new NaukriReusables();
		NaukriInputs inputs = new NaukriInputs();
		inputs.loadExcel();
		TS_Login_007.setPropertyChrome();
		TS_Login_007.chromeBrowser();
		TS_Login_007.naukriURL();
		TS_Login_007.waitMethod();
		TS_Login_007.maximizeBrowser();
		TS_Login_007.waitMethod();
	}
	//Run Before each Test Case
	@BeforeMethod
	public void BeforeEachTest()
	{
		
		TS_Login_007.refreshBrowser();
		TS_Login_007.mousehoverMoreLink();
		TS_Login_007.waitMethod();
	}
	
	//Actual Test case 026
	@Test
	public void testcase_026()
	{
		TS_Login_007.clickonNaukriBlogSLink();
		System.out.println("It Should opn Naukri BLog WebPage");
		TS_Login_007.waitMethod();
	}
	//actual Test Case 027
	@Test
	public void testcase_027()
	{
		TS_Login_007.clickonFAQSLink();
		System.out.println("It Should Open FAQ WebPage");
		TS_Login_007.waitMethod();
	}
	//Actual Test Case 028
	@Test
	public void testcase_028()
	{
		TS_Login_007.clickonTakeHomeCalculatorSLink();
		System.out.println("It Should Open Take Home Calculator WebPage");
		TS_Login_007.waitMethod();
	}
	//Actual Test Case 029
	@Test
	public void testcase_029()
	{
		TS_Login_007.clickonMSSLink();
		System.out.println("It Should Open MS WebPage");
		TS_Login_007.waitMethod();
	}
	
	//Actual Test Case 030
	@Test
	public void testcase_030()
	{
		TS_Login_007.clickonSOPSLink();
		System.out.println("It Should Open SOP WebPage");
		TS_Login_007.waitMethod();
	}
	
	//After Each Test Case
	@AfterMethod
	public void AfterEachTestCase() throws AWTException
	{
		TS_Login_007.pressCtrlW();
		TS_Login_007.waitMethod();
	}
	//Run After All Test Case
	@AfterTest
	public void AfterAllTestCase()
	{
		TS_Login_007.closeAllBrowser();
	}
}
