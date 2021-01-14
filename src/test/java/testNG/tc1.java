package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tc1 {
	 WebDriver driver;

		@BeforeMethod
		public void launch() {
		  System.setProperty("webdriver.chrome.driver","chromedriver");
		  driver = new ChromeDriver();
		  driver.get("http://18.222.70.48:9090/website");
		  driver.manage().window().maximize();
		  
		 
		
		}
		
	  @Test
	  public void verfiy() {
		 
		  driver.findElement(By.id("About Us")).click();
		  driver.findElement(By.id("PID-ab2-pg"))..getText();
		  
	  }
	  @AfterMethod
	  public void close() {
		 driver.close();
 }
	
}
