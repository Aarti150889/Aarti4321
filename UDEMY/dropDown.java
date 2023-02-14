package UDEMY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\Start\\softwares and drivers\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//	WebElement m=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//	Thread.sleep(2000);
//	Select dropdown= new Select(m);
//	
//	dropdown.selectByIndex(3);
//	System.out.println(dropdown.getFirstSelectedOption().getText());
//	
//	dropdown.selectByVisibleText("AED");
//	System.out.println(dropdown.getFirstSelectedOption().getText());
//	
//	dropdown.selectByValue("INR");
//	System.out.println(dropdown.getFirstSelectedOption().getText());
//	
//	driver.findElement(By.id("divpaxinfo")).click();
//	Thread.sleep(2000);
//	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//	for(int i=1;i<5;i++)
//	{
//	driver.findElement(By.id("hrefIncAdt")).click();
//	}
//	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//	driver.findElement(By.id("btnclosepaxoption")).click();
	
//	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTNR")).click();
//	driver.findElement(By.xpath("//a[@value='BLR']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).click();
//	driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
    
	//driver.get("http://spicejet.com"); //URL in the browser

//  //a[@value='MAA']  - Xpath for chennai

//  //a[@value='BLR']

driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

driver.findElement(By.xpath("//a[@value='BLR']")).click();

Thread.sleep(2000);

driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
    
	
	}
	   
	

}
