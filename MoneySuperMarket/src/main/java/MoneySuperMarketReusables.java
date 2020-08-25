

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

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
		System.setProperty("webdriver.gecko.driver", "src\\resources\\drivers\\geckodriver.exe");
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
	public void show_Hide_Button()
	{
		chrome.findElement(By.xpath(MSMControls_ShowButton)).click();
	}
	public void acceptsAll()
	{
		chrome.findElement(By.xpath(MSMControls_AcceptsAll)).click();
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
	
	public void mousehoverInsurance()
	{
		Actions actions = new Actions(chrome);
		WebElement mousehoverInsurance = chrome.findElement(By.xpath(MSMControls_Insurance));
		actions.moveToElement(mousehoverInsurance).perform();
	}
	
	public void mousehoverMoney()
	{
		Actions actions = new Actions(chrome);
		WebElement mousehoverMoney = chrome.findElement(By.xpath(MSMControls_Money));
		actions.moveToElement(mousehoverMoney).perform();
	}
	
	public void mousehoverEnergy()
	{
		Actions actions = new Actions(chrome);
		WebElement mousehoverEnergy = chrome.findElement(By.xpath(MSMControls_Energy));
		actions.moveToElement(mousehoverEnergy).perform();	
	}
	
	public void mousehoverBroadband()
	{
		Actions action = new Actions(chrome);
		WebElement mousehoverBroadband = chrome.findElement(By.xpath(MSMControls_Broadband));
		action.moveToElement(mousehoverBroadband).perform();
	}
	
	public void mousehoverMobilePhones()
	{
		Actions actions = new Actions(chrome);
		WebElement mousehoverMobilePhones =chrome.findElement(By.xpath(MSMControls_MobilePhones));
		actions.moveToElement(mousehoverMobilePhones).perform();
	}
	
	public void mousehoverTravel()
	{
		Actions actions = new Actions(chrome);
		WebElement mousehoverTravel = chrome.findElement(By.xpath(MSMControls_Travel));
		actions.moveToElement(mousehoverTravel).perform();
	}
	
	public void mousehoverCreditMonitor()
	{
		Actions actions = new Actions(chrome);
				WebElement mousehoverCreditMonitor = chrome.findElement(By.xpath(MSMControls_CreditMonitor));
				actions.moveToElement(mousehoverCreditMonitor).perform();
	}
	
	public void clickonCarInsuranceSLink()
	{
		chrome.findElement(By.xpath(MSMControls_CarInsuranceSLink)).click();
	}
	
	public void clickonYoungDriversInsuranceSLink()
	{
		chrome.findElement(By.xpath(MSMControls_YoungDriversInsuranceSLink)).click();
	}
	
	public void clickonCreditCardsSLink()
	{
		chrome.findElement(By.xpath(MSMControls_CreditCardSLink)).click();
	}
	
	public void clickonLoansSlink()
	{
		chrome.findElement(By.xpath(MSMControls_LoansSLink)).click();
	}
	
	public void clickonCompareGasAndElectricitySLink()
	{
		chrome.findElement(By.xpath(MSMControls_CompareGasAndElectricitySLink)).click();
	}
	
	public void clickonCompareElectricitySLink()
	{
		chrome.findElement(By.xpath(MSMControls_CompareElectricitySLink)).click();
	}
	
	public void clickonBroadbandSLink()
	{
		chrome.findElement(By.xpath(MSMControls_BroadbandSLink)).click();
	}
	
	public void clickonStudentBroadbandSLink()
	{
		chrome.findElement(By.xpath(MSMControls_StudentBroadbandSLink)).click();
	}
	
	public void clickonMobilePhonesSLink()
	{
		chrome.findElement(By.xpath(MSMControls_MobilePhonesSLink)).click();
	}
	
	public void clickonLatestMobilePhoneSLink()
	{
		chrome.findElement(By.xpath(MSMControls_LatestMobilePhoneSLink)).click();
	}
	
	public void clickonHolidaysSLink()
	{
		chrome.findElement(By.xpath(MSMControls_HolidaysSLink)).click();
	}
	
	public void clickonCarHireSLink()
	{
		chrome.findElement(By.xpath(MSMControls_CarHireSLink)).click();
	}
	
	public void clickonFinOutMore()
	{
		chrome.findElement(By.xpath(MSMControls_FindOutMoreSLink)).click();
	}
	
	public void clickonCheckYourScore()
	{
		chrome.findElement(By.xpath(MSMControls_CheckYourScoreSLink)).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
