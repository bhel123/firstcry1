package selenium;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DAte1April {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		//driver.get("https://imagecompressor.com/");
	driver.navigate().to("https://imagecompressor.com/");
      //	Thread.sleep(2000);
      //	driver.navigate().back();
      //Thread.sleep(2000);
      //driver.navigate().forward();
      //Thread.sleep(2000);
       //driver.navigate().refresh();
                       String  Url=driver.getCurrentUrl();
                       System.out.println(Url);
                       String title = driver.getTitle();
                       System.out.println(title);
//	      driver.manage().window().maximize()

//                       Dimension d= new Dimension(300,900);
//                       driver.manage().window().setSize(d);
//                       
//                     
                       Point p= new Point(-100, 200);
                       driver.manage().window().setPosition(p);
//                       driver.close();
//                       driver.quit();
	}

}
