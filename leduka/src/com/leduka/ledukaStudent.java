package com.leduka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ledukaStudent {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromelatest\\chrome79\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://leduka.org.in/");
System.out.println("leduka launched");

WebElement we=driver.findElement(By.xpath("//*[text()='Colleges Zone']"));
Actions act=new Actions(driver);
act.click(we).build().perform();
WebElement we2=driver.findElement(By.xpath("//li[2]//div[1]//a[3]"));
Thread.sleep(5000);
act.moveToElement(we2).click().build().perform();

driver.findElement(By.xpath("//a[@href='http://leduka.org.in/auth/registerpages']")).click();
driver.findElement(By.xpath("//a[text()='Faculty']")).click();
driver.findElement(By.xpath("//*[@placeholder='First Name *']")).sendKeys("Aneetha");
driver.findElement(By.xpath("//*[@placeholder='Last Name *']")).sendKeys("Entoor");
Thread.sleep(3000);
Select s=new Select(driver.findElement(By.xpath("//select[@name='gender']")));
s.selectByVisibleText("Female");

driver.findElement(By.name("email")).sendKeys("anitha.er11@gmail.com");
driver.findElement(By.name("password")).sendKeys("Shantha");
driver.findElement(By.name("conpass")).sendKeys("Shantha");

WebElement e=driver.findElement(By.xpath("//*[@placeholder='Date Of Birth *']"));
Actions a = new Actions(driver);
a.doubleClick(e).build().perform();Thread.sleep(5000);
a.sendKeys("02091986").build().perform(); 

driver.findElement(By.xpath("//div[text()='Highest Qualification *']")).click();
driver.findElement(By.xpath("//div[text()='M.Tech(CSE/IT)']")).click();

driver.findElement(By.name("specialization")).sendKeys("Computer Science");

driver.findElement(By.name("tution")).click();
driver.findElement(By.name("center")).click();
driver.findElement(By.name("center")).click();
driver.findElement(By.name("gate")).click();
driver.findElement(By.name("cworkshop")).click();
driver.findElement(By.name("aworkshop")).click();
driver.findElement(By.name("clecture")).click();
driver.findElement(By.name("sknowledge")).click();
driver.findElement(By.name("gscholar")).click();
driver.findElement(By.name("mocktest")).click();


driver.findElement(By.name("interest")).sendKeys("IT");
Select sel=new Select(driver.findElement(By.xpath("//select[@name='experience']")));
sel.selectByIndex(2);

driver.findElement(By.name("designation")).sendKeys("Manager");
driver.findElement(By.name("presentinst")).sendKeys("Grepthor");
driver.findElement(By.name("affilated")).sendKeys("JNTU");
driver.findElement(By.name("colcode")).sendKeys("SWET");


driver.findElement(By.name("add1")).sendKeys("kondapur");
driver.findElement(By.name("add2")).sendKeys("Madhapur");
driver.findElement(By.name("state")).sendKeys("Telangana");
driver.findElement(By.name("district")).sendKeys("Rangareddy");
driver.findElement(By.name("city")).sendKeys("Hyd");
driver.findElement(By.name("mandal")).sendKeys("Serilingampally");
driver.findElement(By.name("pincode")).sendKeys("500084");
driver.findElement(By.name("mobile")).sendKeys("1234567890");

driver.findElement(By.xpath("//input[@type='checkbox']")).click();
driver.findElement(By.xpath("//button[@value='submit']")).click();



driver.quit();
		
		
		
	}

}
