import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MoneySuperMarketInputs {

		public static String MSMInputs_URL;
		public static String MSMInputs_EmailID1 ;
		public static String MSMInputs_EmailID2 ;
		public static String MSMInputs_InEmailID1 ;
		public static String MSMInputs_InEmailID2 ;
		public static String MSMInputs_PassWord1 ;
		public static String MSMInputs_PassWord2 ;
		public static String MSMInputs_InPassWord1 ;
		public static String MSMInputs_InPassWord2 ;

		public void loadExcel() throws IOException {
			
			FileInputStream file = new FileInputStream(new File("src\\Resources\\Excel\\Inputs_MSM.xlsx"));

			XSSFWorkbook workbook = new XSSFWorkbook(file);

			XSSFSheet sheet = workbook.getSheetAt(0);

			Row row = sheet.getRow(1);
			MSMInputs_URL = row.getCell(0).getStringCellValue();
			MSMInputs_EmailID1 = row.getCell(1).getStringCellValue();
			MSMInputs_EmailID2 = row.getCell(2).getStringCellValue();
			MSMInputs_InEmailID1 = row.getCell(3).getStringCellValue();
			MSMInputs_InEmailID2 = row.getCell(4).getStringCellValue();
			MSMInputs_PassWord1 = row.getCell(5).getStringCellValue();
			MSMInputs_PassWord2 = row.getCell(6).getStringCellValue();
			MSMInputs_InPassWord1 = row.getCell(7).getStringCellValue();
			MSMInputs_InPassWord2 = row.getCell(8).getStringCellValue();
			
		}
	
	
}
