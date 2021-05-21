import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ensyu3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.e-procurement.metro.tokyo.jp/index.jsp");
		WebElement element = driver.findElement(By.cssSelector("#menu_1 > a"));
		element.click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
