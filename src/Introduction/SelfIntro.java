package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class SelfIntro {

	public static void main(String[] args) {
		
		//Invoking browser
		//Chrome - ChromeDriver extension -> Methods close get
		//Firefox - FirefoxDriver -> Methods close get
		//WebDriver close get
		//WebDriver is an interface
		//WebDriver methods + class methods
		
		
		//Edge // webdriver.chrome.driver -> value of path
		//Create driver
		System.setProperty("webdriver.edge.driver", "C:\\Users\\kahjy\\eclipse-workspace\\Introduction\\drivers\\msedgedriver.exe");
		WebDriver driver  = new EdgeDriver();	
		
		// chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kahjy\\eclipse-workspace\\Introduction\\drivers\\chromedriver.exe");
		WebDriver driver1  = new ChromeDriver();
		
		driver.get("https://fastumkj.github.io");
		System.out.println("Title: " +driver.getTitle());
		System.out.println("Current Url: " + driver.getCurrentUrl());
		//.close() is close current window only, .quit() closes every window
		//driver.close();
		

	}
}
