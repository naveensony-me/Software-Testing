import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;



public class Login {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\selenium chromedriver\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver(); 
driver.get("https://auth.geeksforgeeks.org/"); 
driver.manage().window().maximize(); 
driver.findElement(By.id("luser")).sendKeys("xyz@gmail.com"); 
driver.findElement(By.id("password")).sendKeys("xyz12345"); 
driver.findElement(By.className("signin-button")).click(); 

	}

}
