package Introduction.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\kahjy\\eclipse-workspace\\Introduction\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int i = 1;
		while (i < 5) 
		{
			driver.findElement(By.id("hrefIncAdt")).click(); //4 times
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}
}
