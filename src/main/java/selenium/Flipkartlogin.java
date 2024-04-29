package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.get("https://accounts.flipkart.com/?client=cemp-client&redirectURL=https%3A%2F%2Fmerchant.ekartlogistics.com%2Fcallback%3FappName%3Dmerchant");
	   
	WebElement Email	=driver.findElement(By.tagName("input"));
	                Email.sendKeys("7784845559");
	                driver.findElement(By.className("_20niCS")).click();
//river.findElement(By.tagName("input")).sendKeys("8853147138");
	driver.findElement(By.className("_3RCxig")).click();
	}

}
