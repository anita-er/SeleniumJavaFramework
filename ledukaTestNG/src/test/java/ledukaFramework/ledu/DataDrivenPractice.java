package ledukaFramework.ledu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class DataDrivenPractice {
	  @Test
	public void datadriven() throws IOException {
	File src= new File("C:\\Users\\HP\\batch243\\ledukaTestNG\\Properties\\datafile.xlsx");
	  FileInputStream fi = new FileInputStream("C:\\Users\\HP\\batch243\\ledukaTestNG\\Properties\\datafile.xlsx");
	  XSSFWorkbook workbook=new XSSFWorkbook(fi);
	  XSSFSheet sheet=workbook.getSheet("Sheet1");
	  //XSSFSheet sheet=workbook.getSheetAt(0);
	  int rowcount=sheet.getLastRowNum();
	  int colcount=sheet.getRow(0).getLastCellNum();//in sheet get one row and count last cell for coloum count
	  for(int i=0;i<rowcount;i++ )
	  {
		 XSSFRow currentrow = sheet.getRow(i);
		  for(int j=0;j<colcount;j++)
		  {
			 String value= currentrow.getCell(j).toString();//in current row on jth cell to string means get the value
			 System.out.print("      "+value);
		  
		  }
		  System.out.println();
	  }
	  
	}

}
 