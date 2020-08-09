import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_Login_002 implements NaukriInputs{
	public NaukriReusables TS_Login_002;
	
	//Before All Test
	@BeforeTest
	public void BeforeAllTest()
	{
	TS_Login_002.setPropertyChrome();
	TS_Login_002.chromeBrowser();
	TS_Login_002.naukriURL();
	TS_Login_002.waitMethod();
	TS_Login_002.maximizeBrowser();
	}
	
	//RunBefore Each Test
	@BeforeMethod
	public void BeforeEachTest()
	{
		TS_Login_002.mousehoverJobLink();
		TS_Login_002.waitMethod();
	}
	
	// Actual Test Case 011
	@Test
	public void testcase_011()
	{
		TS_Login_002.clickonSearchJobsSLink();
		TS_Login_002.waitMethod();
		TS_Login_002.closeCurrentBrowser();
		
		System.out.println("It should open new tab");
	}
	
	// Run After Each Test Case
	@AfterMethod
	public void afterEachTest() {
		TS_Login_002.refreshBrowser();
	}

	
}
