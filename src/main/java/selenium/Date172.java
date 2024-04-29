package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Date172 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
//		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		
		driver.manage().window().maximize();
//		
//		WebElement abc= driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
//		
//		Actions ab= new Actions(driver);
//		ab.doubleClick(abc).build().perform();
//		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=9537305943235176316&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9075215&hvtargid=kwd-10573980&hydadcr=14453_2367553&gad_source=1");
       driver.findElement(By.id("nav-orders")).click();
       driver.findElement(By.name("email")).sendKeys("atul");
	  // Actions ab = Actions(driver);  
	}
	
}
