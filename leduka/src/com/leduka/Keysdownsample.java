package com.leduka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keysdownsample 
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromelatest\\chrome79\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.co.in/");
		Thread.sleep(5000);
		
		
		driver.findElement(By.name("q")).sendKeys("automation step by step");Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).sendKeys(Keys.DOWN,Keys.ENTER);
		
			
		System.out.println("program executed");
		
		
		
		
		
		/*WebElement e1=driver.findElement(By.name("q"));
		Actions act=new Actions(driver);
		act.sendKeys(e1,"Kalam").build().perform();
		Thread.sleep(5000);
		
				
		act.sendKeys(Keys.DOWN,Keys.ENTER).build().perform();
		Thread.sleep(5000);
		System.out.println("program executed");
		
		//driver.switchTo().defaultContent();*/
	}
}
