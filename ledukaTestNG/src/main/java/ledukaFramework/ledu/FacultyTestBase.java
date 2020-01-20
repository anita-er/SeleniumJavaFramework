package ledukaFramework.ledu;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacultyTestBase {
	public static WebDriver driver;
	
	public static Properties config=new Properties();
	public static Properties org=new Properties();
	public static FileInputStream fis_config,fis_org;
	
	public FacultyTestBase() throws IOException {
		
	//loading properties file	
		try {
			fis_config= new FileInputStream("C:\\Users\\HP\\batch243\\ledukaTestNG\\Properties\\config.properties");
			config.load(fis_config);
			
			fis_org=new FileInputStream("C:\\Users\\HP\\batch243\\ledukaTestNG\\Properties\\org.properties");
			org.load(fis_org);
			} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
							 }
		
										
												}

	//open browser
	
	public void openbrowse(String browser)
	{
		if(browser.equals("Chrome"))
		{
			System.setProperty("WebDriver.chrome.driver", "E:\\Selenium\\chromelatest\\chrome79\\chromedriver.exe");
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
					//BY name
					public void byname(WebDriver driver, String name,String value) {
						
						try {
							driver.findElement(By.name(name)).sendKeys(value);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					
					
					public void bynameclick(WebDriver driver,String name) {
						
						try {
							driver.findElement(By.name(name)).click();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					
							}


