package abdulkalam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromelatest\\chromedriver.exe");
	
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//input[@type='text'][1]"));
		e.sendKeys("iphone");
		Thread.sleep(2000);
		e.submit();
		driver.executeScript("window.alert('hellochakry')");
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(4000);
		driver.executeScript("window.scrollTo(0,document.body.scrollHeight/2);"); 
		//its not working for width
		//driver.executeScript("window.scrollTo(document.body.scrollHeight/2,0);");  
		//its goes bck to initial instead of half (width working for this)
		Thread.sleep(2000);
		//driver.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		//WebElement f= driver.findElement(By.xpath("//span[@class=\"celwidget slot=TITLE_AND_META template=TITLE_AND_META widgetId=title-and-meta index=0"));
		//Actions a = new Actions(driver);
		//if its a page level then y wud element level systax working for the scroll bar
		//a.click(f).sendKeys(Keys.RIGHT,Keys.LEFT).build().perform(); 
		//right is working but not the left
		List<WebElement> l = driver.findElements(By.xpath("//input[@type='text']"));
		//int x = driver.findElements(By.xpath("//input[@type='text']")).size();
		Thread.sleep(4000);
		System.out.println(l.size());
		Thread.sleep(4000);
		driver.close();
			
		
		
		
		
	
		
		
		
		
	}

}
