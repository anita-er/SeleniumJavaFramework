package com.leduka;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class student {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromelatest\\chrome79\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leduka.org.in/");
		System.out.println("leduka launched");driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.findElement(By.xpath("//a[@href='http://leduka.org.in/auth/registerpages']")).click();
		driver.findElement(By.xpath("//img[@alt='register-icon-logo']")).click();
		driver.findElement(By.xpath("//input[@name='scool_college_id']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Aneetha");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Entoor");
		
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
		
		driver.findElement(By.xpath("//input[@name='father_name']")).sendKeys("Ramaswami");
		driver.findElement(By.xpath("//input[@name='mother_name']")).sendKeys("vijaya");
				
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anitha.er11@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Aneetha");
		driver.findElement(By.xpath("//input[@name='cpass']")).sendKeys("Aneetha");
		
		 
			 	WebElement e=driver.findElement(By.xpath("//*[@placeholder='Date Of Birth *']"));
				Actions act = new Actions(driver);
				act.doubleClick(e).build().perform();Thread.sleep(2000);
				act.sendKeys("02091986").build().perform(); 
				
			
		WebElement e1=driver.findElement(By.xpath("//select[@id='sel_school_college']"));
		Select opts1 = new Select(e1);
		opts1.selectByIndex(2);
		Thread.sleep(5000);
		WebElement e2=driver.findElement(By.xpath("//select[@id='quali']"));
		e2.click();
		Select opts2=new Select(e2);
		opts2.selectByIndex(4);	
		
		
		driver.findElement(By.xpath("//input[@name='ccode']")).sendKeys("Shadan");
		driver.findElement(By.xpath("//input[@name='affilated']")).sendKeys("JNTU");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9885098850");
		
		driver.findElement(By.xpath("//input[@name='tutor']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		
		
}}