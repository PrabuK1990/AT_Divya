import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS_Login_02 extends MoneySuperMarketInputs
{
public MoneySuperMarketReusables TS_Login_02;

@BeforeTest
public void beforeAllTest() throws IOException
{
	TS_Login_02 = new MoneySuperMarketReusables();
	MoneySuperMarketInputs inputs = new MoneySuperMarketInputs();
	inputs.loadExcel();
	TS_Login_02.setPropertChrome();
	TS_Login_02.chromeBrowser();
	TS_Login_02.moneySuperMarketURL();
	TS_Login_02.maximizeBrowser();
	TS_Login_02.waitMethod();
	TS_Login_02.acceptsAll();
}

@BeforeMethod
public void beforeEachTest()
{
	TS_Login_02.waitMethod();
}

@Test
public void testcase_17()
{
	System.out.println("Check Wether MouseOver Working on Insurance Link");
	TS_Login_02.MousehoverInsurance();
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
