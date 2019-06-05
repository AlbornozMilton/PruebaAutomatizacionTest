package com.bombieri;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AcccesoABombieriTest {

	private WebDriver driver;
	  //private Map<String, Object> vars;
	  //JavascriptExecutor js;
	  
	  @Before
	  public void setUp() {
		 System.getProperties().setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 //ChromeOptions options = new ChromeOptions();
		 //options.setHeadless(true);
		 driver = new ChromeDriver();

	  }
	  
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	  @Test
	  public void accesoABombieri() {
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.name("q")).click();
	    driver.findElement(By.name("q")).sendKeys("bombieri");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector("div:nth-child(2) > .rc .LC20lb")).click();
		driver.findElement(By.cssSelector(".inner-nav > li:nth-child(1) > a")).click();
		driver.findElement(By.cssSelector(".inner-nav > li:nth-child(2) > a")).click();
		driver.findElement(By.cssSelector(".inner-nav > li:nth-child(1) > a")).click();
		driver.findElement(By.cssSelector("li:nth-child(5) > a")).click();
		
	  }

}
