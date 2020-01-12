package abdulkalam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromelatest\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Login'])[1]/preceding::button[1]")).click();
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("//*[text()='Women']"));
		Actions a = new Actions(driver);
		a.moveToElement(e,10,10).perform();
	
		

	}

}
