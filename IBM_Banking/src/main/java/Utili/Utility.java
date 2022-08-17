package Utili;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
		
		public static File takeScreenshot(WebDriver driver, String testID) throws IOException
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String s = new SimpleDateFormat("DD-MM-YYYY HH-MM-SS").format(new Date(8-4-2022));
			File dest = new File("C:\\Users\\rocks\\Pictures\\Test"+testID+s+".jpg");
			FileHandler.copy(src, dest);
			return dest;
		}

		public static String getExcelSheetData(String Lokesh, int row, int cell) throws EncryptedDocumentException, IOException
		{
			
			FileInputStream file = new FileInputStream("C:\\Users\\rocks\\Downloads\\excel sheet.xlsx");
			
			String data = WorkbookFactory.create(file).getSheet(Lokesh).getRow(row).getCell(cell).getStringCellValue();
			
			
			
		//double value = WorkbookFactory.create(file).getSheet("Lokesh").getRow(row).getCell(cell).getStringCellValue();
				
			
			return data;
		
			
		}
		
		

}
