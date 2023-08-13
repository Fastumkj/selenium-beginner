import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sbst50SJ {

    public static void main(String[] args) {
    	WebDriver driver = new ChromeDriver();
        driver.get("https://www.sbst50.com/mini-gaming");

        driver.manage().window().maximize();
        sleep();
        
        for (int i = 0; i < 5; i++) {
        //Start button to start the game!
        Start startButton = new Start(driver);
        startButton.click();
        System.out.println("START! button working!");
        sleep();
        
		/*-------------------------------------------
		 * Testing of the modes to go back to the page 
		 * -------------------------------------------*/
		testModesGoBack(driver);
		
		/*-------------------------------------
		 * Testing of primary mode of transport
		 * ------------------------------------ */
		//List of transport
		List<WebElement> transportModes = driver.findElements(By.cssSelector("div.col-lg-4.col-md-4.col-sm-4.col-4.text-center.animate__animated.animate__zoomIn.animate__fast button"));
		int ListSize = transportModes.size();
		System.out.println("#Total transports: " + ListSize);
		//mutable list
		//List<String> transportTypes = new ArrayList<>(Arrays.asList("hi", "meow"));
		
			transportModes = driver.findElements(By.cssSelector("div.col-lg-4.col-md-4.col-sm-4.col-4.text-center.animate__animated.animate__zoomIn.animate__fast button"));
			
			WebElement transport = transportModes.get(i);
		    sleep();
		    System.out.println("Transport clicked: " + transport.getText());
		    String transportC = transport.getText(); //used to print out the title completed.
		    transport.click();
		    sleep();
		    
		    //testing of location onwards
		    testLocationAndEcoGuardian(driver);
		    sleep();
		       
		    System.out.println(String.format("--------> Checking of %s completed! <--------", transportC));
		    sleep();
		    
		    // to remove any pop-ups 
	        // Create an instance of the Actions class
	        Actions removePopUps = new Actions(driver);

	        // Simulate pressing the Escape key
	        removePopUps.sendKeys(Keys.ESCAPE).perform();
		    
		    //get back to square 1 and start back on the transport
		    CrossBack crossBack = new CrossBack(driver);
		    crossBack.click();
		    sleep();

		    while (i < 2) { //return back to homepage
			    startButton = new Start(driver);
			    sleep();
		        startButton.click();
		        System.out.println("START! button working!");
		        sleep();
		        break;
		    }
		    
		}
		
		System.out.println("--> ALL IS DONE CHECKING! <--");

        System.out.println("Browser closing!");
        //driver.quit(); // Close the browser after interacting with the elements
        
        }
     
    private static void testModesGoBack(WebDriver driver) {
        // I. Arrow button to go back to the page and back to square 1
        ArrowBack arrowBack = new ArrowBack(driver);
        arrowBack.click();
        System.out.println("Arrow button working!");
        sleep();

        Start startButton = new Start(driver);
        startButton.click();
        System.out.println("START! button working!");
        sleep();

        // II. Cross button to go back to the page and back to square 1
        CrossBack crossBack = new CrossBack(driver);
        crossBack.click();
        System.out.println("Cross button working!");
        sleep();

        //Start the page in 'Which is your primary mode of transport' https://www.sbst50.com/mode-of-transport
        startButton = new Start(driver);
        startButton.click();
        System.out.println("START! button working!");
        sleep();
    }
    
    private static void testLocationAndEcoGuardian(WebDriver driver) {
    	//I. Testing of Starting Location and Destination Location -> Create EcoG ...
		WebElement SLocation = driver.findElement(By.xpath("//input[@placeholder='Starting Location']"));
		SLocation.sendKeys("a");
        // Perform keyboard interactions to select the first option from the dropdown
        Actions actions = new Actions(driver);
        sleep();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        
		WebElement DLocation = driver.findElement(By.xpath("//input[@placeholder='Destination Location']"));
		DLocation.sendKeys("b");
        actions = new Actions(driver);
        sleep();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        sleep();
        System.out.println("Location details done!");
        
        //Creating of EcoGuardian
        WebElement createEcoButton = driver.findElement(By.xpath("//button[contains(text(),'CREATE MY ECOGUARDIAN')]"));
        createEcoButton.click();
        System.out.println("Create my ECOG Button working!");
        sleep();
        
        WebElement evolveButton = driver.findElement(By.xpath("//button[contains(text(),'Evolve!')]"));
        evolveButton.click();
        System.out.println("Evolve Button working!");
        sleep();
        WebElement nextButton = driver.findElement(By.xpath("//button[contains(text(), 'Next')]"));
        nextButton.click();
        System.out.println("Next Button(1) working!");
        sleep();
        
        nextButton = driver.findElement(By.xpath("//button[contains(text(), 'Next')]"));
        nextButton.click();
        System.out.println("Next Button(2) working!");
        sleep();
        
        //STS = SHARE TO SOCIALS
        WebElement STSButton = driver.findElement(By.cssSelector("button.share-social-one"));
        STSButton.click();
        System.out.println("Share Socials(1) working!");
        sleep();
        
        STSButton = driver.findElement(By.cssSelector("button.share-social-two"));
        STSButton.click();
        System.out.println("Share Socials(2) working!");
        sleep();
    }
    
    private static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Start {
    private WebElement element;

    public Start(WebDriver driver) {
        this.element = driver.findElement(By.xpath("//button[@routerlink='/mode-of-transport']"));
    }

    public void click() {
        element.click();
    }
}

class ArrowBack {
    private WebElement element;

    public ArrowBack(WebDriver driver) {
        this.element = driver.findElement(By.xpath("//img[contains(@src,'/mini-game/back-ico.png')]"));
    }

    public void click() {
        element.click();
    }
}

class CrossBack {
    private WebElement element;

    public CrossBack(WebDriver driver) {
        this.element = driver.findElement(By.xpath("//img[contains(@src,'/mini-game/close-ico.png')]"));
    }

    public void click() {
        element.click();
    }
}




