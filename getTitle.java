import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class getTitle {
public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();  
		 driver.manage().window().maximize();
driver.get("https://www.edureka.co");
System.out.println(driver.getTitle());
System.out.println("Hello");
//driver.quit();

}}
