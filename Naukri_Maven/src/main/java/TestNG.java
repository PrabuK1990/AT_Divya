import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {

	@BeforeTest
	public void Launch_Browser() {
		System.out.println("Launch Chrome Broser");
	}

	// Actual Test Case 01
	@Test
	public void TC_001() {
		System.out.println("Enter Naukri URL");
	}

	// Actual Test Case 02
	@Test
	public void TC_002() {
		System.out.println("Page Refresh");
	}

	// Actual Test Case 03
	@Test
	public void TC_003() {
		System.out.println("Wait For 3 Seconds");
	}

	// Actual Test Case 04
	@Test
	public void TC_004() {
		System.out.println("Test Case 01");
	}

	@Test
	public void TC_005() {
		System.out.println("Page Refresh");
	}

	// Actual Test Case 06
	@Test
	public void TC_006() {
		System.out.println("Wait For 3 Seconds");
	}

	// Actual Test Case 07
	@Test
	public void TC_007() {
		System.out.println("Test Case 02");
	}

	@Test
	public void TC_008() {
		System.out.println("Page Refresh");
	}

	// Actual Test Case 06
	@Test
	public void TC_00() {
		System.out.println("Wait For 3 Seconds");
	}

	@AfterTest
	public void nnn() {
		System.out.println("Close Chrome Browser");
	}
}

// TestNG
// TesgNG is a in build Framework(Setup)
// In TestNG we have many annotations available - annotations starts with "@"
// @Test - If we mention "@Test" on top of method/function then it is going to
// execute as actual test case
// @BeforeMethod - Before Each Test 
//@AfterMethod - After Each test
//@BeforeTest - Before All Test 
//@AfterTest - After All Test
//@BeforeSuite, @AfterSuite, @BeforeGroup, @AfterGroup