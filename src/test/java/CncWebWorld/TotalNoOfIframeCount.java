package CncWebWorld;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalNoOfIframeCount {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		//get total no of iframes in webpage
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 Integer noOfFrame = Integer.parseInt(js.executeScript("return window.length").toString());
	      System.out.println("No. of iframes on the page are " + noOfFrame); 
	      
	      System.out.println("***************************************************************************************"); 
	      
	      //total no of iframe by finding iframe tag by list interface
	      
	   List<WebElement> iFrameElement= driver.findElements(By.tagName("iframe"));
	   
	   System.out.println("No of iframe are : " + iFrameElement.size() );

	}

}
