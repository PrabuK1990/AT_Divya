import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_Login_001 extends NaukriInputs {

	public NaukriReusables TS_Login_001;

	// Before All Test Case
	@BeforeTest
	public void beforeAllTest() throws IOException {
		TS_Login_001 = new NaukriReusables();
		NaukriInputs inputs = new NaukriInputs();
		inputs.loadExcel();
		TS_Login_001.setPropertyChrome();
		TS_Login_001.chromeBrowser();
		TS_Login_001.naukriURL();
		TS_Login_001.maximizeBrowser();
	}

	// Run Before Each Test Case
	@BeforeMethod
	public void beforeEachTest() {
		TS_Login_001.waitMethod();
		TS_Login_001.clickLoginLink();
		TS_Login_001.waitMethod();
	}

	// Actual Test Case 001
	@Test
	public void testcase_001() {
		System.out.println("Check whether the username field accepts login valid inputs login");
		String usr[] = { NaukriInputs_UserName1, NaukriInputs_UserName2, NaukriInputs_UserName3,
				NaukriInputs_UserName4 };

		for (int i = 0; i < usr.length; i++) {
			TS_Login_001.enterUsername(usr[i]);// Passing Parameter/Arguement
			System.out.println(usr[i]);
			TS_Login_001.waitMethod();
			TS_Login_001.clickLoginButton();
			TS_Login_001.clearUsername();
		}
		System.out.println("No error message should display.");
	}

	// Actual Test Case 002
	@Test
	public void testcase_002() {
		System.out.println("Check whether the username field accepts Login Invalid inputs Login");

		String usr[] = { NaukriInputs_InUserName1, NaukriInputs_InUserName2, NaukriInputs_InUserName3 };

		for (int i = 0; i < usr.length; i++) {
			// Enter username
			TS_Login_001.enterUsername(usr[i]);// Passing Parameter/Arguement
			System.out.println(usr[i]);
			TS_Login_001.waitMethod();
			TS_Login_001.clickLoginButton();
			TS_Login_001.clearUsername();
		}

		System.out.println("Error message should display as Please Enter Valid Email/Password");
	}

	// Actual Test Case 003
	@Test
	public void testcase_003() {
		System.out.println("Check whether the textbox outline is in red color");

		String usr[] = { NaukriInputs_InUserName1, NaukriInputs_InUserName2, NaukriInputs_InUserName3 };

		for (int i = 0; i < usr.length; i++) {
			// Enter username
			TS_Login_001.enterUsername(usr[i]);// Passing Parameter/Arguement
			System.out.println(usr[i]);
			TS_Login_001.waitMethod();
			TS_Login_001.clickLoginButton();
			TS_Login_001.clearUsername();
		}

		// TC_Login_003.enterUsername("!@20");

		System.out.println("Email ID Textbox outline should be in red colour");
	}

	// Actual Test case 004
	@Test
	public void testcase_004() {
		System.out.println("Check whether error message text is in red color");

		String usr[] = { NaukriInputs_InUserName1, NaukriInputs_InUserName2, NaukriInputs_InUserName3 };

		for (int i = 0; i < usr.length; i++) {
			// Enter username
			TS_Login_001.enterUsername(usr[i]);// Passing Parameter/Arguement
			System.out.println(usr[i]);
			TS_Login_001.waitMethod();
			TS_Login_001.clickLoginButton();
			TS_Login_001.clearUsername();
		}

		System.out.println("Error Message should be in Red Colour");

	}

	// Actual Test case 005
	@Test
	public void testcase_005() {
		System.out.println("Check whether the default included in the email text box");
		System.out.println("Default Text will be display in Email Id Text Box");
	}

	// Actual Test case 006
	@Test
	public void testcase_006() {
		System.out.println("Check whether the password field accepts Login valid inputs Login");

		// Enter username
		TS_Login_001.enterUsername(NaukriInputs_UserName1);

		String usr[] = { NaukriInputs_PassWord1, NaukriInputs_PassWord2 };

		for (int i = 0; i < usr.length; i++) {
			TS_Login_001.enterPassword(usr[i]);// Passing Parameter/Arguement
			System.out.println(usr[i]);
			TS_Login_001.waitMethod();
			TS_Login_001.clickLoginButton();
			TS_Login_001.clearPassword();
		}

		System.out.println("Open to the web page/Home page");
	}
	
	//Actual Test case 007
	@Test
	public void testcase_007()
	{
		System.out.println("Check whether the password field accepts Login Invalid inputs Login");
		TS_Login_001.enterUsername(NaukriInputs_UserName1);
		
		//Enter  Invalid Password
		TS_Login_001.enterPassword(NaukriInputs_InPassWord);

		//wait
		TS_Login_001.waitMethod();
		
		//Click on Login Button
		TS_Login_001.clickLoginButton();
		
		System.out.println("Error message should be display as Invalid details, plese check Email ID-password");
	}
	
	//Actual Test Case 008
	@Test
	public void testcase_008()
	{
		System.out.println("Check whether the textbox outline is in red color");
		//Enter username
		TS_Login_001.enterUsername(NaukriInputs_UserName1);
		
		//Enter Password
		TS_Login_001.enterPassword(NaukriInputs_InPassWord);

		//wait
		TS_Login_001.waitMethod();
		
		//Click on Login Button
		TS_Login_001.clickLoginButton();
		
		System.out.println("Error message should display as Please Enter Valid Email/Password");
	}
	
	//Actual Test Case 009
	@Test
	public void testcase_009()
	{
		System.out.println("Check whether error message text is in red color");
		//Enter username
		TS_Login_001.enterUsername(NaukriInputs_UserName1);
		
		//Enter Password
		TS_Login_001.enterPassword(NaukriInputs_InPassWord);

		//wait
		TS_Login_001.waitMethod();
		
		//Click on Login Button
		TS_Login_001.clickLoginButton();
		
		System.out.println("Error message should be display in red colour");
	
	}
	
	//Actual Test Case 010
	@Test
	public void testcase_010()
	{
		System.out.println("Check Wether Default Text is in Password Field");
		System.out.println("Default Text include Should be in Password text box");
	}

	// Run After Each Test Case
	@AfterMethod
	public void afterEachTest() {
		TS_Login_001.refreshBrowser();
	}

	// After All Test Case
	@AfterTest
	public void afterAllTest() throws IOException, InterruptedException {
		TS_Login_001.closeAllBrowser();
		//Email email = new Email();
		//email.sendEmail();
	}

}
