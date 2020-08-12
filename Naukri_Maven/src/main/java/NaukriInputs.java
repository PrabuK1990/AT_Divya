import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NaukriInputs {

	public static String NaukriInputs_Url;
	public static String NaukriInputs_UserName1;
	public static String NaukriInputs_UserName2;
	public static String NaukriInputs_UserName3;
	public static String NaukriInputs_UserName4;
	public static String NaukriInputs_InUserName1;
	public static String NaukriInputs_InUserName2;
	public static String NaukriInputs_InUserName3;
	public static String NaukriInputs_PassWord1;
	public static String NaukriInputs_PassWord2;
	public static String NaukriInputs_InPassWord;

	public void loadExcel() throws IOException {
		FileInputStream file = new FileInputStream(new File("src\\resources\\excel\\Inputs_Naukri.xlsx"));

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheetAt(0);

		Row row = sheet.getRow(1);

		NaukriInputs_Url = row.getCell(0).getStringCellValue();
		NaukriInputs_UserName1 = row.getCell(1).getStringCellValue();
		NaukriInputs_UserName2 = row.getCell(2).getStringCellValue();
		NaukriInputs_UserName3 = row.getCell(3).getStringCellValue();
		NaukriInputs_InUserName1 = row.getCell(4).getStringCellValue();
		NaukriInputs_InUserName2 = row.getCell(5).getStringCellValue();
		NaukriInputs_InUserName3 = row.getCell(6).getStringCellValue();
		NaukriInputs_PassWord1 = row.getCell(7).getStringCellValue();
		NaukriInputs_PassWord2 = row.getCell(8).getStringCellValue();
		NaukriInputs_InPassWord = row.getCell(9).getStringCellValue();
	}

	// Apache POI API
}
