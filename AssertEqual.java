import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;
public class AssertEqual {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		  driver.get("https://practice.automationbyte.com/forms/basic-form-1");
		  String actualTitle = driver.getTitle();
		  Assert.assertEquals(actualTitle, "AutomationByte - Handcrafted Practice Material");
		  System.out.println("Actual Title :: " + actualTitle);

	}

}
