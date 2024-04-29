package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogininoffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
	
    driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");	
	driver.findElement(By.name("firstname")).sendKeys("abc");
	driver.findElement(By.name("lastname")).sendKeys("Kumar");
	driver.findElement(By.name("reg_email__")).sendKeys("abc@11");
	driver.findElement(By.id("password_step_input")).sendKeys("sajksgdj");
	driver.findElement(By.name("birthday_day")).sendKeys("08");
	driver.findElement(By.name("birthday_month")).sendKeys("june");
	driver.findElement(By.name("birthday_year")).sendKeys("2005");
	driver.findElement(By.name("sex")).click();
	//Thread.sleep(2000);
	driver.findElement(By.name("websubmit")).click();
	}

}
