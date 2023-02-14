package UDEMY;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\Start\\softwares and drivers\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		List<WebElement> list=driver.findElements(By.xpath("//table[contains(@id,'countries')]//td[2]"));
		
		for(WebElement k:list)
		{
			String a=k.getText();
			if(a.contains("An"))
			{
				System.out.println(a);
				
	 		}
			
		}
		
		
	       
	       
	       
		}
	}


