import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukriReusables implements NaukriInputs, NaukriControls {

public WebDriver chrome;
public WebDriver firefox;
	
	//Set path to locate chromedriver exe file
	public void setPropertyChrome()
	{
		System.setProperty("webdriver.chrome.driver", "src\\resources\\drivers\\chromedriver.exe");	
	}
	
	//Launch Chrome Browser
	public void chromeBrowser()
	{
		chrome = new ChromeDriver();
	}
	
	//Set path to locate Frifrefox exe file
	public void setPropertyFirefox()
	{
		System.setProperty("webdriver.gecko.driver", "src\\resources\\drivers\\geckodriver.exe");
	}
	
	//Launch Firefox Browser
	public void firefoxBrowser()
	{
		firefox = new FirefoxDriver();
	}
	
	//Enter URL in the browser
	public void naukriURL()
	{
		chrome.get(NaukriInputs_Url);
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
	
	//Click Login Link
	public void clickLoginLink()
	{
		chrome.findElement(By.xpath(NaukriControls_LoginLink)).click();
	}
	
	//Enter Username Textbox
	public void enterUsername(String userName)
	{
		chrome.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys(userName);
	}
	
	//Clear Username Textbox
	public void clearUsername()
	{
		chrome.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).clear();
	}
	
	//Enter PassWord Textbox
	public void enterPassword(String password)
	{
		chrome.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(password);
	}
	
	//Clear PassWord Textbox
	public void clearPassword()
	{		
		chrome.findElement(By.xpath("//input[@placeholder='Enter your password']")).clear();
	}
	
	//Click On Login Button
	public void clickLoginButton()
	{
		chrome.findElement(By.xpath("//button[text()='Login']")).click();
	}
	
	//wait Method Call
	public void waitMethod()
	{
		try 
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	//Click On ForEmployers Login Page
	public void ForEmployers()
	{
		chrome.findElement(By.xpath("//a[@data-ga-track = 'Main Navigation My Naukri|For Employers']")).click();
	}
	
	//Click on Sale Enquiry Button
	public void saleEnquiry()
	{
		chrome.findElement(By.xpath("li[@class ='boxSel active']")).click();
	}
	
	//Click on Name Text Box// its not taking the Xpath address
	public void employerName(String Employername)
	{
		chrome.findElement(By.xpath("input [@data-label = 'Name']")).sendKeys(Employername);     
	}
	
	//Clear Employer Name Text Box
	public void clearEmployerName()
	{
		chrome.findElement(By.xpath("input [@data-label = 'Name']")).clear();
	}
	
	//Click on Employer Submit Enquiry Button
	public void employerSubmitEnquiry()
	{
		chrome.findElement(By.xpath("//button [@style = 'background: #2870C1;border-radius: 4px;box-shadow: 0 2px 6px 0 rgba(9, 50, 131, 0.2);font-size:14px;line-height:20px;padding:0px;margin-top: 10px;text-transform:capitalize;font-size:16px']")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
}