package abdulkalam;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class puli2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromelatest\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("coolchakry");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("coolcha");
		Thread.sleep(5000);
		

	}

}
