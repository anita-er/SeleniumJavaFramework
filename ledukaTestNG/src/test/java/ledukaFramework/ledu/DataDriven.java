package ledukaFramework.ledu;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDriven {
  @Test
  public void f() throws IOException {
	  //test
	  File src= new File("C:\\Users\\HP\\batch243\\ledukaTestNG\\Properties\\datafile.xlsx");
	  FileInputStream fi = new FileInputStream(src);
	  XSSFWorkbook wb = new XSSFWorkbook(fi);
	  XSSFSheet sh = wb.getSheetAt(0);
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromelatest\\chrome79\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://leduka.org.in/");
	  System.out.println("leduka launched");driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	  driver.findElement(By.xpath("//a[@href='http://leduka.org.in/auth/registerpages']")).click();
	  driver.findElement(By.xpath("//a[text()='Faculty']")).click();
	  driver.findElement(By.xpath("//*[@placeholder='First Name *']")).sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("D://img1.jpg"));
	  int rc = sh.getLastRowNum();
	  for (int i = 1; i <= rc; i++) {
		System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
		  
	}
	  driver.quit();

//	  System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
	  
	  
	  
	  
	  
  }
}
