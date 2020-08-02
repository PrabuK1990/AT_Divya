package facebook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookReusables {
	
	public WebDriver chrome;
	public WebDriver firefox;
	
	
	//Set path to locate chromedriver exe file
	public void setPropertyChrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	}
	
	//SetPath to Locate Firefox File
	public void setPropertyFirefox()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	}
	
	//Launch Firefox Browser
	public void fireFoxBrowser()
	{
		firefox = new FirefoxDriver();
	}
	
	//Launch Chrome Browser
	public void chromeBrowser()
	{
		chrome = new ChromeDriver();
	}
	
	//Enter URL in the browser
	public void facebookURL()
	{
		chrome.get("https://www.facebook.com/");
	}
	
	//Close Current Browser
	public void closeCurrentBrowser()
	{
		chrome.close();
	}
	
	//Close All Browser
	public void closeAllBrowser()
	{
		chrome.quit();
	}
	
	//Maximize browser
	public void maximizeBrowser()
	{
		chrome.manage().window().maximize();
	}
			
	//Enter Email Id in Email Textbox
	public void enterEmailID()
	{
		chrome.findElement(By.id("email")).sendKeys("divya@gmail.com");
	}
	
			
	//Enter Password ID in Password Textbox
	public void enterPassword()
	{
		chrome.findElement(By.id("pass")).sendKeys("divya123");
	}
	
			
	//Click Login Button
	public void clickLoginButton()
	{
		chrome.findElement(By.id("u_0_b")).click();
	}
	//Enter First Name
	public void enterName()
	{
		chrome.findElement(By.id("u_0_o")).sendKeys("Divya");
	}
	
	//Enter Surname
	public void EnterSurName()
	{
		chrome.findElement(By.name("lastname")).sendKeys("Ganta");
	}
	
	//Enter Mobile Number
	public void EnterMobileNum()
	{
		chrome.findElement(By.name("reg_email__")).sendKeys("1234567890");
	}
	
	//Enter Password
	public void enterSignupPassword()
	{
		chrome.findElement(By.name("reg_passwd__")).sendKeys("1234567890");
	}
	
	//Enter Birthday Date day
	public void EnterDOBDate()
	{
		chrome.findElement(By.name("birthday_day")).sendKeys("2");
	}
			
	//Enter Birthday Month
	public void EnterDOBMonth()
	{
		chrome.findElement(By.name("birthday_month")).sendKeys("6");
	}
			
	//Enter Birthday Year
	public void EnterDOBYear()
	{
		chrome.findElement(By.name("birthday_year")).sendKeys("1987");
	}
			
	//Click Female radio button
	public void ClickGender()
	{
		chrome.findElement(By.name("sex")).click();
	}

	//Click Sign up Button
	public void ClickSignUP()
	{
		chrome.findElement(By.name("websubmit")).click();
	}
	
}
