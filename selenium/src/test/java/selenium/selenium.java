package selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class selenium {
	WebDriver driver;
	 @Test( enabled = true)
		public void dangnhap() {
			  
				
			driver = new FirefoxDriver();
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://192.168.2.168:9080/mx76noldap");
		  }
}
