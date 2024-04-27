import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.*; 
import org.openqa.selenium.firefox.FirefoxDriver; 
public class Webdriver1
{   
	public static void main(String[] args) throws InterruptedException   
	{ 
		
		ChromeDriver driver = new ChromeDriver();  
		// Puts an Implicit wait, Will wait for 10 seconds  
		// before throwing exception 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
		// Launch website  
		driver.navigate().to("http://www.calculator.net/mortgage-payoff-calculator.html"); 
		driver.manage().window().maximize();     
		// Click on Radio Button  
		driver.findElement(By.id("cpayoff1")).click();     
		System.out.println("The Output of the IsSelected " +   driver.findElement(By.id("cpayoff1")).isSelected());  
		System.out.println("The Output of the IsEnabled " +  driver.findElement(By.id("cpayoff1")).isEnabled());  
		System.out.println("The Output of the IsDisplayed " +  driver.findElement(By.id("cpayoff1")).isDisplayed());  
		driver.close();       
		// Close the Browser.    
		driver.close();     
}
}