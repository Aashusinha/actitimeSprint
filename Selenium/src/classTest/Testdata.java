package classTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Testdata {
	public String FetchdatafromExcel(String sheetName,int rollno,int cellNo) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis = new FileInputStream("./testData/GoogleTestCase.xlsx");
	return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rollno).getCell(cellNo).getStringCellValue();
	}
	

}
