package pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import target.com.project.utility.Utility;


public class TargetHomePage {
	WebDriver driver;
	WebElement getPageTitle;
	WebElement linkOFSignIn;
	WebElement linkOfCreateAccount;
	WebElement mainSignInLink;
	WebElement displaySearchBox;
	WebElement searchIcon;
	WebElement cartIcon;
	WebElement dealsLink;
	WebElement categoryLink;
	WebElement whatsNewLink;
	WebElement pickUpAndDeliveryLin;
	WebElement fatherDayGiftImage;
	WebElement displayNameHomePage;
	WebElement searchTitleHeading;
	WebElement targetLogo;
    public  TargetHomePage(WebDriver driver) {
		this.driver=driver;
	}
    public WebElement getGetPageTitle() {
    	setGetPageTitle();
		return getPageTitle;
	}        
	public void setGetPageTitle() {
		this.getPageTitle =driver.findElement(By.xpath("//title[text()='Target : Expect More. Pay Less.']"));
	}
	public WebElement getLinkOFSignIn() {
		setLinkOFSignIn();
		return linkOFSignIn;	
	}

   public  void setLinkOFSignIn() {
		this.linkOFSignIn = driver.findElement(By.xpath("//a//span[text()='Sign in']"));
	}
	public WebElement getLinkOfCreateAccount() {
		setLinkOfCreateAccount(); 
		return linkOfCreateAccount;
	}
	public void setLinkOfCreateAccount() {
		this.linkOfCreateAccount =driver.findElement(By.xpath("//a//span[text()='Create Account']"));
	}
	public WebElement getMainSignIn() {
		setMainSignIn();
		return mainSignInLink;
	}
	public void setMainSignIn() {
		this.mainSignInLink =driver.findElement(By.xpath("//a[@data-test='accountNav-signIn']"));
	}
	public void clickOnLinkOFSignIn() {
	Utility.implicitWaitFunction(driver);
		getLinkOFSignIn().click();
		
	}
//	public void redirectingToLogInPage() {
//		getLinkOFSignIn().click();
//		WebElement innerSignInLink = driver.findElement(By.xpath("//span[@class='styles__ListItemText-sc-diphzn-1 eOhzvD' and text()= 'Sign in']"));
//		innerSignInLink.click();
//		System.out.println(driver.getTitle());
//		
//		//WebElement userId = driver.findElement(By.xpath("//input[@autocomplete='username']"));
//	
//	}
	public void clickOnSpanSignInLink() {
		Utility.implicitWaitFunction(driver);
		getMainSignIn().click();
	}
	
	public boolean signInLinkIsDisplay() {
		 return getLinkOFSignIn().isDisplayed();
		
	}
	public void clickOnLinkOnCreateAccount() {
		getLinkOfCreateAccount().click();
	}
	public WebElement getDisplaySearchBox() {
		setDisplaySearchBox();
		return displaySearchBox;
	}

