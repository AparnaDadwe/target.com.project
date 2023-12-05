package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import target.com.project.utility.Utility;

public class LoginPage {
	WebDriver driver;
	WebElement textUsername;
	WebElement textPassword;
	WebElement signInBtn;
	WebElement textErrorMsg;
	WebElement targetTermsAndCondition;
	WebElement targetPrivacyPolicyLink;
	WebElement btnCreateTargetAccount;
	WebElement textInbtnCreateTargetAccount;
	WebElement forgotPasswordLink;
	WebElement seeOfferDetailsLink;
	WebElement checkBoxKeepMeSignIn;
	WebElement btnShowInPasswordInputBox;
	WebElement btnHideInPasswordInputBox;
	WebElement labelForUsername;
	WebElement labelForPassword;
	WebElement blankEmailAddress;
	WebElement blankPassword;
	WebElement userNameErrorMsg;
	WebElement passwordErrorMsg;
	WebElement titleLoginPage;
	
	public  LoginPage(WebDriver driver) {
			this.driver=driver;
		}
	public WebElement getTextUsername() {
		setTextUsername();
		return textUsername;
	}
	public void setTextUsername() {
		this.textUsername =driver.findElement(By.xpath("//input[@name='username']"));
	}
	public WebElement getTextPassword() {
		setTextPassword();
		return textPassword;
	}
	public void setTextPassword() {
		this.textPassword = driver.findElement(By.xpath("//input[@name='password']"));
	}
	public WebElement getSignInBtn() {
		setSignInBtn();
		return signInBtn;
	}
	public void setSignInBtn() {
		this.signInBtn =driver.findElement(By.xpath("//button[@id='login']"));
	}
	public WebElement getTextErrorMsg() {
		setTextErrorMsg();
		return textErrorMsg;
	}
	public void setTextErrorMsg() {
		this.textErrorMsg =driver.findElement(By.xpath("//div[@data-test='authAlertDisplay']"));
	}
	
	public WebElement getTargetTermsAndCondition() {
		setTargetTermsAndCondition();
		return targetTermsAndCondition;
	}
	public void setTargetTermsAndCondition() {
		this.targetTermsAndCondition =driver.findElement(By.xpath("//a[text()='Target terms and conditions']"));
	}
	public WebElement getTargetPrivacyPolicyLink() {
		setTargetPrivacyPolicyLink();
		return targetPrivacyPolicyLink;
	}
	public void setTargetPrivacyPolicyLink() {
		this.targetPrivacyPolicyLink =driver.findElement(By.xpath("//a[text()='Target privacy policy']"));
	}
	
	 public WebElement getBtnCreateTargetAccount() {
		 setBtnCreateTargetAccount();
			return btnCreateTargetAccount;
		}
		public void setBtnCreateTargetAccount() {
			this.btnCreateTargetAccount =driver.findElement(By.xpath("//button[@id='createAccount']"));
		}
		
