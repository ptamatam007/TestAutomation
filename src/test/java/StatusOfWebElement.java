import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v119.page.model.FontFamilies;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StatusOfWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		WebDriver dr= new ChromeDriver();
		
		dr.get("https://demo.nopcommerce.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement register = dr.findElement(By.xpath("//a[normalize-space()='Register']"));
		register.click();
        
		
		WebElement search = dr.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Display Status---> " + search.isDisplayed());
		System.out.println("Is Enabled --> " + search.isEnabled());
		// isSelected - check radio button ot not
	    WebElement male = dr.findElement(By.xpath("//input[@id='gender-male']"));
	    WebElement female = dr.findElement(By.xpath("//input[@id='gender-female']"));
	    
	    System.out.println("Is selected --> "+male.isSelected());
	    System.out.println("Is selected --> "+female.isSelected()); 
	    
	    male.click();
	    System.out.println("Clicked on male button");
	    System.out.println("Is selected --> "+male.isSelected());
	    System.out.println("Is selected --> "+female.isSelected()); 
		//dr.quit();
	    female.click();
	    System.err.println("Female clicked");
	    
	    System.err.println("Male Selected--> " + male.isSelected());
	    System.err.println("Female selected--->" + female.isSelected());
	    }

}
