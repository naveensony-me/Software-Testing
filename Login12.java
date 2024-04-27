import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Login12 {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		// identify link
		WebElement m = driver.findElement(By.linkText("Write for us"));
		//Javascript Executor
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", m);
		System.out.println("Page title after click: " + driver.getTitle());
		//driver.quit();

	}

}
