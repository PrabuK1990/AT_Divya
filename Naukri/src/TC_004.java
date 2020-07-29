
//To run - Place cursor inside main Method and right click and run as java application
public class TC_004 {
	
	//Here in this class I have created class as usual with main method, but also I have written multiple methods
	//Note:There should be only one main method in a class - So whatever method I written I dint use the keyword "main(String[] args)"
	//So I have created method on my own "lineBreak()", "startingLine()" - Naming of method we can decide and mention
	//Then I called the new method name in the main method
	//Please create methods for same for expected, actual result and ending line
	//Note:Here once we written line break function once, it can be used whenever required and multiple times also

	//Main Function
	public static void main(String[] args) {
		//Place your cursor here and run
		lineBreak();
		startingLine();
		lineBreak();
		Expectedresult();
		actualResult();
		lineBreak();
		endingline();
		lineBreak();
	}
	
	//Function to Print Ending Line
	private static void endingline() {
		// TODO Auto-generated method stub
		System.out.println("Test Ended");
	}
	
	//Function to Print Actual Result
	private static void actualResult() {
		// TODO Auto-generated method stub
		System.out.println("Actual Result : Working as expected");
	}
	
	//Function to print Expected Result
	private static void Expectedresult() {
		// TODO Auto-generated method stub
		System.out.println("Expected Result : Email Id Error Message should be in red color");
	}

	//Function to Print Line Break
	public static void lineBreak()
	{
		System.out.println("---------------------------------------------------------------");
	}
	
	//Function to Print Starting Line
	public static void startingLine()
	{
		System.out.println("Test Started");
	}
}

