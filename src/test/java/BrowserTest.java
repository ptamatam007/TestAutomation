import java.sql.Driver;
import java.time.Duration;

import javax.sound.midi.Soundbank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
  public static void main(String[] args) {
	
//	  WebDriver driver = new ChromeDriver();
//	  System.out.println("Hi Selenium");
//	  driver.get("https://www.selenium.dev/");
	  
//	  WebDriver driver = new FirefoxDriver();
//	  driver.get("http://google.com");
	  
	  WebDriver driver = new EdgeDriver();
	  driver.get("http://google.com");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	  //driver.quit();
	  // it will get the title of the page
	  driver.getTitle();
	  System.out.println("Title of the page --> " + driver.getTitle());
	  driver.getCurrentUrl();	
	  System.out.println("Current URL of the page" + driver.getCurrentUrl());
	  System.out.println("Page Source" + driver.getPageSource());
  }
}
