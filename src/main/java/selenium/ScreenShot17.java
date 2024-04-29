package selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
      driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	driver.manage().window().maximize();
	TakesScreenshot scereenshot= ((TakesScreenshot)driver);
//	      File   src  =screenshot.getScreenshotAs(OutputType.FILE);
//	      File disk = new File("C:\\Users\\ATUL\\eclipse-workspace\\selenium\\ScreenShot\\atul.png");
//	}

}
}