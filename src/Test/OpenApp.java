package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class OpenApp {
	WebDriver driver;
  @Test(priority=0)
  public void gotoLogin() {
	 System.out.println("User able to login");
  }
  
  @Test(priority=1)
  public void BroserClose(){
	  
	System.out.println("Browser closed");
  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://webloadmpstore.com");
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("LOGIN")).click();
	  Thread.sleep(5000);
	  
	  driver.close();
	  
	  
  }

}
