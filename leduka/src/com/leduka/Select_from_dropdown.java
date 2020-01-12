package com.leduka;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_from_dropdown {
	
	private static final List<WebElement> WebElement = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromelatest\\chrome79\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leduka.org.in/");
		System.out.println("leduka launched");driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@href='http://leduka.org.in/auth/registerpages']")).click();
		driver.findElement(By.xpath("//a[text()='Faculty']")).click();
		
		
		
		
		//System.out.println(x);int i;
		WebElement l=driver.findElement(By.xpath("//select[@name='gender']"));
	l.click();
		Select genOPtsDrop = new Select(l);
		List<WebElement> genOPts = genOPtsDrop.getOptions();
		for (int i = 1; i < genOPts.size(); i++) {
			WebElement opts = genOPts.get(i);
			String txt1 = "Female";
			String txt2 = opts.getText();
			if (txt1.equals(txt2)) {
				opts.click();
				
				//WebElement //l1=driver.findElement(By.xpath("//select[@name='gender']"));
				//l1.click();
				
			}
		}
		}		
		
	}

