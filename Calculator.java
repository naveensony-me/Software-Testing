import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver; 
public class Calculator {
	
	 public static void main(String[] args)  
	 { 
		ChromeDriver driver = new ChromeDriver();     
		 // Puts an Implicit wait, Will wait for 10 seconds  
		 // before throwing exception 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		 // Launch website  
		 driver.navigate().to("http://www.calculator.net/");   
		 // Maximize the browser  
		 driver.manage().window().maximize();      
		 // Click on Math Calculators 
		 driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[1]/span[1]")).click(); 
		// Click on Percent Calculators 
		 driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click();   
		 // Enter value 10 in the first number of the percent Calculator      
		 driver.findElement(By.linkText("Mortgage Calculator")).click();     
		 // Enter value 50 in the second number of the percent Calculator     
		 driver.findElement(By.name("x")).click();        
		 // Click Calculate Button 
		 driver.findElement(By.linkText("House Affordability Calculator")).click();      
		 // Get the Result Text based on its xpath  
		 driver.findElement(By.name("x")).click();
		 String result =   driver.findElement(By.xpath(".//*[@id='content']/p[2]/span/font/b") )  .getText();      
		 //Print a Log In message to the screen     
		 System.out.println(" The Result is " + result);       
		 //Close the Browser.     
		   
	 }

}
