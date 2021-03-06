
package com.bombieri.tests;
  
import org.junit.After; import org.junit.Before; import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
  
  public class AccesoMercLibreTest {
  
  private WebDriver driver;
  
  @Before 
  public void setUp() throws Exception {
  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bombieri5\\Downloads\\geckodriver.exe"); 
  driver = new FirefoxDriver(); 
  }
  
  @After 
  public void tearDown() throws Exception {
	  driver.quit();
  }
  
  
  @Test 
  public void merLibre() 
  {
	  driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.name("q")).sendKeys("mercado libre");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);		 
  }
  
}
 
