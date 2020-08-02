
public class TC_Login_0010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Check Wether Default is in Password Field");
		
		
		NaukriReusables TC_Login_0010 = new NaukriReusables();
		
		//set property for chrome
		TC_Login_0010.setPropertyChrome();
		
		//Launch Crome
		TC_Login_0010.chromeBrowser();
		
		//Enter URL
		TC_Login_0010.naukriURL();
		
		//wait
		TC_Login_0010.waitMethod();
		
		//Maximise
		TC_Login_0010.maximizeBrowser();
		
		//click on login Link
		TC_Login_0010.clickLoginLink();
		
		//wait
		TC_Login_0010.waitMethod();
		
		//Enter username
		TC_Login_0010.enterUsername();
		
		System.out.println("Default include Should be in Password text box");
	

	}

}
