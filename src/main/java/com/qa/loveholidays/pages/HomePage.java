package com.qa.loveholidays.pages;

import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.loveholidays.base.TestBase;
import junit.framework.Assert;

public class HomePage extends TestBase{
	
	
	//PageFactory
	@FindBy(xpath = "//div[@class = 'homepage-return-to-offer__title']")
	WebElement stillinterestedinholiday;
	
	@FindBy(xpath = "//a[@class = 'homepage-return-to-offer__main__cta btn btn-success']")
	WebElement clicklatestprice;
	
	
	// Initialization
	public HomePage() {
		
		PageFactory.initElements(driver, this);		
	}
	
	//Actions
	public String getHomePageTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}
	
	public boolean getReturnToOfferTitle() {
		
		return stillinterestedinholiday.getText().contains(prop.getProperty("return_to_offer_title"));
		
	}
	
	public boolean validateClickLatestPriceIsDisplayed() {
		
		return clicklatestprice.isDisplayed();
	}
	
	public OfferSummaryPage clickLatestPrice() {
		
		clicklatestprice.click();
		return new OfferSummaryPage();
	}
	
	public void switchWindow() {
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		Assert.assertTrue("Only one tab opened.", tabs.size() > 1);
		driver.switchTo().window(tabs.get(1));
		
	}

	
}
