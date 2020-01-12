package com.leduka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromelatest\\chrome79\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/slider/");
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.id("slider"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(e,50,0).build().perform();
		Thread.sleep(5000);
		act.dragAndDropBy(e,-50,0).build().perform();
		

}
	
}
