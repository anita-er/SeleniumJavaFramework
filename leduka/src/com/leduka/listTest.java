package com.leduka;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromelatest\\chrome79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://leduka.org.in/");
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		driver.findElement(By.xpath("//a[text()='Faculty']")).click();
		driver.findElement(By.xpath("//div[@class='fs-label']")).click();
		List<WebElement> educ = driver.findElements(By.xpath("//div[@class='fs-option-label']"));
		System.out.println(educ.size());
		String[] opts = {"Intermediate(CEC)","Intermediate(MPC)"};
		for (int j = 0; j < opts.length; j++) {
		for (int i = 1; i <= educ.size() ; i++) {
				WebElement EchElem = driver.findElement(By.xpath("(//div[@class='fs-option-label'])["+i+"]"));
				WebElement element=educ.get(i);
				String data=element.getText();
				String txt1 = opts[j];                                                     
				String txt2 = EchElem.getText();
				if (txt1.equals(txt2)) {
					EchElem.click();
			}}}
	}
}
