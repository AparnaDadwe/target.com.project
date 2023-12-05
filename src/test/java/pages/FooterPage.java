package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterPage {
	
	WebDriver driver;
	WebElement aboutTarget;
	
	public FooterPage(WebDriver driver) {
		
		this.driver=driver;
		
	}

	public WebElement getAboutTarget() {
		setAboutTarget();
		return aboutTarget;
	}

	public void setAboutTarget() {
		this.aboutTarget = driver.findElement(By.xpath("//a//span[text()='About Target']"));
	}
	
	public void clickOnAboutTarget() {
		
		getAboutTarget().click();
		
	}

}
