package CncWebWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframeByIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame(2) ; 
		
	WebElement  headingText=	driver.findElement(By.id("sampleHeading"));
	
	System.out.println(headingText.getText());

	}

}
