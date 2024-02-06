import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckDropDownSortedorNot {
    public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       driver = new ChromeDriver();
       driver.get("https://fb.com");
       
       By RButt = By.xpath("(//a[normalize-space()='Create new account'])[1]");
       By monthDD = By.xpath("//select[@id='month']");
       
       doClickButton(RButt);
       waitForElementToBeVisible(monthDD);
       doSelectDropdown(monthDD);
       
	}
	public static void waitForElementToBeVisible(By locator) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
	public static void doClickButton(By locator) {
		WebElement registerButton = driver.findElement(locator);
		     registerButton.click();
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectDropdown(By locator) {
		Select sel = new Select(getElement(locator));
		
		List<WebElement> drList = sel.getOptions();
		
		ArrayList<String> or_list = new ArrayList();
	    ArrayList<String>  temp_list = new ArrayList();
	    for(WebElement option: drList) {
	    	or_list.add(option.getText());
	    	temp_list.add(option.getText());
	    }
	    System.err.println("Original List values -->"+ or_list);
	    System.out.println("Teml list values--> " + temp_list );
	    
	    Collections.sort(temp_list);
	    System.err.println("Original List values -->"+ or_list);
	    System.out.println("Afer sorting Teml list values--> " + temp_list );
	    
	    if(or_list.equals(temp_list)) {
	    	System.out.println("Dropdown Sorted");
	    }else {
	    	System.out.println("Not Sorted list");
	    }
	    driver.close();
	}

}
