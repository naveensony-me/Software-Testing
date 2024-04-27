import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class searchBrowser {
	public static void main(String[] args) {

	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium chromedriver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver(); 
	driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.name("search")).sendKeys("iPhone");
		driver.findElement(By.className("input-group-btn")).click();
		String url = driver.getCurrentUrl(); 
		System.out.println("URL: "+url); 



}
}
