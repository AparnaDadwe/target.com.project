package CncWebWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropDown {
	
	public static void main(String args[]) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,350)");
		
		//first we have to check is our select dropdown is multiselect or not then select item
		
		 WebElement elm=driver.findElement(By.xpath("//select[@id='cars']"));
		 
		 Select sel=new Select(elm);
		 
		 if(sel.isMultiple())
		 {
			 sel.selectByIndex(1);
			 sel.selectByValue("audi");
			 sel.selectByVisibleText("Volvo");
		 }
		 else 
		 {
			 System.out.println("It is not multiselect dropdown");
		 }
		
		
	}

}
