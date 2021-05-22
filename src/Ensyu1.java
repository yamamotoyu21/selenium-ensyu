import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	/*selenium演習1のコード
	 * 
	 *@Author YamamotoYu
	 */

public class Ensyu1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		//ChromeDriverを作る。
		
		System.setProperty("webdriver.chrome.driver","./exe/chromedriver");
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://www.google.com/xhtml");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("selenium");
		searchbox.submit();
		
		WebElement topSentence = driver.findElement(By.cssSelector("div.yuRUbf > a > h3"));
		
				
		System.out.println(topSentence.getText());
		driver.quit(); //ブラウザを閉じる
	
		
		
		
		
	
		
		
		

	}

}
