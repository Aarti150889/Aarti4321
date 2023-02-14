package UDEMY;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\Start\\softwares and drivers\\chromedriver_win32 (6)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		JS.executeScript("window.scroll(0,800)");
		
	//	WebElement E=driver.findElement(By.xpath("//div[contains(@class,'tableFixHead')]"));
	//	JS.executeScript("arguments[0].scrollIntoView(true)",E);
		JS.executeScript("document.querySelector('div.tableFixHead').scroll(0,100)");
		
		
		
		
		
		
		
		
	}

}
