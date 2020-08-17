

public interface MoneySuperMarketControls {
	//Login Controls
	public static String MSMControls_LoginLink = "//button[@ data-ng-click = 'headerSigninCtrl.openSignInForm(); navCtrl.closeMobileMenu()']";
	public static String MSMControls_EmailID = "//input[@ data-name = 'signInCtrl.signInData.email'";
	public static String MSMControls_Password = "//input[@data-name ='signInCtrl.signInData.password'";
	public static String MSMControls_ClickLoginButton = "//button[@ type ='submit']/span";
	public static String MSMControls_CheckBox = "//label[@class = 'checkbox__label']";
	public static String MSMControls_ForgetPassword ="//a[@  class = 'signin-panel__forgotten-password']";
	//Mouse Over Controls
	//Xpath for Insurance Link
	public static String MSMControls_Insurance = "//div[@ class = 'top-navigation-component']/ul[1]/li[1]/a[1]";
	//Xpath for Money Link
	public static String MSMControls_Money = "//div[@ class = 'top-navigation-component']/ul[1]/li[2]/a[1]/span[1]";
	//Xpath for Energy Link
	public static String MSMControls_Energy ="";
	//Xpath for Broadband
	public static String MSMControls_Broadband = "";
	//Xpath for MobilePhone
	public static String MSMControls_MobilePhone = "";
	//Xpath for Travel
	public static String MSMControls_Travel = "";
	//Xpath for CreditMonitor
	public static String MSMControls_CreditMonitor = "";
	
	

}
