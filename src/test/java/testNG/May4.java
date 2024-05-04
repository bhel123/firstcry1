package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class May4 {
	
	WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  driver.findElement(By.name("username")).sendKeys("atul@gmail.com");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234567890");
	  driver.findElement(By.xpath("//input[@id='btn_login']")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.get("https://www.kamera-express.nl/login");
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
