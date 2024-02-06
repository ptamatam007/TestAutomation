import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVaGetAttributeValu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement ser= driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		System.out.println("Get value in search box--> " + ser.getAttribute("id"));
		
       WebElement text = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
       
       System.out.println("Text of the butten-->" + text.getText());
	}

}
