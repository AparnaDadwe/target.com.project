package CncWebWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownSelectClass {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demoqa.com/select-menu");
	
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,250)");
	
	WebElement selectDropDownElm=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
	
	Select selectItem=new Select(selectDropDownElm);
	
//	selectItem.selectByIndex(5);
	
//	selectItem.selectByValue("4");
	
	selectItem.deselectByVisibleText("Magenta");
	
	
	

	}

}
