package com.qa.loveholidays.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.loveholidays.base.TestBase;

public class OfferSummaryPage extends TestBase {
	
	TestBase testbase;
	
	//PageFactory
		@FindBy(xpath = "//a[@class = 'book-header-nav-bar__list__item__link']")
	    WebElement homepagetab;
		
		@FindBy(xpath = "//span[@class = 'book-basket__reference__number']")
		WebElement reference;
			

	// Initialisation
		public OfferSummaryPage() {
			
			PageFactory.initElements(driver, this);		
		}
		
		//Actions
		public String getOfferSummaryPageTitle() {
			
			return driver.getTitle();
		}
		
		public String getHotelBookingRef()
		{
			return reference.getText();
		}
		
		public boolean validateHomePageTabIsDisplayed() {
			
			return homepagetab.isDisplayed();
		}
		
		public HomePage clickHomePageTab() {
			
			homepagetab.click();
			return new HomePage();
			
		}
		
	
}
