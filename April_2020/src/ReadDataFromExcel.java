import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
@Test
public void ReadData()
{
	try {
		  
		   FileInputStream fis=new FileInputStream("I:\\testData\\TestData1.xlsx");
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		   XSSFSheet sh1= wb.getSheet("inspire");
		 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());	 
		 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue()); 
		 System.out.println(sh1.getRow(0).getCell(2).getStringCellValue());
		 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
		 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
		 System.out.println(sh1.getRow(1).getCell(2).getStringCellValue());
		  } catch (Exception e) {
		   System.out.println(e.getMessage());
		  }  
		 }
	
	}
