import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG {
	
	//Annotation
	@Test
	public void TC_001()
	{
		System.out.println("Test Case 01");
	}
	
	@Test
	public void TC_002()
	{
		System.out.println("Test Case 02");
		//WebDriver chrome = new ChromeDriver();
	}

}
