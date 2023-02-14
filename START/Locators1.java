package START;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {

   //  System.setProperty("webdriver.driver.chrome","C:\\velocity\\Start\\softwares and drivers\\chromedriver_win32 (3)\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
        

		System.setProperty("webdriver.chrome.driver","C:\\velocity\\Start\\softwares and drivers\\chromedriver_win32 (6)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("bmwradio")).click();
		driver.findElement(By.id("name")).sendKeys("Avneesh");
		driver.findElement(By.id("openwindow")).click();
		
	}

}
