

public interface MoneySuperMarketControls {
	//Login Controls
	public static String MSMControls_AcceptsAll ="//button[@ id ='onetrust-accept-btn-handler']";
	//"//div[@ id = 'onetrust-banner-sdk']/div/div/div/div/div/button";
	public static String MSMControls_LoginLink = "//button[@ data-ng-click = 'headerSigninCtrl.openSignInForm(); navCtrl.closeMobileMenu()']";
	public static String MSMControls_EmailID = "//input[@data-name = 'signInCtrl.signInData.email']";
	public static String MSMControls_Password = "//input[@data-name = 'signInCtrl.signInData.password']";
	public static String MSMControls_ClickLoginButton = "//button[@ type ='submit']/span";
	public static String MSMControls_CheckBox = "//label[@class = 'checkbox__label']";
	public static String MSMControls_ForgetPassword ="//a[@  class = 'signin-panel__forgotten-password']";
	public static String MSMControls_ShowButton = "//div[@ class = 'view-password-data type-change-btn']/span";
	//Mouse Over Controls
	//Xpath for Insurance Link
	public static String MSMControls_Insurance = "//div[@class = 'top-navigation-component']/ul/li[1]/a";
	//Xpath for Money Link
	public static String MSMControls_Money = "//div[@ class = 'top-navigation-component']/ul[1]/li[2]/a[1]/span[1]";
	//Xpath for Energy Link
	public static String MSMControls_Energy ="//div[@ class = 'top-navigation-component']/ul[1]/li[3]/a";
	//Xpath for Broadband
	public static String MSMControls_Broadband = "//div[@ class = 'top-navigation-component']/ul[1]/li[4]/a";
	//Xpath for MobilePhone
	public static String MSMControls_MobilePhones = "//div[@ class = 'top-navigation-component']/ul[1]/li[5]/a";
	//Xpath for Travel
	public static String MSMControls_Travel = "//div[@ class = 'top-navigation-component']/ul[1]/li[6]/a";
	//Xpath for CreditMonitor
	public static String MSMControls_CreditMonitor = "//div[@ class = 'top-navigation-component']/ul[1]/li[7]/a";
	//Xpath for SubLinks
	//Xpath for Insurance SubLink
	public static String MSMControls_CarInsuranceSLink = "//div[@ class = 'top-navigation-component top-navigation-component--opened']/ul/li[1]/div/div/div[1]/a[1]";
	public static String MSMControls_YoungDriversInsuranceSLink = "//div[@ class = 'top-navigation-component top-navigation-component--opened']/ul/li[1]/div/div/div[1]/a[2]";
	//Xpath for Money SubLinks
	public static String MSMControls_CreditCardSLink = "//div[@ class = 'top-navigation-component top-navigation-component--opened']/ul/li[2]/div/div/div[1]/a[1]";
	public static String MSMControls_LoansSLink = "//div[@ class = 'top-navigation-component top-navigation-component--opened']/ul/li[2]/div/div/div[1]/a[2]";
	//Xpath for Energy Sublinks
	public static String MSMControls_CompareGasAndElectricitySLink = "//div[@ class = 'top-navigation-component top-navigation-component--opened']/ul/li[3]/div/div/div[1]/a[1]";
	public static String MSMControls_CompareElectricitySLink = "//div[@ class = 'top-navigation-component top-navigation-component--opened']/ul/li[3]/div/div/div[1]/a[2]";
	//Xpath for Broadband SubLink#
	public static String MSMControls_BroadbandSLink = "//div[@ class = 'top-navigation-component top-navigation-component--opened']/ul/li[4]/div/div/div[1]/a[1]";
	public static String MSMControls_StudentBroadbandSLink ="//div[@ class = 'top-navigation-component top-navigation-component--opened']/ul/li[4]/div/div/div[1]/a[2]";
	
	//Xpath for MobilePhone SubLink
	public static String MSMControls_MobilePhonesSLink = "//div[@ class = 'top-navigation-component top-navigation-component--opened']/ul/li[5]/div/div/div[1]/a[1]";
	public static String MSMControls_LatestMobilePhoneSLink = "//div[@ class = 'top-navigation-component top-navigation-component--opened']/ul/li[5]/div/div/div[1]/a[2]";
	//Xpath for Travel subLink
	public static String MSMControls_HolidaysSLink = "//div[@ class = 'top-navigation-component top-navigation-component--opened']/ul/li[6]/div/div/div[1]/a[1]";
	public static String MSMControls_CarHireSLink = "//div[@ class = 'top-navigation-component top-navigation-component--opened']/ul/li[6]/div/div/div[1]/a[2]";
	//Xpath for CreditMonitor
	public static String MSMControls_FindOutMoreSLink = "//div[@ class = 'top-navigation-component top-navigation-component--opened']/ul/li[7]/div/div/div[1]/a[1]";
	public static String MSMControls_CheckYourScoreSLink = "//div[@ class = 'top-navigation-component top-navigation-component--opened']/ul/li[7]/div/div/div[1]/a[2]";
	

}