	public void setDisplaySearchBox() {
		this.displaySearchBox = driver.findElement(By.xpath("//input[@id='search']"));
	}
  public WebElement getSearchIcon() {
	  setSearchIcon();
		return searchIcon;
	}
	public void setSearchIcon() {
		this.searchIcon = driver.findElement(By.xpath("//button[@type='submit']"));
	}
	 public WebElement getCartIcon() {
		 setCartIcon();
		return cartIcon;
	}
	public void setCartIcon() {
		this.cartIcon = driver.findElement(By.xpath("//a[@href='/cart?prehydrateClick=true']"));
	}
	public WebElement getDealsLink() {
		setDealsLink();
		return dealsLink;
	}
	public void setDealsLink() {
		this.dealsLink =driver.findElement(By.xpath("//a[text()='Deals']"));
	}
	public WebElement getCategoryLink() {
		 setCategoryLink();
		return categoryLink;
	}
	public void setCategoryLink() {
		this.categoryLink =driver.findElement(By.xpath("//a[text()='Categories']"));
	}
	public WebElement getWhatsNewLink() {
		setWhatsNewLink();
		return whatsNewLink;
	}
	public void setWhatsNewLink() {
		this.whatsNewLink =driver.findElement(By.xpath("//a[text()='What’s New']"));
	}
	public WebElement getPickUpAndDeliveryLin() {
		setPickUpAndDeliveryLin();
		return pickUpAndDeliveryLin;
	}
	public void setPickUpAndDeliveryLin() {
		this.pickUpAndDeliveryLin = driver.findElement(By.xpath("//a[text()='Pickup & Delivery']"));;
	}
	public WebElement getFatherDayGiftImage() {
		setFatherDayGiftImage();
		return fatherDayGiftImage;
	}
	public void setFatherDayGiftImage() {
		this.fatherDayGiftImage =driver.findElement(By.xpath("//img[@alt='Best Dad Ever']"));
	}
	public WebElement getDisplayNameHomePage() {
		setDisplayNameHomePage();
		return displayNameHomePage;
	}
	public void setDisplayNameHomePage() {
		this.displayNameHomePage =driver.findElement(By.className("styles__PrimaryHeaderLink-sc-srf2ow-1 styles__StyledLinkNamedIcon-sc-u2k6h-1 cUkGlu jyvqJn"));
	}
	public WebElement getSearchTitleHeading() {
		setSearchTitleHeading();
		return searchTitleHeading;
	}
	public void setSearchTitleHeading() {
		this.searchTitleHeading =driver.findElement(By.xpath("//h3[text()='Trending searches']"));
	}
	public WebElement getTargetLogo() {
		 setTargetLogo();
		return targetLogo;
	}
	public void setTargetLogo() {
		this.targetLogo =driver.findElement(By.xpath("//a//span[@data-icon-name='LogoBullseyeRed' and @class='styles__IconWrapper-sc-5okyqk-0 eTnqEK']"));
	}
	public void clickOnFatherDayGiftImage() {
		Utility.clickElementByJs(driver, getFatherDayGiftImage());
	}
	public void clickOnWhatNewLink_TargetHome() {
		getWhatsNewLink().click();
	}
	public boolean displayWhatNewLink_TargetHome() {
		return getWhatsNewLink().isDisplayed();
	}
	
	public void clickOnPickupAndDeliveryLink_TargetHome() {
		getPickUpAndDeliveryLin().click();
	}
	public boolean displayPickupAndDeliveryLin_TargetHome() {
		return getPickUpAndDeliveryLin().isDisplayed();
	}
	public boolean displayCategoryLink_TargetHome() {
		return getCategoryLink().isDisplayed();
	}
	public void clickOnCategoryLink_TargetHome() {
		 getCategoryLink().click();
	}
	public void clickOnCartIcon_TargetHome() {
		getCartIcon().click();
	}
	public boolean displayCartIcon_TargetHomePage() {
		return getCartIcon().isDisplayed();
	}
	public boolean displaySearchIconOnSearchBox() {
		 return getSearchIcon().isDisplayed();
	 }
	 public void clickSearchBox() {
		 getDisplaySearchBox().click();
	 }
	
   public void setInputTextInSearchBox(String textToSearch) {
	  getDisplaySearchBox().sendKeys(textToSearch);
	  
  }
   public void clickOnDealsLink_TargetHome() {
	   getDealsLink().click();
   }
   public boolean displayDealsLink_TargetHome() {
	  return getDealsLink().isDisplayed();

   }
   public List<String>  getSearchList_TargetHome() {
	   Utility.implicitWaitFunction(driver);
	   ArrayList<String> searchArray=new ArrayList<String>();
	   List<WebElement> searchList=	driver.findElements(By.xpath("//ul//li[@class='styles__LiWithBorder-sc-1j0iz5j-0 kAPCPA']//a"));
//		System.out.println("Size of The Search List is "+ searchList.size());
		Iterator<WebElement> itrList = searchList.iterator();
		while(itrList.hasNext()) {
			WebElement elm=itrList.next();
			searchArray.add(elm.getText());
//			System.out.println(elm.getText()+" - "+elm.getAttribute("href"));
			}
		return searchArray;
		}
  
   
   
}
