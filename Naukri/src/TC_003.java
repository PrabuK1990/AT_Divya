import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_003 {

	public static void main(String[] args) {
		
		//Launch Chrome Browser and enter Facebook URL
System.out.println("Test Starts");
		
		//Set path to locate chromedriver exe file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Create instance of ChromeDriver() class
		//Store it in object and name it as "chrome"
		//Declare the interface type before as "WebDriver"
		WebDriver chrome = new ChromeDriver();
		
		//Enter URL in the browser
		chrome.get("https://www.facebook.com/");
		
		//Maximize browser
		chrome.manage().window().maximize();
		
		//Enter Email Id in Email Textbox
		//chrome.findElement(By.id("email")).sendKeys("divya@gmail.com");
		
		//Enter Password ID in Password Textbox
		//chrome.findElement(By.id("pass")).sendKeys("divya123");
		
		//Click Login Button
		//chrome.findElement(By.id("u_0_b")).click();
		
		//Close current browser
		//chrome.close();

		//Enter First Name
		chrome.findElement(By.id("u_0_o")).sendKeys("Divya");
		//chrome.findElement(By.xpath("1")).sendKeys("Divya");
		//Enter Surname
		chrome.findElement(By.name("lastname")).sendKeys("Ganta");
		//Enter Mobile Number
		chrome.findElement(By.name("reg_email__")).sendKeys("07912987069");
		//Enter Password
		chrome.findElement(By.name("reg_passwd__")).sendKeys("div123");
		//Click Female radio button
		chrome.findElement(By.name("sex")).click();
		//Click Sign up Button
		chrome.findElement(By.name("websubmit")).click();
		//Close all browsers
		//chrome.quit();
		
		System.out.println("Test Ends");
	}
}
