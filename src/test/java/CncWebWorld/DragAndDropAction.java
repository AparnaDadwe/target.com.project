package CncWebWorld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable/");
		
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("draggable"));
		
		act.dragAndDrop(source, target).build().perform();
	}

	
}
