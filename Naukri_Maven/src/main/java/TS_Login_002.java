import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_Login_002 extends NaukriInputs{
	
	public NaukriReusables TS_Login_002;

	// Before All Test
	@BeforeTest
	public void BeforeAllTest() throws IOException {
		TS_Login_002 = new NaukriReusables();
		NaukriInputs inputs = new NaukriInputs();
		inputs.loadExcel();
		TS_Login_002.setPropertyChrome();
		TS_Login_002.chromeBrowser();
		TS_Login_002.naukriURL();
		TS_Login_002.waitMethod();
		TS_Login_002.maximizeBrowser();
	}

	// RunBefore Each Test
	@BeforeMethod
	public void BeforeEachTest() {
		TS_Login_002.refreshBrowser();
		TS_Login_002.waitMethod();
		TS_Login_002.mousehoverJobLink();
		TS_Login_002.waitMethod();
	}

	// Actual Test Case 011
	@Test
	public void testcase_011() {
		TS_Login_002.clickonSearchJobsSLink();
		System.out.println("It should open Search Job new tab");
	}
	
	// ACtual Test case 012
	@Test
	public void testcase_012()
	{
		TS_Login_002.clickonAdvancedSLink();
		System.out.println("It Should Open Advanced Job New tab");
	}
	
	//Actual Test case 013
	@Test
	public void testcase_013()
	{
		TS_Login_002.clickonCreateFreeJobAlertsLink();
		System.out.println("It Should Open Job Alerts New Tab");
	}

	// Run After Each Test Case
	@AfterMethod
	public void afterEachTest() throws AWTException {
		TS_Login_002.waitMethod();
		TS_Login_002.pressCtrlW();
	}

	// Run After All Test Case
	@AfterTest
	public void afterAllTest() {
		TS_Login_002.closeAllBrowser();
	}

}
