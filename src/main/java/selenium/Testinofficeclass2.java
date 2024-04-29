package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testinofficeclass2 {
	
	public static void main(String[] args ) {
		
	
	WebDriver driver =  new ChromeDriver();
	driver.get("https://drishtilearningapp.com/");
	driver.findElement(By.id("first_name")).sendKeys("KUMAR");
	driver.findElement(By.id("emailid")).sendKeys("ak@gmail.com");
    driver.findElement(By.id("mobile")).sendKeys("8000000000");
    driver.findElement(By.id("pwd")).sendKeys("akkumar1797");
    driver.findElement(By.id("button")).click();
}
}