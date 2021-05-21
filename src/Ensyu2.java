import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ensyu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rakuplus.jp/");
		WebElement userName = driver.findElement(By.cssSelector("#user_login"));
		userName.sendKeys("yu.yamamoto@rakus-partners.co.jp");
		
		WebElement password = driver.findElement(By.cssSelector("#user_pass"));
		password.sendKeys("yu.yamamoto@rakus-partners.co.jp");
		
		userName.submit();
		password.submit();
		
		driver.quit();
		

	}

}
