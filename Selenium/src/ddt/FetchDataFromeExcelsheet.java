package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromeExcelsheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testData/ExcelData.xlsx");//creating object
		Workbook workbook = WorkbookFactory.create(fis);		
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(0);
		String customer2 = cell.getStringCellValue();
		
		System.out.println("The 2nd Customer is:"+customer2);
		
		Cell cell1 = row.getCell(1);
		long customer2Phone = (long)cell1.getNumericCellValue();
		
		System.out.println("The 2nd CustomerphoneNo is:"+customer2Phone);
		
		

	}

}
