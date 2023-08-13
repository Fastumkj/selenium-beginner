package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowActivities {

	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\kahjy\\eclipse-workspace\\Introduction\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com"); //wait till componenets are fully 100%
		driver.navigate().to("https://fastumkj.github.io");
		driver.navigate().back();
		driver.navigate().forward();
	}
}
