import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleJQueryDropDown {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      driver = new ChromeDriver();
      driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
      By dropcli = By.id("justAnInputBox");
      By cList = By.xpath("//span[@class='comboTreeItemTitle']");
      
      
      clickDropDown(dropcli);
      selectChoiseValues(cList, "all");
      
	}
	
	public static void clickDropDown(By locator) {
		WebElement dropdd = driver.findElement(locator);
		dropdd.click();
	}
	
	public static WebElement getListOfElements(By locator) {
		return (WebElement) driver.findElements(locator);
	}
	
	public static void selectChoiseValues(By locor,String... value) {
		
		List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		if(!value[0].equalsIgnoreCase("all") ) {
			
			for(WebElement lis: choiceList) {
				String text = lis.getText();
				
				for(String val:value) {
					if(text.equals(val)) {
						lis.click();
						break;
					}
				}
			}
			
		}else {
			for(WebElement lis:choiceList) {
				lis.click();
				System.out.println("Selected all choices");
			}
		}
		
	}
		
	}

	
	


