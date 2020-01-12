package abdulkalam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class double_click {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromelatest\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		WebDriverWait w= new WebDriverWait(driver,20);
		//w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iframeResult"));
		driver.switchTo().frame("iframeResult");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Double-click me']")));
		WebElement e= driver.findElement(By.xpath("//*[text()='Double-click me']"));
		Actions a = new Actions(driver);
		Thread.sleep(4000);
		a.doubleClick(e).build().perform();
		
		Thread.sleep(4000);
		driver.quit();
		

	}

}
