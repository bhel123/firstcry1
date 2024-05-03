package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class May3 {
	WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("6393993770");
	 driver.findElement(By.xpath("//input[@value='Continue']")).click();
	// driver.findElement(By.t)
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.get("https://accounts.flipkart.com/?client=cemp-client&redirectURL=httpsmerchant.ekartlogistics.comcallbackappNamemerchant");
	  driver.close();
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
