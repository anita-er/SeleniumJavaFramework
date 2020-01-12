package abdulkalam;

import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleClick {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromelatest\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}

}
