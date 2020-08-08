import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_Login_001 implements NaukriInputs {

	public NaukriReusables TS_Login_001;

	// Before All Test Case
	@BeforeTest
	public void beforeAllTest() {
		TS_Login_001 = new NaukriReusables();
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

	// Actual Test Case 01
	@Test
	public void testcase_01() {
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

	// Actual Test Case 02
	@Test
	public void testcase_02() {
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

	// Actual Test Case 03
	@Test
	public void testcase_03() {
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
	
	

	// Run After Each Test Case
	@AfterMethod
	public void afterEachTest() {
		TS_Login_001.refreshBrowser();
	}

	// After All Test Case
	@AfterTest
	public void afterAllTest() throws IOException, InterruptedException {
		TS_Login_001.closeAllBrowser();
		Email email = new Email();
		email.sendEmail();
	}

}
