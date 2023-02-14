package UDEMY;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUpHASNEXT {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\velocity\\Start\\softwares and drivers\\chromedriver_win32 (6)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			WebElement input = driver.findElement(By.xpath("//input[@class='_3704LK']"));

			input.sendKeys("redmi 11");

			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(4000);
			for (int i = 1; i <= 4; i++) {
			driver.findElement(By.xpath("(//div[@class='_4rR01T'])[" + i + "]")).click();
			}


			Thread.sleep(7000);

			Set<String> windowlist = driver.getWindowHandles();


			Iterator<String> it = windowlist.iterator();
			while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			Thread.sleep(1000);
			if(driver.getTitle().contains("Note"))
			{
	 		System.out.println("inside if loop");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
            Thread.sleep(1000);
			}

			}

			}

	}


