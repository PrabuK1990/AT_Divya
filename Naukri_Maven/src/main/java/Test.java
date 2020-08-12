import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(new File("src\\resources\\excel\\Inputs_Naukri.xlsx"));
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Row row = sheet.getRow(1);
		
		String url = row.getCell(0).getStringCellValue();
		System.out.println(url);
		
		String username1 = row.getCell(1).getStringCellValue();
		System.out.println(username1);
		
		String username2 = row.getCell(2).getStringCellValue();
		System.out.println(username2);
		
		String username3 = row.getCell(3).getStringCellValue();
		System.out.println(username3);
		
		String username4 = row.getCell(4).getStringCellValue();
		System.out.println(username4);
		
		String inusername1 = row.getCell(5).getStringCellValue();
		System.out.println(inusername1);

		String inusername2 = row.getCell(6).getStringCellValue();
		System.out.println(inusername2);
		
		String inusername3 = row.getCell(7).getStringCellValue();
		System.out.println(inusername3);
		
		String password1 = row.getCell(8).getStringCellValue();
		System.out.println(password1);
		
		String password2 = row.getCell(9).getStringCellValue();
		System.out.println(password2);
		
		String inpassword = row.getCell(10).getStringCellValue();
		System.out.println(inpassword);
		

	}

}
