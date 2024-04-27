import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class btnClick {

	FirefoxDriver driver;
	String url="https://demo.guru99.com/v4/";
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(url);
		
	}
	
	public void login()
	{
		WebElement usernameElement=driver.findElement(By.name("uid"));
		
		usernameElement.sendKeys("mngr540677");
		driver.findElement(By.name("password")).sendKeys("bEbynug");
		driver.findElement(By.name("btnLogin")).click();
	}


	public static void main(String[] args) {
		
		
		btnClick t1=new btnClick();
		t1.invokeBrowser();
		t1.login();
	}


	
		

	}


