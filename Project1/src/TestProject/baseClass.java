package TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class baseClass {
	
	public static WebDriver driver;

	public static void openbrowser (String browserName)
			
	{
		try {
			if(browserName.equalsIgnoreCase("Chrome"))
			{
				System.out.println("The browser selected is " + browserName);
				System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
				  driver = new ChromeDriver();
				
			}
			else if  (browserName.equalsIgnoreCase("Firefox"))
			{
				System.out.println("The browser selected is " + browserName);
				System.setProperty("webdriver.gecko.driver","D:\\selenium\\Drivers\\gecko.exe");
				WebDriver driver = new FirefoxDriver() ;
			
				
			}
			else if(browserName.equalsIgnoreCase("Edge"))
			{
				System.out.println("The browser selected is " + browserName);
				System.setProperty("webdriver.edge.driver","D:\\selenium\\Drivers\\edge.exe");
				WebDriver driver = new EdgeDriver() ;
				
			}
			
		} catch (Exception e) {
			System.out.println("The error is " + e.getMessage());			
		}		
		
	}
	
	public static void openurl() {
		System.out.println("Opening URL ");
		
		driver.get("https://seleniumautomationpractice.blogspot.com/");
		System.out.println("URL opened ");
	}
	
			
			
	public static void entertext(By locvalue, String data) {
		
		try {			
		
		driver.findElement(locvalue).sendKeys(data);
		System.out.println("The data entered was " + data + ", in the locator " + locvalue );
	}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void select(By locvalue ) {
		
		try {
			driver.findElement(locvalue).click();
			System.out.println("The option selected is " + locvalue);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
		
	public static void select(By locvalue, int no )	 {
		
		try {
			new Select (driver.findElement(locvalue)).selectByIndex(no);
			System.out.println("the sele");
					
			
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
	}
		public static void select(By locvalue, String data)
		{
			
			try {
				new Select (driver.findElement(locvalue)).selectByValue(data);
				System.out.println("the selecter value is " + locvalue);
						
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public static void select1(By locvalue , String data) {
			try {
				new Select (driver.findElement(locvalue)).selectByVisibleText(data);
				System.out.println("the selecter value is " + locvalue);
						
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		 
		public static void alert(String action) {

			try {
				
				if (action.equalsIgnoreCase("ok"))
				{
					System.out.println(driver.switchTo().alert().getText());
					driver.switchTo().alert().accept();
										
				}else if (action.equalsIgnoreCase("cancel")) {
					System.out.println(driver.switchTo().alert().getText());
					driver.switchTo().alert().dismiss();
					
				}
	
				
			} catch (Exception e) {
				
				System.out.println("Errr while performing actino on alert " + e.getMessage());
					
				}
			}
		
		public static void shutdown () {
			driver.quit();
			
		}
		} 
	
	

	




