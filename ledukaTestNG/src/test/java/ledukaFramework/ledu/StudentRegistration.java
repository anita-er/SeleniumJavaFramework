package ledukaFramework.ledu;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StudentRegistration extends TestBase {
	
public StudentRegistration() throws IOException {
		super();
	}


@BeforeMethod
@Parameters("browser")
public void launching(String browser) {
openbrowser(browser);
}
	
	
  @Test
  public void stdReg() throws InterruptedException {
	  driver.get(config.getProperty("url"));
	  click(driver, config.getProperty("Registration"));
	  click(driver, config.getProperty("student"));
	  sendkey(driver, config.getProperty("id"), org.getProperty("idvalue"));
	  sendkey(driver, config.getProperty("name"),org.getProperty("name_value"));
	  sendkey(driver, config.getProperty("last_name"),org.getProperty("last_name_value"));
	  gender(driver, config.getProperty("gender"), org.getProperty("gender_value"));
	  
	  sendkey(driver, config.getProperty("father_name"),org.getProperty("father_name_value"));
	  sendkey(driver, config.getProperty("mother_name"),org.getProperty("mother_name_value"));
	  sendkey(driver, config.getProperty("password"),org.getProperty("password_value"));
	  sendkey(driver, config.getProperty("confirm_password"),org.getProperty("confirm_password_value"));
	
	  
	  
	 click(driver, config.getProperty("tutor"));
	 click(driver, config.getProperty("agree"));
	 click(driver, config.getProperty("submit"));
	 
	  
  dateofbirth(driver, config.getProperty("date"), org.getProperty("date_value"));
 
  school(driver, config.getProperty("school"), org.getProperty("school_value"));
  qualification(driver, config.getProperty("quali"),org.getProperty("qualification_value"));
  
  sendkey(driver, config.getProperty("college_code"),org.getProperty("college_code_value"));
  sendkey(driver, config.getProperty("affiliated"),org.getProperty("affiliated_value"));
  sendkey(driver, config.getProperty("mobile"),org.getProperty("mobile_value"));
  }
  
  
}
