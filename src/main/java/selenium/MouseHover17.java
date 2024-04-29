package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=12619813998660460051&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007751&hvtargid=kwd-10573980&hydadcr=14453_2367553&gad_source=1");
    driver.manage().window().maximize();
     driver.findElement(By.xpath("//span[normalize-space()='Prime'])")).click();
    
//    Actions ab= new Actions(driver);
//    ab.moveToElement(abc).build().perform();
	}
	

}
