package Pro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {
	
	static String data;
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		FileInputStream file = new FileInputStream("C:\\Users\\rocks\\Downloads\\excel sheet.xlsx");
		
		try 
		{
			data = WorkbookFactory.create(file).getSheet("LOKESH").getRow(0).getCell(4).getStringCellValue();
		}
		
		catch(IllegalStateException e)
		{
		   double d = WorkbookFactory.create(file).getSheet("LOKESH").getRow(0).getCell(4).getNumericCellValue();
		   String s = String.valueOf(d);
		   
		   data = s;
		  
		   
		   
		   
		}
		
			
		
		System.out.println(data);
		
		
		
	//	double d = WorkbookFactory.create(file).getSheet("LOKESH").getRow(3).getCell(4).getNumericCellValue();
		
	//	System.out.println(d);
	}

}
