package CncWebWorld;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingExample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
	String parentWindowHandle=	driver.getWindowHandle();
	
	System.out.println(parentWindowHandle);
	
	Set<String> allWindoHandle=driver.getWindowHandles();
	
    Iterator<String> itr=allWindoHandle.iterator();
    
    while(itr.hasNext()) 
    {
    	String childWindowHandle=itr.next();
    	
    	if(!(childWindowHandle.equals(parentWindowHandle)))
    	{
    		driver.switchTo().window(childWindowHandle);
    	}
    }
    
    String text=driver.findElement(By.id("sampleHeading")).getText();
    
    System.out.println(text);
	

	}

}
