package START;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningNewTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\Start\\softwares and drivers\\chromedriver_win32 (6)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	   // driver.get("https://www.amazon.in/");
	  //  driver.switchTo().newWindow(WindowType.TAB);  
	    driver.get("https://www.amazon.in/");
	    WebElement e=driver.findElement(By.id("twotabsearchtextbox"));
	    e.sendKeys("iphone 13");
	    e.submit();
        JavascriptExecutor JS=(JavascriptExecutor)driver;
//	    JS.executeScript("window.scrollBy(0,1200)");
	    
        driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (256GB) - Blue'])")).click();
     
        Thread.sleep(8000);
        JS.executeScript("window.scrollBy(0,500)");
	    
	    List<String>list2=new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(list2.get(1));
	    Thread.sleep(2000);
	    String s=driver.getCurrentUrl();
	    System.out.println(s);
	    driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	    Navigation n=driver.navigate(); //Navigation interface
	    n.refresh();
	    n.back();
	    n.forward();
	    driver.navigate().refresh();
	   //  driver.manage().window().maximize();
	   
	    
	}

}
