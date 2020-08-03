
public class TC_Login_010 {

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
		
			
		System.out.println("Default Text include Should be in Password text box");
	

	}

}
