package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators4Fastumkj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\kahjy\\eclipse-workspace\\Introduction\\drivers\\msedgedriver.exe");
		WebDriver driver  = new EdgeDriver();
		driver.get("https://fastumkj.github.io/contact.html");
		driver.findElement(By.id("name")).sendKeys("testing");
		driver.findElement(By.id("email")).sendKeys("testing@hotmail.com");
		driver.findElement(By.id("subject")).sendKeys("Selenium testing");
		driver.findElement(By.name("submit")).click();
		
		//sleep for 10 secs
		sleep();

		//a bit cmi cuz of the verification behind the checkbox.
		driver.findElement(By.className("recaptcha-checkbox-border")).click();
	}

	private static void sleep() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
