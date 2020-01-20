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

public class screenshot {

	@SuppressWarnings("resource")

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromelatest\\chrome79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leduka.org.in/");
		File srce = new File("D:\\Selenium\\ledukaData.xlsx");
		FileInputStream fi = new FileInputStream(srce);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheetAt(0);
		Thread.sleep(5000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://img1.jpg"));
		driver.findElement(By.xpath("//a[@href='http://www.leduka.org.in/auth/registerpages']")).click();
		driver.findElement(By.xpath("//a[@href='http://www.leduka.org.in/auth/studentregister']")).click();
		File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("D://img2.jpg"));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
		File src3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src3, new File("D://img3.jpg"));

	}
}