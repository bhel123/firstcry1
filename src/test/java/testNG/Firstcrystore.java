package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Firstcrystore {
	
	WebDriver driver;
	Actions x;
  @Test
  public void f() //Integer n, String s
  {
	  
//	 WebDriver xy = driver.findElement(By.xpath("//input[@name='firstname']"));
	 
	 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ravi");
	 driver.findElement(By.name("lastname")).sendKeys("singh");
	 driver.findElement(By.name("email")).sendKeys("ravi@gmail.com");
	 driver.findElement(By.name("password")).sendKeys("ravi@28");
	 driver.findElement(By.name("confirmpassword")).sendKeys("ravi@28");
	 driver.findElement(By.xpath("//button[@normalize-space()='SIGN IN']")).click();
	  
//	  driver.findElement(By.className("submit-btn")).click();
	  
	  
	  	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.get("https://firstcrystore.in/#/signup");
//	  driver.get("https://firstcrystore.in/#/account");
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
  }}


//  @DataProvider
//  public Object[][] dp() {
////    return new Object[][] {
////      new Object[] { 1, "a" },
////      new Object[] { 2, "b" },
//    };
//  }
//}
