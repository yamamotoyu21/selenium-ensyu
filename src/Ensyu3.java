import java.util.Calendar;
import java.util.Locale;

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
		String Handle = driver.getWindowHandle();
		
		WebElement click1 = driver.findElement(By.cssSelector("#menu_1 > a"));
		click1.click();
		
		String newhandle = null;
		
		for(String id: driver.getWindowHandles()) {
			if(!id.equals(Handle)) {
				newhandle = id;
			}
		}
		
		driver.switchTo().window(newhandle);
		Thread.sleep(2000);
		
		click1 = driver.findElement(By.cssSelector("#topMenuBtn03 > a"));
		click1.click();
		Thread.sleep(2000);
		
		Calendar calendar = Calendar.getInstance();
		
		
		
		//和暦を入力（開始）
		WebElement inputYear = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(2)"));
		inputYear.sendKeys("3");
		
		//今月の値を入力（開始）
		WebElement inputMonth = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(3)"));
		int month = calendar.get(Calendar.MONTH) + 1;
		inputMonth.sendKeys(Integer.valueOf(month).toString());
		
		Thread.sleep(1000);
		
		//今日の日付を入力（開始）
		
		WebElement inputDay = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(4)"));
		int date = calendar.get(Calendar.DATE);
		inputDay.sendKeys(Integer.valueOf(date).toString());
		
		//和暦を入力（終了）
		
		WebElement inputYear2 = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(7)"));
		inputYear2.sendKeys("3");
		
		//月を入力（終了）
		
		WebElement inputMonth2 = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(8)"));
		inputMonth2.sendKeys("6");
		
		//日付を入力（終了）
		WebElement inputDate2 = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table.searchCond > tbody > tr:nth-child(17) > td > input[type=text]:nth-child(9)"));
		inputDate2.sendKeys("30");
		
		//検索ボタンをクリック
		WebElement search = driver.findElement(By.cssSelector("body > div.contents > div > form > table:nth-child(5) > tbody > tr:nth-child(3) > td > table:nth-child(2) > tbody > tr > td > a"));
		search.click();
		
		Thread.sleep(1000);
		
		
		
		
		//1件目
		WebElement release1 = driver.findElement(By.cssSelector("body > div.contents > div > form > table.list-data > tbody > tr:nth-child(2) > td.light-green"));
		System.out.println(release1.getText());
		
		WebElement contractNum1 = driver.findElement(By.cssSelector("body > div.contents > div > form > table.list-data > tbody > tr:nth-child(2) > td:nth-child(2)"));
		System.out.println(contractNum1.getText());
		
		WebElement title1 = driver.findElement(By.cssSelector("body > div.contents > div > form > table.list-data > tbody > tr:nth-child(2) > td:nth-child(3)"));
		System.out.println(title1.getText());
		
		
		
		
		//2件目
		WebElement release2 = driver.findElement(By.cssSelector("body > div.contents > div > form > table.list-data > tbody > tr:nth-child(3) > td.light-green"));
		System.out.println(release2.getText());
		
		WebElement contractNum2 = driver.findElement(By.cssSelector("body > div.contents > div > form > table.list-data > tbody > tr:nth-child(3) > td:nth-child(2)"));
		System.out.println(contractNum2.getText());
		
		WebElement title2 = driver.findElement(By.cssSelector("body > div.contents > div > form > table.list-data > tbody > tr:nth-child(3) > td:nth-child(3)"));
		System.out.println(title2.getText());
		
		//3件目
		WebElement release3 = driver.findElement(By.cssSelector("body > div.contents > div > form > table.list-data > tbody > tr:nth-child(4) > td.light-green"));
		System.out.println(release3.getText());
		
		WebElement contractNum3 = driver.findElement(By.cssSelector("body > div.contents > div > form > table.list-data > tbody > tr:nth-child(4) > td:nth-child(2)"));
		System.out.println(contractNum3.getText());
		
		WebElement title3 = driver.findElement(By.cssSelector("body > div.contents > div > form > table.list-data > tbody > tr:nth-child(4) > td:nth-child(3)"));
		System.out.println(title3.getText());
		
		Thread.sleep(10000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
