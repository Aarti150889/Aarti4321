package UDEMY;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class partialScreenshot {

	public static void main(String[] args) throws IOException {
		
			System.setProperty("webdriver.chrome.driver","C:\\velocity\\Start\\softwares and drivers\\chromedriver_win32 (6)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			WebElement search=driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]"));
			File Source=search.getScreenshotAs(OutputType.FILE);
			
			File destination = new File("\\F:\\ScreenShot\\Avneesh.jpg4");
			FileHandler.copy(Source, destination);
			int height=search.getRect().getHeight();
			int width=search.getRect().getWidth();
	
			System.out.println(height);
			
			
	}

}