		public WebElement getTextInbtnCreateTargetAccount() {
			setTextInbtnCreateTargetAccount();
			return textInbtnCreateTargetAccount;
		}
		public void setTextInbtnCreateTargetAccount() {
			this.textInbtnCreateTargetAccount =driver.findElement(By.xpath("//button[text()='Create your Target account']"));
		}
		public WebElement getSeeOfferDetailsLink() {
			setSeeOfferDetailsLink();
			return seeOfferDetailsLink;
		}
		public void setSeeOfferDetailsLink() {
			this.seeOfferDetailsLink = driver.findElement(By.xpath("//span[text()='See offer details.']"));
		}
		public WebElement getCheckBoxKeepMeSignIn() {
			setCheckBoxKeepMeSignIn();
			return checkBoxKeepMeSignIn;
		}
		public void setCheckBoxKeepMeSignIn() {
			this.checkBoxKeepMeSignIn =driver.findElement(By.xpath("//label[@for='keepMeSignedIn']"));
		}
		public WebElement getForgotPasswordLink() {
			setForgotPasswordLink();
			return forgotPasswordLink;
		}
		public void setForgotPasswordLink() {
			this.forgotPasswordLink =driver.findElement(By.xpath("//a[@id='recoveryPassword']"));
		}
		public WebElement getBtnShowInPasswordInputBox() {
			setBtnShowInPasswordInputBox();
			return btnShowInPasswordInputBox;
		}
		public void setBtnShowInPasswordInputBox() {
			this.btnShowInPasswordInputBox =driver.findElement(By.xpath("//button[text()='show']"));
		}
		public WebElement getBtnHideInPasswordInputBox() {
			setBtnHideInPasswordInputBox();
			return btnHideInPasswordInputBox;
		}
		public void setBtnHideInPasswordInputBox() {
			this.btnHideInPasswordInputBox =driver.findElement(By.xpath("//button[text()='hide']"));
		}
		public WebElement getLabelForUsername() {
			setLabelForUsername();
			return labelForUsername;
		}
		public void setLabelForUsername() {
			this.labelForUsername =driver.findElement(By.xpath("//label[@for='username']"));
		}
		public WebElement getLabelForPassword() {
			setLabelForPassword();
			return labelForUsername;
		}
		public void setLabelForPassword() {
			this.labelForUsername =driver.findElement(By.xpath("//label[@for='password']"));
		}
		
		public WebElement getBlankEmailAddress() {
			setBlankEmailAddress();
			return blankEmailAddress;
		}
		public void setBlankEmailAddress() {
			this.blankEmailAddress =driver.findElement(By.xpath("//span[@id='username--ErrorMessage']"));
		}
		public WebElement getBlankPassword() {
			setBlankPassword();
			return blankPassword;
		}
		public void setBlankPassword() {
			this.blankPassword =driver.findElement(By.xpath("//span[@id='password--ErrorMessage']"));
		}
		public WebElement getUserNameErrorMsg() {
			setUserNameErrorMsg();
			return userNameErrorMsg;    
		}
		public void setUserNameErrorMsg() {
			this.userNameErrorMsg =driver.findElement(By.xpath("//span[@id='username--ErrorMessage']"));
		}
		public WebElement getPasswordErrorMsg() {
			setPasswordErrorMsg();
			return passwordErrorMsg;
		}
		public void setPasswordErrorMsg() {
			this.passwordErrorMsg =driver.findElement(By.xpath("//span[@id='password--ErrorMessage']"));
		}
		public WebElement getTitleLoginPage() {
			setTitleLoginPage();
			return titleLoginPage;
		}
		public void setTitleLoginPage() {
			this.titleLoginPage =driver.findElement(By.xpath("//h1[@class='Heading__StyledHeading-sc-1ihrzmk-0 styles__AuthHeading-sc-kz6dq2-2 ebXnvT kcHdEa']"));
		}
		public void clickOnHideBtnInPasswordInputBox() {
			getBtnHideInPasswordInputBox().click();
		}
		public void clickOnShowBtnInPasswordInputBox() {
			getBtnShowInPasswordInputBox().click();
		}
		
		public void clickOnKeepMeSignIn() {
			getCheckBoxKeepMeSignIn().click();
		}
		public void clickOnSeeOfferDetailsLink() {
			getSeeOfferDetailsLink().click();
		}
		public void clickOnForgotPassWordLink() {
			getForgotPasswordLink().click();
		}
		public void clickOnCreateTargetAccountBtn() {
			getBtnCreateTargetAccount().click();
		}
	public void clickOnPrivacyPolicyLink() {
		getTargetPrivacyPolicyLink().click();
	}
	public void clickOnTermsAndCondition() {
		 
         getTargetTermsAndCondition().click();
	}
	public void invalidTextInInputFields(String userName, String password) {
		getTextUsername().sendKeys(userName);
		getTextPassword().sendKeys(password);
	}
	public void textInInputFields() {
		getTextUsername().sendKeys(Utility.getProperty("userName"));
		getTextPassword().sendKeys(Utility.getProperty("passWord"));
	}
	public void clickOnSignInBTn() {
		getSignInBtn().click();
	}

}
