import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SelectDropDownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		WebElement drop = driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]"));
		
		drop.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']")));
		WebElement dd = driver.findElement(By.xpath("//select[@id='month']"));
		
		//driver.close();
//		Select dropCount = new Select(drop);
//		
//		dropCount.selectByVisibleText("Chile");
//		dropCount.selectByIndex(5);
//		dropCount.selectByValue("9");
		
		
		Select dropFb = new Select(dd);
		
		//dropFb.selectByVisibleText("Jun");
		//dropFb.selectByIndex(8);
//		dropFb.selectByValue("5");
//		System.out.println("Selected drop down list");
		
		// selectting option from dropdown without using methods
		
		List<WebElement> allOptions = dropFb.getOptions();
		
		for(WebElement ddList: allOptions) {
			if(ddList.getText().equals("Jun")) {
				ddList.click();
				break;
			}
		}

	}

}
