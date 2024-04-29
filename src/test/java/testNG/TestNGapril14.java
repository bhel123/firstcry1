package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class TestNGapril14 {
	
	WebDriver driver;
	Actions ab;
	
  @Test
  public void f() {
	  WebElement abc=driver.findElement(By.xpath("//span[contains(@class,'demo-icon icon-hotels')]"));
	 ab = new Actions(driver);
	 ab.contextClick(abc).build().perform();
	 
	  
	
	  
	  
	  
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.get("https://www.yatra.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("booking_engine_buses")).click();
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
