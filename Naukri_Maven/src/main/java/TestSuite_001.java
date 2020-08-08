import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuite_001 {
	
	//Before All Test Case
	@BeforeTest
	public void beforeAllTest()
	{
		System.out.println("Launch Chrome Browser");
		System.out.println("Enter Naukri URL");
	}
	
	//Run Before Each Test Case
	@BeforeMethod
	public void beforeEachTest()
	{
		System.out.println("Wait for 3 seconds");
	}

	//Actual Test Case 01
	@Test
	public void testcase_01()
	{
		System.out.println("Test Case 01");
	}
	
	//Actual Test Case 02
	@Test
	public void testcase_02()
	{
		System.out.println("Test Case 02");
	}
	
	//Run After Each Test Case
	@AfterMethod
	public void afterEachTest()
	{
		System.out.println("Page Refresh");
	}
	
	//After All Test Case
	@AfterTest
	public void afterAllTest()
	{
		System.out.println("Close Chrome Browser");
	}

}
