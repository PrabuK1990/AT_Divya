import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class NaukriReusables extends NaukriInputs implements NaukriControls {

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
	
	//Refresh Browser
	public void refreshBrowser()
	{
		chrome.navigate().refresh();
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
			Thread.sleep(2000);
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
	
	//Keyboard Action PageDown
	@SuppressWarnings("restriction")
	public void keboardPageDown() throws AWTException
	{
		Robot keyboard = new Robot();
		keyboard.keyPress(KeyEvent.VK_PAGE_DOWN);
		keyboard.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	
	//To close new tab using keyboard actions
	@SuppressWarnings("restriction")
	public void pressCtrlW() throws AWTException
	{
		Robot keyboard = new Robot();
		keyboard.keyPress(KeyEvent.VK_CONTROL);
		keyboard.keyPress(KeyEvent.VK_W);
		keyboard.keyRelease(KeyEvent.VK_CONTROL);
		keyboard.keyRelease(KeyEvent.VK_W);
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
	
	//Move Mouse Pointer on Job Menu
	public void mousehoverJobLink()
	{
		Actions actions = new Actions(chrome);
		WebElement mousehoverJob = chrome.findElement(By.xpath(NaukriControls_JobsLink));
		actions.moveToElement(mousehoverJob).perform();
	}
	
	public void clickonSearchJobsSLink()
	{
		chrome.findElement(By.xpath(NaukriControls_SearchJobsSLink)).click();
	}
	
	public void clickonAdvancedSLink()
	{
		chrome.findElement(By.xpath(NaukriControls_AdvancedJobsSLink)).click();
	}
	
	public void clickonCreateFreeJobAlertsLink()
	{
		chrome.findElement(By.xpath(NaukriControls_CreateFreeJobAlertsLink)).click();
	}
	
	
	
	public void mousehoverRecruitersLink()
	{
		Actions actions = new Actions(chrome);
		WebElement mousehoverRecruiter = chrome.findElement(By.xpath(NaukriControls_RecruitersLink));
		actions.moveToElement(mousehoverRecruiter).perform();
	}
	
	public void clickonBrowseAllRecruitersSLink()
	{
		chrome.findElement(By.xpath(NaukriControls_BrowseAllRecruitersSLink)).click();
	}
	
	public void clickonRecruiterConnectionSLink()
	{
		chrome.findElement(By.xpath(NaukriControls_RecruiterConnectionSLink)).click();
	}
	
	public void clickonGoTONaukriRecruiterSLink()
	{
		chrome.findElement(By.xpath(NaukriControls_GoTONaukriRecruiterSLink)).click();
	}
	
	
	
	public void mousehoverCompaniesLink()
	{
		Actions actions = new Actions(chrome);
		WebElement mousehoverCompanies = chrome.findElement(By.xpath(NaukriControls_CompaniesLink));
		actions.moveToElement(mousehoverCompanies).perform();
	}
	
	public void clickonBrowseAllCompaniesSLink()
	{
		chrome.findElement(By.xpath(NaukriControls_BrowseAllCompaniesSLink)).click();
	}
	
	public void clickonAboutCompaniesSLink()
	{
		chrome.findElement(By.xpath(NaukriControls_AboutCompaniesSLink)).click();
	}
	
	public void clickonInterviewQuestionSLink()
	{
		chrome.findElement(By.xpath(NaukriControls_InterviewQuestionSLink)).click();
	}
	
	public void mousehoverToolsLink()
	{
		Actions actions = new Actions(chrome);
		WebElement mousehoverTools = chrome.findElement(By.xpath(NaukriControls_ToolsLink));
		actions.moveToElement(mousehoverTools).perform();
	}
	
	public void clickonSalaryTrendsSLink()
	{
		chrome.findElement(By.xpath( NaukriControls_SalaryTrendsSLink)).click();
	}
	
	public void clickonCareerNavigatorSLink()
	{
		chrome.findElement(By.xpath(NaukriControls_CareerNavigatorSLink)).click();
	}
	
	public void clickonPeopleFlowSLink()
	{
		chrome.findElement(By.xpath(NaukriControls_PeopleFlowSLink)).click();
	}
	
	
	public void mousehoverServicesLink()
	{
		Actions actions = new Actions(chrome);
		WebElement mousehoverServices = chrome.findElement(By.xpath(NaukriControls_ServicesLink));
		actions.moveToElement( mousehoverServices).perform();
	}
	
	public void clickonTextResumeSLink()
	{
		chrome.findElement(By.xpath(NaukriControls_TextResumeSLink)).click();
	}
	
	public void clickonVisualResumeSLink()
	{
		chrome.findElement(By.xpath(NaukriControls_VisualResumeSLink)).click();
	}
	
	public void clickonResumeQualityScooreFreeSLink()
	{
		chrome.findElement(By.xpath(NaukriControls_ResumeQualityScooreFreeSLink)).click();
	}
	
	
	public void mousehoverMoreLink()
	{
		Actions actions = new Actions(chrome);
		WebElement mousehoverMore = chrome.findElement(By.xpath(NaukriControls_MoreLink));
		actions.moveToElement(mousehoverMore).perform();
	}
	
	
	public void clickonNaukriBlogSLink()
	{
		chrome.findElement(By.xpath(NaukriControls_NaukriBlogSLink)).click();
	}
	
	public void clickonFAQSLink()
	{
		chrome.findElement(By.xpath(NaukriControls_FAQSLink)).click();
	}
	
	public void clickonTakeHomeCalculatorSLink()
	{
		chrome.findElement(By.xpath(NaukriControls_TakeHomeCalculatorSLink)).click();
	}
	
	public void clickonMSSLink()
	{
		chrome.findElement(By.xpath(NaukriControls_MSSLink)).click();
	}
	
	public void clickonSOPSLink()
	{
		chrome.findElement(By.xpath(NaukriControls_SOPSLink)).click();
	}

}