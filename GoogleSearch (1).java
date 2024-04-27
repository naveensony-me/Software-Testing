import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();  
		 driver.manage().window().maximize();
			driver.get("https://www.google.com");
			driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("iPhone");
			driver.findElement(By.xpath("/html/body/div[3]")).click();
			String url = driver.getCurrentUrl(); 
			System.out.println("URL: "+url); 
	}

}
