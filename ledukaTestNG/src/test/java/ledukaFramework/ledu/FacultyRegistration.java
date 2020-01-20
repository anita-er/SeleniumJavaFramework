package ledukaFramework.ledu;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class FacultyRegistration extends FacultyTestBase {
	
public FacultyRegistration() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

//	@BeforeMethod
//	@Parameters("browser")
//	public void launching(String browser) {
//	openbrowse(browser);
//	}
		
@Test
public void facultyReg() throws InterruptedException {
	System.setProperty("WebDriver.chrome.driver", "E:\\Selenium\\chromelatest\\chrome79\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	System.out.println("Chrome launched successfully");
	  driver.get(config.getProperty("url"));
	  /*click(driver, config.getProperty("Registration"));
	  click(driver, config.getProperty("Faculty"));
	  sendkey(driver, config.getProperty("name"), org.getProperty("name_value"));
	  sendkey(driver, config.getProperty("last_name"),org.getProperty("last_name_value"));
	  byname(driver, config.getProperty("Email"),org.getProperty("email_value"));
	  byname(driver, config.getProperty("Password"), org.getProperty("pwd_value"));
	  byname(driver, config.getProperty("Conf_Password"),org.getProperty("Conf_Password_value"));
	  byname(driver, config.getProperty("specialization"), org.getProperty("specialization_value"));
	  
	  bynameclick(driver, config.getProperty("Tutions"));
	  bynameclick(driver, config.getProperty("Centers"));
	  bynameclick(driver, config.getProperty("Gate"));
	  bynameclick(driver, config.getProperty("conduct_Workshop"));
	  bynameclick(driver, config.getProperty("Attend_workshop"));
	  bynameclick(driver, config.getProperty("Lecture"));
	  bynameclick(driver, config.getProperty("Knowledge"));
	  bynameclick(driver, config.getProperty("Scholar"));
	  bynameclick(driver, config.getProperty("Mock_Test"));

*/
}
}