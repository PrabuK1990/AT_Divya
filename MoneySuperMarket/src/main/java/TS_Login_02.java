import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_Login_02 extends MoneySuperMarketInputs {
	public MoneySuperMarketReusables TS_Login_02;

	@BeforeTest
	public void beforeAllTest() throws IOException {
		TS_Login_02 = new MoneySuperMarketReusables();
		MoneySuperMarketInputs inputs = new MoneySuperMarketInputs();
		inputs.loadExcel();
		TS_Login_02.setPropertChrome();
		TS_Login_02.chromeBrowser();
		TS_Login_02.moneySuperMarketURL();
		TS_Login_02.maximizeBrowser();
		TS_Login_02.waitMethod();
		// TS_Login_02.acceptsAll();
	}

	@BeforeMethod
	public void beforeEachTest() {
		TS_Login_02.waitMethod();
	}

	@Test
	public void testcase_17() 
	{
		System.out.println("Check Wether MouseOver Working on Insurance Link");
		TS_Login_02.mousehoverInsurance();
		TS_Login_02.waitMethod();
		System.out.println("It Should Show All SubLink of the Insurance");
	}
	
	@Test
	public void testcase_18()
	{
		System.out.println("Check Wether Car Insurance SubLink Working");
		TS_Login_02.mousehoverInsurance();
		TS_Login_02.waitMethod();
		TS_Login_02.clickonCarInsuranceSLink();
		TS_Login_02.waitMethod();
		//TS_Login_02.closeCurrentBrowser();
	}
	
	@Test
	public void testcase_19()
	{
		System.out.println("Check wether Young Driver Insurance SubLink Working");
		TS_Login_02.mousehoverInsurance();
		TS_Login_02.waitMethod();
		TS_Login_02.clickonYoungDriversInsuranceSLink();
		TS_Login_02.waitMethod();
		//TS_Login_02.closeCurrentBrowser();
		System.out.println("It Should Open Young Driver Insurance Webpage");
	}
	
	@Test
	public void testcase_20()
	{
		System.out.println("Check Wether MouseHover on Money Link in Working");
		TS_Login_02.mousehoverMoney();
		TS_Login_02.waitMethod();
		System.out.println("It Should show all SubLinks of Money");
	}
	
	@Test
	public void testcase_21()
	{
		System.out.println("Check Wether Credit Card SubLink Working");
		TS_Login_02.mousehoverMoney();
		TS_Login_02.waitMethod();
		TS_Login_02.clickonCreditCardsSLink();
		TS_Login_02.waitMethod();
		//TS_Login_02.closeCurrentBrowser();
		System.out.println("It should open Credit cards Webpage");
	}
	
	@Test
	public void testcase_22()
	{
		System.out.println("Check Wether Loans SubLink Working");
		TS_Login_02.mousehoverMoney();
		TS_Login_02.waitMethod();
		TS_Login_02.clickonLoansSlink();
		TS_Login_02.waitMethod();
		System.out.println("It Should Open Loans WebPage");
	}
	
	@Test
	public void testcase_23()
	{
		System.out.println("Check Wether MouseHover On Energy Module is Working");
		TS_Login_02.mousehoverEnergy();
		TS_Login_02.waitMethod();
		System.out.println("It should Show All SubLink List of Energy");
	}
	
	@Test
	public void testcase_24()
	{
		System.out.println("Check Wether Compare Gas and Electricity SubLink Working");
		TS_Login_02.mousehoverEnergy();
		TS_Login_02.waitMethod();
		TS_Login_02.clickonCompareGasAndElectricitySLink();
		TS_Login_02.waitMethod();
		System.out.println("It Should Open new WebPage for Compare Gas and Electricity");
	}
	
	@Test
	public void testcase_25()
	{
		System.out.println("Check Wether Compare Electricity SubLink Working");
		TS_Login_02.mousehoverEnergy();
		TS_Login_02.waitMethod();
		TS_Login_02.clickonCompareElectricitySLink();
		TS_Login_02.waitMethod();
		System.out.println("It Should open Compare-Electricity WebPage");
	}
	
	@Test
	public void testcase_26()
	{
		System.out.println("Check Wether MouseHover on Broadband is working");
		TS_Login_02.mousehoverBroadband();
		TS_Login_02.waitMethod();
		System.out.println("It Should Show All SubLink List of Broadband");
	}
	
	@Test
	public void testcase_27()
	{
		System.out.println("Check Wether Broadband SubLink Working");
		TS_Login_02.mousehoverBroadband();
		TS_Login_02.waitMethod();
		TS_Login_02.clickonBroadbandSLink();
		TS_Login_02.waitMethod();
		System.out.println("It Should open Brodband Webpage");
	}
	//after this the page is not return to home page
	
	@Test
	public void testcase_28()
	{
		System.out.println("Check Wether Student Broadband SubLink Working");
		TS_Login_02.mousehoverBroadband();
		TS_Login_02.waitMethod();
		TS_Login_02.clickonStudentBroadbandSLink();
		TS_Login_02.waitMethod();
		System.out.println("It Should open Student -Broadband Webpage");
	}
	
	@Test
	public void testcase_29()
	{
		System.out.println("Check Wether MouseHover on Mobile Phones working");
		TS_Login_02.mousehoverMobilePhones();
		TS_Login_02.waitMethod();
		System.out.println("It Should Show the List of all SubLinks of Mobile Phones");
	}
	
	@Test
	public void testcse_30()
	{
		System.out.println("Check Wether Mobile Phones SubLink Working");
		TS_Login_02.mousehoverMobilePhones();
		TS_Login_02.waitMethod();
		TS_Login_02.clickonMobilePhonesSLink();
		TS_Login_02.waitMethod();
		System.out.println("It Should open Mobile Phone Webpage");
	}
	
	@Test
	public void testcase_31()
	{
		System.out.println("Check Wether Latest Mobile-Phone SubLink Working");
		TS_Login_02.mousehoverMobilePhones();
		TS_Login_02.waitMethod();
		TS_Login_02.clickonLatestMobilePhoneSLink();
		TS_Login_02.waitMethod();
		System.out.println("It Should Open Latest Mobile-Phone");
	}
	
	@Test
	public void testcase_32()
	{
		System.out.println("Check Wether MouseHover on Travel is Working");
		TS_Login_02.mousehoverTravel();
		TS_Login_02.waitMethod();
		System.out.println("It Should Show the List of All SubLink of Travel");	
	}
	
	@Test
	public void testcase_33()
	{
		System.out.println("Check Wether Holidays SubLink Working");
		TS_Login_02.mousehoverTravel();
		TS_Login_02.waitMethod();
		TS_Login_02.clickonHolidaysSLink();
		TS_Login_02.waitMethod();
		System.out.println("It Should Open Holidays Webpage");
	}
	
	@Test
	public void testcase_34()
	{
		System.out.println("Check Wether Car Hire SubLink Working");
		TS_Login_02.mousehoverTravel();
		TS_Login_02.waitMethod();
		TS_Login_02.clickonCarHireSLink();
		TS_Login_02.waitMethod();
		System.out.println("It Should Open Car Hire WebPage");
	}
	
	@Test
	public void testcase_35()
	{
		System.out.println("Check Wether MouseHover On CreditMonitor Module");
		TS_Login_02.mousehoverCreditMonitor();
		TS_Login_02.waitMethod();
		System.out.println("It Should Show the All SubList ofCredit Monitor");
	}
	
	@Test
	public void testcase_36()
	{
		System.out.println("Check Wether Find Out More SubLink Working");
		TS_Login_02.mousehoverCreditMonitor();
		TS_Login_02.waitMethod();
		TS_Login_02.clickonFinOutMore();
		TS_Login_02.waitMethod();
		System.out.println("It Should Open Find Out More WebPage");
	}
	
	@Test
	public void testcase_37()
	{
		System.out.println("Check Wether Check Your Score SubLink Working");
		TS_Login_02.mousehoverCreditMonitor();
		TS_Login_02.waitMethod();
		TS_Login_02.clickonCheckYourScore();
		TS_Login_02.waitMethod();
		System.out.println("It Should Open Check Your-Score WebPage");
	}
	
	@AfterMethod
	public void afterEachTest()
	{
		TS_Login_02.refreshBrowser();
	}

	@AfterTest
	public void afterAllTest()
	{
		TS_Login_02.closeAllBrowser();
	}
}
