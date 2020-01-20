package ledukaFramework.ledu;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestBase {
	public WebDriver driver;
	Actions act;
	public static Properties config=new Properties();
	public static Properties org=new Properties();
	public static FileInputStream fis_config,fis_org;
	
	//loading property files
		public TestBase() throws IOException {
			
			
			try {
				fis_config= new FileInputStream("C:\\Users\\HP\\batch243\\ledukaTestNG\\Properties\\config.properties");
				config.load(fis_config);
				fis_org=new FileInputStream("C:\\Users\\HP\\batch243\\ledukaTestNG\\Properties\\org.properties");
				org.load(fis_org);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
											}
	
		//Open Browser
		
		public void openbrowser(String browser) {
			if(browser.equals("Chrome")) {
		      System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromelatest\\chrome79\\chromedriver.exe");
		      driver=new ChromeDriver();	
		      System.out.println("Chrome launched successfully");
		      
			} else if(browser.equals("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\drivers\\geckodriver.exe");
				driver= new FirefoxDriver();
				System.out.println("firefox launched successfully");
				
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
													}
		
		
				//Click
				public void click(WebDriver driver,String xpath) {
					
					try {
						driver.findElement(By.xpath(xpath)).click();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
				//Sendkeys
				public void sendkey(WebDriver driver, String xpath,String value) {
					
					try {
						driver.findElement(By.xpath(xpath)).sendKeys(value);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				//date of birth				
				public void dateofbirth(WebDriver driver,String xpath,String date) throws InterruptedException {
					try {
						WebElement e=driver.findElement((By.xpath(xpath)));
						act = new Actions(driver);
						act.doubleClick(e).build().perform();Thread.sleep(2000);
						act.sendKeys(date).build().perform(); 
					} catch (Exception e) {
						e.printStackTrace();
					}	
				}
				
				//gender	
				public void gender(WebDriver driver,String xpath,String data) {
					try {
					WebElement l=driver.findElement(By.xpath("//select[@name='gender']"));
					Select opts=new Select(l);
					List<WebElement> optsvalue= opts.getOptions();
					for(int i=1;i<optsvalue.size();i++)
					{
						WebElement singledata=optsvalue.get(i);
						String opts2=singledata.getText();
						String opts1="Female";
						if(opts1.equals(opts2))
						{
							singledata.click();
						}
						
					}
					
					}catch (Exception e) {
								e.printStackTrace();
										}
				}		
				
				//school
				public void school(WebDriver driver,String xpath,String data)
				{
				WebElement e=driver.findElement(By.xpath("//select[@id='sel_school_college']"));
				Select opts = new Select(e);
				opts.selectByIndex(2);
				}
				
				//Qualification
				
				public void qualification(WebDriver driver,String xpath,String data)
				{
					WebElement e2=driver.findElement(By.xpath("//select[@id='quali']"));
					e2.click();
					Select opts2=new Select(e2);
					opts2.selectByIndex(4);				
					
				}
				
				/* public void school(WebDriver driver,String xpath,String data)
				{
					WebElement e=driver.findElement((By.xpath(xpath)));
					Select opts = new Select(e);
					List <WebElement> optsvalues=opts.getOptions();
					for(int i=0;i<optsvalues.size();i++)
					{
						WebElement singleval=optsvalues.get(i);
						String opt2=singleval.getText();					
						String opt1="college";
						
						if(opt1.equals(opt2))
						{
							singleval.click();
						}
						
						
						
					}
					
				*/	
					
}