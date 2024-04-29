package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
	  driver.findElement(By.xpath("(//input[@data-type='text'])[1]")).sendKeys("atul ");
	  driver.findElement(By.xpath("(//input[@data-type='text'])[2]")).sendKeys(" kumar");
	  driver.findElement(By.xpath("(//input[@data-type='text'])[3]")).sendKeys("1234567890");
	}
	

}
