package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TargetHeaderPage {
	WebDriver driver;
	WebElement targetHeader;
	WebElement btnZipCodeOnHeader;
	WebElement trackLocationIconHeader;
	WebElement textOfZipCodeHeader;
	WebElement btnWatertownStoreHeader;
	WebElement watertownStoreIconHeader;
	WebElement textOfWaterTownStoreHeader;
	WebElement registeryLinkHeader;
	WebElement weeklyAdsLinkHeader;
	WebElement redCardLinkHeader;
	WebElement targetCircleLinkHeader;
	WebElement findStoresLinkHeader;
	public TargetHeaderPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement getTargetHeader() {
		setTargetHeader();
		return targetHeader;
	}

	public void setTargetHeader() {
		this.targetHeader =driver.findElement(By.id("@web/component-header"));
	}

	public WebElement getBtnZipCodeOnHeaderr() {
		setBtnZipCodeOnHeader();
		return btnZipCodeOnHeader;
	}

	public void setBtnZipCodeOnHeader() {
		this.btnZipCodeOnHeader = driver.findElement(By.xpath("//button[@id='zip-code-id-btn']"));
	}
	
	
	
	public WebElement getTrackLocationIconHeade() {
		setTrackLocationIconHeader();
		return trackLocationIconHeader;
	}

	public void setTrackLocationIconHeader() {
		this.trackLocationIconHeader =driver.findElement(By.xpath("//span[@data-icon-name='GeneralTrackLocation']"));
	}

	public WebElement getTextOfZipCodeHeader() {
		setTextOfZipCodeHeader();
		return textOfZipCodeHeader;
	}
    
	public void setTextOfZipCodeHeader() {
//		this.textOfZipCodeHeader = driver.findElement(By.xpath("//span[@data-test='@web/ZipCodeButton/ZipCodeNumber']"));
		this.textOfZipCodeHeader = driver.findElement(By.xpath("//span[text()='44002']"));
	}

	public WebElement getBtnWatertownStoreHeader() {
		setBtnWatertownStoreHeader();
		return btnWatertownStoreHeader;
	}

	public void setBtnWatertownStoreHeader() {
		this.btnWatertownStoreHeader =driver.findElement(By.xpath("//button[@id='web-store-id-msg-btn']"));
	}
    public WebElement getWatertownStoreconHeader() {
    	setWatertownStoreconHeader();
		return watertownStoreIconHeader;
	}

	public void setWatertownStoreconHeader() {
		this.watertownStoreIconHeader =driver.findElement(By.xpath("//span[@data-icon-name='ProfileMyStore']"));
	}

	public WebElement getTextOfWaterTownStoreHeader() {
		setTextOfWaterTownStoreHeader();
		return textOfWaterTownStoreHeader;
	}
	public void setTextOfWaterTownStoreHeader() {
		this.textOfWaterTownStoreHeader = driver.findElement(By.xpath("//span[text()='Watertown']"));
	}

	public WebElement getRegisteryLinkHeader() {
		setRegisteryLinkHeader();
		return registeryLinkHeader;
	}

	public void setRegisteryLinkHeader() {
		this.registeryLinkHeader =driver.findElement(By.xpath("//a[@id='utilityNav-registries']"));
	}

	public WebElement getWeeklyAdsLinkHeader() {
		setWeeklyAdsLinkHeader();
		return weeklyAdsLinkHeader;
	}

	public void setWeeklyAdsLinkHeader() {
		this.weeklyAdsLinkHeader = driver.findElement(By.xpath("//a[@id='utilityNav-weeklyAd']"));;
	}

	public WebElement getRedCardLinkHeader() {
		setRedCardLinkHeader();
		return redCardLinkHeader;
	}

	public void setRedCardLinkHeader() {
		this.redCardLinkHeader =driver.findElement(By.xpath("//a[@id='utilityNav-redCardLI']")); 
	}

	public WebElement getTargetCircleLinkHeader() {
		setTargetCircleLinkHeader();
		return targetCircleLinkHeader;
	}

	public void setTargetCircleLinkHeader() {
		this.targetCircleLinkHeader = driver.findElement(By.xpath("//a[@id='utilityNav-circle']"));
	}

	public WebElement getFindStoresLinkHeader() {
		setFindStoresLinkHeader();
		return findStoresLinkHeader;
	}

	public void setFindStoresLinkHeader() {
		this.findStoresLinkHeader =driver.findElement(By.xpath("//a[@id='utilityNav-findStores']"));
	}

	public void clickOnRegistryLinkHeader() {
		getRegisteryLinkHeader().click();
	}
	public void clickOnWeeklyAdLinkHeader() {
		getWeeklyAdsLinkHeader().click();
	}
	public void clickOnRedCardLinkHeader() {
		getRedCardLinkHeader().click();
	}
	public void clickOnTargetCircleLinkHeader() {
		getTargetCircleLinkHeader().click();
	}
	public void clickOnFindStoresLinkHeader() {
		getFindStoresLinkHeader().click();
	}

	public void clickOnBtnWatertownStoreHeader()
    {
    	getBtnWatertownStoreHeader().click();
    }
    public void clickOnZipCode_TargetHeader() {
		getBtnZipCodeOnHeaderr().click();
	}
    

}
