import java.util.Scanner;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Browser
{ 
	public static void main(String[] args) throws InterruptedException 
	{ 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter brower Name:");  
		String browser = sc.nextLine();     
		WebDriver driver = null;      
		if(browser.equals("Firefox")) 
		{   
			System.setProperty("webdriver.chrome.driver", "C:\\selenium chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();   
		}  
		else   if(browser.equals("Chrome"))  
		{   
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe"); 
		driver = new ChromeDriver();  
		}  
		else  
		{   
			System.out.println("Invalid browser");   
			}   
		Thread.sleep(2000); 
		driver.close(); 
	}
}