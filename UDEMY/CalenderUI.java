package UDEMY;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderUI {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\Start\\softwares and drivers\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.xpath("//div[@style='background-size: 100% 535px;']")).click();

		driver.findElement(By.xpath("//label[@for='departure']")).click();
		Thread.sleep(2000);

		 List<WebElement> datelist = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
		System.out.println(datelist.size());
		for (int i = 0; i < datelist.size(); i++) {
	//	String s = datelist.get(i).getText(); // observe text this returning in console first
		String p = datelist.get(i).getAttribute("aria-label");//and see what text this line returning
		// System.out.println(s);
		System.out.println(p);


		if (p.contains("Feb 15")) {
		datelist.get(i).click();
		
		driver.manage().deleteAllCookies();
		}
		}

		}


	}


