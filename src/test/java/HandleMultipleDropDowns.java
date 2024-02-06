import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class HandleMultipleDropDowns {
	  static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		 driver = new ChromeDriver();
		
		driver.get("https://fb.com");
		
        WebElement createNewAcc = driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]"));
		
        createNewAcc.click();
        By month = By.xpath("//select[@id='month']");
		By dat = By.xpath("//select[@id='day']");
		By year = By.xpath("//select[@id='year']");
		By sleep = By.xpath("//div[@class='mbs _52lq fsl fwb fcb']");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']")));
        waitForElementToBeVisible(sleep);
        
		
//		doSelectByVisibleText(month, "Jun");
//		doSelectByVisibleText(dat, "5");
//		doSelectByVisibleText(year, "2023");
		
		doSelectDropDownList(month, DropDownList.VISIBLETEXT.toString(), "Jun");
		doSelectDropDownList(dat,DropDownList.VISIBLETEXT.toString() , "6");
		doSelectDropDownList(year, DropDownList.VISIBLETEXT.toString(), "2023");
		
		waitForElementToBeVisible(sleep);
		
	}
	
	public static void doSelectDropDownList(By locatore, String type, String value) {
		Select select = new Select(getElement(locatore));
		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			select.selectByValue(value);
			break;
		case "visibleText":
			select.selectByVisibleText(value);
			break;

		default:
			System.out.println("Please pass correct selection criteria....");
			break;
		}
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
    public static void doSelectByVisibleText(By locator, String value) {
    	Select select= new Select(getElement(locator));
    	select.selectByVisibleText(value);
    }
    
    public static void waitForElementToBeVisible(By locator) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
