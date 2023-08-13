package Introduction.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicDropdown {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\kahjy\\eclipse-workspace\\Introduction\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// //a[@value='BLR'] - Xpath for Bengaluru
		// //a[@value='MAA'] - Xpath for Bengaluru
		//to solve the issue of got 2 types, use (//a[@value='MAA'])[2]
		
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
	}

}
