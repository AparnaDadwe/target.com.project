package CncWebWorld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		Actions act=new Actions(driver);
		
		WebElement loginBtn=driver.findElement(By.id("loginbutton"));
		
		act.contextClick(loginBtn).build().perform();

	}

}
