package CncWebWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframeByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		WebElement frameId=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frameId) ; 
		
	WebElement  headingText=	driver.findElement(By.id("sampleHeading"));
	
	System.out.println(headingText.getText());

	}

}
