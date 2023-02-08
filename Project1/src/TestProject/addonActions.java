package TestProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import bsh.This;

public class addonActions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	
	
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://seleniumautomationpractice.blogspot.com/2018/03/ui-droppable-default-functionality.html");
	
		
		WebElement e1 = driver.findElement(By.id("draggable"));
		WebElement e2 = driver.findElement(By.id("droppable"));
		
		
		
		 Actions a1 = new Actions(driver);
		  a1.dragAndDrop(e1, e2).perform();
	
		String s1 = driver.getTitle();
		System.out.println("Actual page title is "+ s1);
		String s2 = "Drag&Drop1";
		System.out.println("Expected page title is "+ s2);
		
			
		if (s1==s2) {
			System.out.println("Result is ccorrect ");		
		}else {
			System.out.println("Result is Wrong");		
		}
		
	
		// SOFT ASSERT
		SoftAssert sftass = new SoftAssert();
	
		sftass.assertEquals(s1,s2);
		System.out.println("result failed ");
		
		driver .get("https://seleniumautomationpractice.blogspot.com/2020/04/tooltip.html");
		WebElement e3 = driver.findElement(By.xpath("//*[contains(text(), 'April 02')]/following::div[3] "));
		a1.moveToElement(e3).perform();
		
		//HARD ASSERT 
		//	Assert.assertEquals(s1, s2); 
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
			//Screenshot
		
		
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File dsrc = new File("D:\\selenium\\Screenshot\\test212.png");
		FileUtils.copyDirectory(src, dsrc);
		
		
	
		
		
		driver.quit();
		
		
		
	}

}
