package Pro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\rocks\\Downloads\\excel sheet.xlsx");
		
	//	String s = WorkbookFactory.create(file).getSheet("LOKESH").getRow(2).getCell(2).getStringCellValue();
		
	//	System.out.println(s);
		
		double d = WorkbookFactory.create(file).getSheet("LOKESH").getRow(3).getCell(4).getNumericCellValue();
		
		System.out.println(d);
	}

}
