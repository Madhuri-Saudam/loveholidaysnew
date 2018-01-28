package com.qa.loveholidays.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.qa.loveholidays.base.*;
import com.qa.loveholidays.pages.*;


public class OfferSummaryPageTest extends TestBase {

	OfferSummaryPage offersummarypage;
	HomePage homepage;
	
	public OfferSummaryPageTest() {
		
		super();
	}
	
 @BeforeMethod
 public void setUp() {
	 
	 Initialization();
	 offersummarypage = new OfferSummaryPage();
	 homepage = new HomePage();
 }
	
 @Test
 public void offerSummaryPageTest() {
	 
	 		 
	 String title = offersummarypage.getOfferSummaryPageTitle();
	 Assert.assertEquals(title , "loveholidays");
	 String str = offersummarypage.getHotelBookingRef();
	 
	 Assert.assertTrue(offersummarypage.validateHomePageTabIsDisplayed());
	 
	 offersummarypage.clickHomePageTab();
	 
	 //homepage.switchWindow();
	 
	 Assert.assertTrue(homepage.getReturnToOfferTitle());
	 
	 Assert.assertTrue(homepage.validateClickLatestPriceIsDisplayed());
	 	 
	 homepage.clickLatestPrice();	 
	 String title1 = offersummarypage.getOfferSummaryPageTitle();
	 Assert.assertEquals(title1 , "loveholidays"); 
	 
	 Assert.assertEquals(offersummarypage.getHotelBookingRef(), str);
		
	 
	 
 }
 
  
 @AfterMethod
 public void tearDown() {
	 
	 driver.quit();
 }
 
	
}
