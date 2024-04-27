import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FormValidation {
	
	
	
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
		
		usernameElement.sendKeys("mngr565150");
		driver.findElement(By.name("password")).sendKeys("hupahez");
		driver.findElement(By.name("btnLogin")).click();
	}
	public void addCustomer()
	{
		
		driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.name("name")).sendKeys("Rohan");
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.name("dob")).sendKeys("26/11/2023");
		driver.findElement(By.name("addr")).sendKeys("LPU");
		driver.findElement(By.name("city")).sendKeys("Jalandhar");
		driver.findElement(By.name("state")).sendKeys("Punjab");
		driver.findElement(By.name("pinno")).sendKeys("144001");
		driver.findElement(By.name("telephoneno")).sendKeys("2345566778");
		String emailid1 ="Test" + System.currentTimeMillis()+"@abc.com";
		driver.findElement(By.name("emailid")).sendKeys(emailid1);
		driver.findElement(By.name("password")).sendKeys("bEbynug");
		driver.findElement(By.name("sub")).click();
	}
	



	public static void main(String[] args) {
		FormValidation  t1=new FormValidation ();
		t1.invokeBrowser();
		t1.login();
		t1.addCustomer();


	}

}
