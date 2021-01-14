package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.phantomJSDriver;
import org.openqa.selenium.phantomjs.phantomJSDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tc1 {
	 WebDriver driver;

		@BeforeMethod
		public void launch() {
		  //System.setProperty("webdriver.phantomjs.driver","chromedriver");
		  System.setProperty("phantomjs.binary.path", "/usr/local/bin/phantomjs");
		  driver = new PhantomJSDriver();
		  driver.get("http://172.31.21.106:9090/website");
		  driver.manage().window().maximize();
		  
		 
		
		}
		
	  @Test
	  public void verfiy() {
		 
		  driver.findElement(By.id("About Us")).click();
		  driver.findElement(By.id("PID-ab2-pg")).getText();
		  
	  }
	  @AfterMethod
	  public void close() {
		 driver.close();
 }
	
}
