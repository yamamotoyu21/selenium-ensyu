



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;







public class Ensyu2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rakuplus.jp/");
		WebElement userName = driver.findElement(By.cssSelector("#user_login"));
		userName.sendKeys("yu.yamamoto@rakus-partners.co.jp");
		
		WebElement password = driver.findElement(By.cssSelector("#user_pass"));
		password.sendKeys("yu.yamamoto@rakus-partners.co.jp");
		
		userName.submit();
		//password.submit();

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file.toPath(), new File("/Users/yamamotoyuu/Documents/workspace/Selenium-ensyu" + file.getName()).toPath());
		
		
		driver.quit();
		

	}

}
