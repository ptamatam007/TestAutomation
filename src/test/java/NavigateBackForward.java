import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackForward {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://snapdeal.com");
		//driver.get("https://demo.nopcommerce.com/");
		driver.navigate().to("https://demo.nopcommerce.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
	}

}
