package UDEMY;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class multipleTabsOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\velocity\\Start\\softwares and drivers\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String s = driver.getTitle();
		List<String> addresslist = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(addresslist.get(0));
		WebElement e=driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		e.sendKeys(s);
		
	

	}

}
