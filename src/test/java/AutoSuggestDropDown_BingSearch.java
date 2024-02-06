import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.plugin.event.HookTestStep;

public class AutoSuggestDropDown_BingSearch {
    public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.get("https://google.com");
       By search = By.xpath("//textarea[@id='APjFqb']");
       By autoItems = By.xpath("//li[@class='sbct PZPZlf']//div[@role='option']//div[1]/span");
       sendData(search).sendKeys("java tutorial");
       Thread.sleep(3000);
       List<WebElement> lis = driver.findElements(autoItems);
       System.err.println("suze of list values--> " + lis.size() );
       
       for(WebElement lis_dr: lis) {
    	   if(lis_dr.getText().contains("beginners")) {
    		   lis_dr.click();
    		   break;
    	   }
       }
       
	}
	
	public static WebElement sendData(By locator) {
		return driver.findElement(locator);
	}
    public static WebElement getList(By locator) {
    	return (WebElement) driver.findElements(locator);
    }
}
