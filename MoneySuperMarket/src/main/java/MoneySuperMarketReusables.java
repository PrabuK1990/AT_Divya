

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MoneySuperMarketReusables extends MoneySuperMarketInputs implements MoneySuperMarketControls {
	public WebDriver chrome;
	public WebDriver firefox;
	
	
	public void setPropertChrome()
	{
		System.setProperty("webdriver.chrome.driver", "src\\resources\\drivers\\chromedriver.exe");
	}
	
	public void chromeBrowser()
	{
		chrome = new ChromeDriver();
	}
	
	public void setProprtyFirefox()
	{
		System.setProperty("Webdriver.gecko.driver", "src\\resources\\drivers\\geckodriver.exe");
	}
	
	public void fireFoxBrowser()
	{
		firefox = new FirefoxDriver();
	}
	
	public void moneySuperMarketURL()
	{
		chrome.get(MSMInputs_URL);
	}
	
	public void closeCurrentBrowser()
	{
		chrome.close();
	}
	
	public void closeAllBrowser()
	{
		chrome.quit();
	}
	
	public void maximizeBrowser()
	{
		chrome.manage().window().maximize();
	}
	public void refreshBrowser()
	{
		chrome.navigate().refresh();
	}
	public void clickOnLoginLink()
	{
		chrome.findElement(By.xpath(MSMControls_LoginLink)).click();
	}
	public void clickOnEmailID()
	{
		chrome.findElement(By.xpath(MSMControls_EmailID)).click();
	}
	public void enterEmailID(String EmailID)
	{
		chrome.findElement(By.xpath(MSMControls_EmailID)).sendKeys(EmailID);
	}
	public void clearEmailID()
	{
		chrome.findElement(By.xpath(MSMControls_EmailID)).clear();
	}
	public void clickOnPassWord()
	{
		chrome.findElement(By.xpath(MSMControls_Password)).clear();
	}
	public void clearPassWord()
	{
		chrome.findElement(By.xpath(MSMControls_Password)).clear();
	}
	public void enterPassWord(String PassWord)
	{
		chrome.findElement(By.xpath(MSMControls_Password)).sendKeys(PassWord);
	}
	public void checkBox()
	{
		chrome.findElement(By.xpath(MSMControls_CheckBox)).click();
	}
	public void forgetPassword()
	{
		chrome.findElement(By.xpath(MSMControls_ForgetPassword)).click();
	}
	public void waitMethod()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	public void clickOnLoginButton()
	{
		chrome.findElement(By.xpath(MSMControls_ClickLoginButton));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
