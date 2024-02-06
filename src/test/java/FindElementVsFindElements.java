import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementVsFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");

//		WebElement searchBox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
//	    searchBox.sendKeys("VTBBH");
	    
	    List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
	    System.err.println("Link -- > " + links.size());
	    
	    for(WebElement el: links) {
	    	System.out.println(el.getText());
	    }
	    
	    
	}

}
