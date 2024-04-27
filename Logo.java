package Logo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
		 	driver.get("https://www.google.co.in/");
			boolean logo = driver.findElement(By.xpath("//*[@id='hplogo']")) .isDisplayed();
			if (logo == true) 
			{ 
				System.out.println("logo is available"); 
			} 
			else 
			{ 
				System.out.println("logo is not available");
				} 


	}

}
