

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_Login_01 extends MoneySuperMarketInputs {
	public MoneySuperMarketReusables TS_Login_01;

	@BeforeTest
	public void beforeAllTest() throws IOException {
		TS_Login_01 = new MoneySuperMarketReusables();

		MoneySuperMarketInputs inputs = new MoneySuperMarketInputs();
		inputs.loadExcel();
		TS_Login_01.setPropertChrome();
		TS_Login_01.chromeBrowser();
		TS_Login_01.moneySuperMarketURL();
		TS_Login_01.maximizeBrowser();
	}

	@BeforeMethod
	public void beforeEachTest() {
		TS_Login_01.waitMethod();
		TS_Login_01.clickOnLoginLink();
		TS_Login_01.waitMethod();
	}

	@Test
	public void testcase_01() {
		System.out.println("Check whether the  EmailID  field accepts valid inputs");
		TS_Login_01.clearEmailID();
		TS_Login_01.clearEmailID();
		String usr[] = { MSMInputs_EmailID1, MSMInputs_EmailID2 };

		for (int i = 0; i < usr.length; i++) {
			TS_Login_01.enterEmailID(usr[i]);// Passing Parameter/Arguement
			System.out.println(usr[i]);
			TS_Login_01.waitMethod();
			TS_Login_01.clickOnLoginButton();
			TS_Login_01.clearEmailID();
		}
		System.out.println("No error message should display.");
	}

	@Test
	public void testcase_02() {
		System.out.println("Check Wether Email Id Field Shows Default Text");
		TS_Login_01.clickOnEmailID();
		TS_Login_01.waitMethod();
		System.out.println("It Show the Default Text");
	}

	@Test
	public void testcase_03() {
		System.out.println("Check Wether Email Id Field Text Box is in Black Color");
		TS_Login_01.clickOnEmailID();
		TS_Login_01.waitMethod();
		System.out.println("EmailID field Text Box is in Black Color");
	}

	@Test
	public void testcase_04() {
		System.out.println("Check Wether Email Id Field Accept the In Valid Email ID ");
		TS_Login_01.clickOnEmailID();
		TS_Login_01.clearEmailID();
		String usr[] = { MSMInputs_InEmailID1, MSMInputs_InEmailID2 };

		for (int i = 0; i < usr.length; i++) {
			TS_Login_01.enterEmailID(usr[i]);// Passing Parameter/Arguement
			System.out.println(usr[i]);
			TS_Login_01.waitMethod();
			TS_Login_01.clickOnLoginButton();
			TS_Login_01.waitMethod();
			TS_Login_01.clearEmailID();
		}
		System.out.println("Showes Error Message as Oh we can't find your Email Id");
	}

	@Test
	public void testcase_05() {
		System.out.println("Check Wether Email Id Text Box is in red colour When you Enter the In Valid Email Id");
		TS_Login_01.clickOnEmailID();
		TS_Login_01.clearEmailID();
		String usr[] = { MSMInputs_InEmailID1, MSMInputs_InEmailID2 };

		for (int i = 0; i < usr.length; i++) {
			TS_Login_01.enterEmailID(usr[i]);// Passing Parameter/Arguement
			System.out.println(usr[i]);
			TS_Login_01.waitMethod();
			TS_Login_01.clickOnLoginButton();
			TS_Login_01.waitMethod();
			TS_Login_01.clearEmailID();
		}
		System.out.println("Email ID Text Box is in Red Color");
	}

	@Test
	public void testcase_06() {
		System.out.println("Check Wether Error Message Color is in Black Color");
		TS_Login_01.clickOnEmailID();
		TS_Login_01.clearEmailID();
		String usr[] = { MSMInputs_InEmailID1, MSMInputs_InEmailID2 };

		for (int i = 0; i < usr.length; i++) {
			TS_Login_01.enterEmailID(usr[i]);// Passing Parameter/Arguement
			System.out.println(usr[i]);
			TS_Login_01.waitMethod();
			TS_Login_01.clickOnLoginButton();
			TS_Login_01.waitMethod();
			TS_Login_01.clearEmailID();
		}
		System.out.println("Error Message Color is in Black");
	}

	@Test
	public void testcase_07() {
		System.out.println("Check Wether Email Id Text Box is in red colour When you Enterthe In Valid Email Id");
		TS_Login_01.clearEmailID();
		TS_Login_01.enterEmailID(MSMInputs_EmailID1);
		TS_Login_01.clickOnPassWord();
		TS_Login_01.clearPassWord();
		String usr[] = { MSMInputs_PassWord1, MSMInputs_PassWord2 };
		for (int i = 0; i < usr.length; i++) {
			TS_Login_01.enterPassWord(usr[i]);
			System.out.println("usr[i]");
			TS_Login_01.waitMethod();
			TS_Login_01.clickOnLoginButton();
			TS_Login_01.waitMethod();
			TS_Login_01.clearPassWord();
		}
		System.out.println("No Error Message Display");
	}

	@Test
	public void testcase_08() {
		System.out.println("Check Wether Password Field Show Default Text");
		TS_Login_01.clearEmailID();
		TS_Login_01.enterEmailID(MSMInputs_EmailID1);
		TS_Login_01.clearPassWord();
		TS_Login_01.clickOnPassWord();
		System.out.println("IT Showes Default Test as Plese Let Us Know Your Password");

	}

	@Test
	public void testcase_09() {
		System.out.println("Check Wether Password Field Text Box is in Black Color");
		TS_Login_01.clearEmailID();
		TS_Login_01.enterEmailID(MSMInputs_EmailID1);
		TS_Login_01.clearPassWord();
		TS_Login_01.clickOnPassWord();
		System.out.println("The Password Feild Text Box Color is Black");
	}

	@Test
	public void testcase_10() {
		System.out.println("Check Wether Password Field Accept the Invalid Password and Show Error Message");
		TS_Login_01.clearEmailID();
		TS_Login_01.enterEmailID(MSMInputs_EmailID1);
		TS_Login_01.clickOnPassWord();
		TS_Login_01.clearPassWord();
		TS_Login_01.enterPassWord(MSMInputs_InPassWord1);
		System.out.println(MSMInputs_InPassWord1);
		TS_Login_01.waitMethod();
		TS_Login_01.clickOnLoginButton();
		TS_Login_01.waitMethod();
		TS_Login_01.clearPassWord();
	System.out.println("It Showes Error Message as Please Eneter Password as 6 charecters or more");
	}
	
	@Test
	public void testcase_11()
	{
		System.out.println("Check Wether Password Field TextBox is in Red Color ");
		TS_Login_01.clearEmailID();
		TS_Login_01.enterEmailID(MSMInputs_EmailID1);
		TS_Login_01.clickOnPassWord();
		TS_Login_01.clearPassWord();
		TS_Login_01.enterPassWord(MSMInputs_InPassWord1);
		System.out.println(MSMInputs_InPassWord1);
		TS_Login_01.waitMethod();
		TS_Login_01.clickOnLoginButton();
		TS_Login_01.waitMethod();
		TS_Login_01.clearPassWord();
		System.out.println("The Password Feild Text Box Color is Red ");
	}
	
	@Test
	public void testcase_12()
	{
		System.out.println("Check Wether Error Message Shown When you give Invalid Password");
		TS_Login_01.clearEmailID();
		TS_Login_01.enterEmailID(MSMInputs_EmailID1);
		TS_Login_01.clickOnPassWord();
		TS_Login_01.clearPassWord();
		TS_Login_01.enterPassWord(MSMInputs_InPassWord2);
		System.out.println(MSMInputs_InPassWord2);
		TS_Login_01.waitMethod();
		TS_Login_01.clickOnLoginButton();
		TS_Login_01.waitMethod();
		TS_Login_01.clearPassWord();
		System.out.println("Error Message is as Look Like This Isn't matching the Password we have for you.Give it another try");
		
	}
	
	@Test
	public void testcase_13()
	{
		System.out.println("Check Wether Error Message is in black color");
		TS_Login_01.clearEmailID();
		TS_Login_01.enterEmailID(MSMInputs_EmailID1);
		TS_Login_01.clickOnPassWord();
		TS_Login_01.clearPassWord();
		TS_Login_01.enterPassWord(MSMInputs_InPassWord2);
		System.out.println(MSMInputs_InPassWord2);
		TS_Login_01.waitMethod();
		TS_Login_01.clickOnLoginButton();
		TS_Login_01.waitMethod();
		TS_Login_01.clearPassWord();
		System.out.println("Error Message is in Black Color");
	}

	@AfterMethod
	public void afterEachTest() {
		TS_Login_01.refreshBrowser();
	}

	@AfterTest
	public void afterAllTest() {
		TS_Login_01.closeAllBrowser();
	}
}
