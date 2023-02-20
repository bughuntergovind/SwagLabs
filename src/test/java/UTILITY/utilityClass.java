package UTILITY;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utilityClass {
	
	//Excel Sheet Code
	public static String excelSheetData(int row,int cell) throws EncryptedDocumentException, IOException {
		String data;
		FileInputStream excel = new FileInputStream("G:/eclipsejava/swaagAutomation1/ExcelSheet/loginDetais.xlsx");
		Sheet file = WorkbookFactory.create(excel).getSheet("sheet1");
		
		try {
			 data = file.getRow(row).getCell(cell).getStringCellValue();
			
		} catch (Exception e) {
			long intData = (long)file.getRow(row).getCell(cell).getNumericCellValue();
			 data = (""+intData);
			
		}
		return data;
		
	}
	
	//Screenshot shot code
	
	public static void screenshot(WebDriver driver) throws IOException {
		//Change the name of scrrenshot according to the dateAndTime
        Date date=new Date();		
		String time = date.toString().replace(":","_");
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desc = new File("G:/eclipsejava/swaagAutomation1/Screenshot/ "+time+".jpg");
		FileUtils.copyFile(src, desc);
	}

}
