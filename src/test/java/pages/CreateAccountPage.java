package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountPage {
	
	WebDriver driver;
	WebElement emailTextField;
	WebElement firstNameTextField;
	WebElement lastNameTextField;
	WebElement phoneNoTextField;
	WebElement createPasswordTextField;
	WebElement checkBoxKeepMeSignIn;
	WebElement createAccountBtn;
	
	public CreateAccountPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getEmailTextField() {
		 setEmailTextField();
		return emailTextField;
	}

	public void setEmailTextField() {
		this.emailTextField =driver.findElement(By.xpath("//input[@id='username']"));
	}

	public WebElement getFirstNameTextField() {
		setFirstNameTextField();
		return firstNameTextField;
	}

	public void setFirstNameTextField() {
		this.firstNameTextField = driver.findElement(By.xpath("//input[@id='firstname']"));
	}

	public WebElement getLastNameTextField() {
		setLastNameTextField();
		return lastNameTextField;
	}

	public void setLastNameTextField() {
		this.lastNameTextField = driver.findElement(By.xpath("//input[@id='lastname']"));
	}

	public WebElement getPhoneNoTextField() {
		setPhoneNoTextField();
		return phoneNoTextField;
	}

	public void setPhoneNoTextField() {
		this.phoneNoTextField = driver.findElement(By.xpath("//input[@id='phone']"));
	}

	public WebElement getCreatePasswordTextField() {
		setCreatePasswordTextField();
		return createPasswordTextField;
	}

	public void setCreatePasswordTextField() {
		this.createPasswordTextField = driver.findElement(By.xpath("//input[@id='password']"));
	}
	public WebElement getCreateAccountBtn() {
		 setCreateAccountBtn();
		return createAccountBtn;
	}
	public void setCreateAccountBtn() {
		this.createAccountBtn =driver.findElement(By.xpath("//button[@id='createAccount']"));
	}
	public WebElement getCheckBoxKeepMeSignIn() {
		setCheckBoxKeepMeSignIn();
		return checkBoxKeepMeSignIn;
	}
	public void setCheckBoxKeepMeSignIn() {
		this.checkBoxKeepMeSignIn =driver.findElement(By.xpath("//label[@for='keepMeSignedIn']"));
	}
	public void clickOnKeepMeSignIn() {
		getCheckBoxKeepMeSignIn().click();
	}
	public void clickOnCreateAccountBtn() {
		getCreateAccountBtn().click();
	}
  
	

}
