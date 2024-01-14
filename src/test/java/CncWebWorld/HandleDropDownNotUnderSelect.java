package CncWebWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropDownNotUnderSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,350)");
		
		driver.findElement(By.xpath("//div[@id='selectOne']"));

	}

}
