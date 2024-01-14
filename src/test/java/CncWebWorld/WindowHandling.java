package CncWebWorld;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		
	    String parentwindowHandle=	driver.getWindowHandle();
	    
	    System.out.println(parentwindowHandle);
	    
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
		 Set<String> allwindowHandle=driver.getWindowHandles();
		 
		 for(String childWindowHandle:allwindowHandle)
		 {
			 if(!(childWindowHandle.equals(parentwindowHandle))) 
			 {
				 driver.switchTo().window(childWindowHandle);
			 }
		 }

      String actualText= driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
      System.out.println(actualText);
      
        driver.switchTo().window(parentwindowHandle);
	}

}
