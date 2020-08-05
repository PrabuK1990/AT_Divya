import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.glass.events.KeyEvent;

public class NaukriReusables implements NaukriInputs, NaukriControls {

public WebDriver chrome;
public WebDriver firefox;
public ArrayList<String> listTabs;
	
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
		chrome.findElement(By.xpath(NaukriControls_LoginUserName)).sendKeys(userName);  
	}
	
	//Clear Username Textbox
	public void clearUsername()
	{
		chrome.findElement(By.xpath(NaukriControls_LoginUserName)).clear();
	}//(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).clear();

	
	//Enter PassWord Textbox
	public void enterPassword(String password)
	{
		chrome.findElement(By.xpath(NaukriControls_LoginPassword)).sendKeys(password);
	}
	
	//Clear PassWord Textbox
	public void clearPassword()
	{		
		chrome.findElement(By.xpath(NaukriControls_LoginPassword)).clear();
	}
	
	//Click On Login Button
	public void clickLoginButton()
	{
		chrome.findElement(By.xpath(NaukriControls_ClickLoginButton)).click();
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
		chrome.findElement(By.xpath(NaukriControls_ForEmployerLink)).click();
	}
	
	//Click on Sale Enquiry Button
	public void saleEnquiry()
	{
		chrome.findElement(By.xpath(NaukriControls_SaleEnquiry)).click();
	}
	
	//Switch to New tab and do actions
	public void switchToNewTab()
	{
		listTabs = new ArrayList<String>(chrome.getWindowHandles());
		chrome.switchTo().window(listTabs.get(1));
	}
	
	//Switch back to default tab and do actions
	public void switchToDefaultTab()
	{
		chrome.switchTo().window(listTabs.get(0));
	}
	
	//Click on Name Text Box// its not taking the Xpath address
	public void employerName(String Employername)
	{
		chrome.findElement(By.xpath(NaukriControls_EmployerName)).sendKeys(Employername);     
	}
	
	//Clear Employer Name Text Box
	public void clearEmployerName()
	{
		chrome.findElement(By.xpath(NaukriControls_EmployerName)).clear();
	}
	
	//Click on Employer Submit Enquiry Button
	public void employerSubmitEnquiry() throws AWTException
	{
		keboardPageDown();
		chrome.findElement(By.id(NaukriControls_EmployerSubmitEnquiry)).click();
	}
	
	
	public void keboardPageDown() throws AWTException
	{
		Robot keyboard = new Robot();
		keyboard.keyPress(KeyEvent.VK_PAGE_DOWN);
		keyboard.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	
	//Click Employer Contact Number
	public void empoyerContactNumber(String EmployerContactNumber)
	{
		chrome.findElement(By.xpath(NaukriControls_EmployerContactNumber)).sendKeys(EmployerContactNumber);
	}
	
	//Clear Employer Contact Number
	public void clearEmployerContactNumber()
	{
		chrome.findElement(By.xpath(NaukriControls_EmployerContactNumber)).clear();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}