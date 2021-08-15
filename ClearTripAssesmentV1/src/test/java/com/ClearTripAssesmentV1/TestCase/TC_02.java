package com.ClearTripAssesmentV1.TestCase;
import org.testng.annotations.Test;

import com.ClearTripAssesmentV1.PageObjects.FlightBookingPage;
import com.ClearTripAssesmentV1.PageObjects.FlightSearchPage;

public class TC_02 extends BaseClass 
{

// THIS TC_01 TEST CLASS IS RELATED TO BOOKING A ROUND TRIP AND CLICK ON SEARCH FLIGHTS....	
	
@Test
public void roundTripBookingSearchTest()
{
	logger.info("<<<<<<<<<<<<<TC_02_Test Case for Flight Search and Booking Page>>>>>>>>>>>>>>>>>");
	logger.info("Flight Search is loading...");
	logger.info("Flight Search is loaded...");
	logger.info("Flight Search Results Displayed...");
	FlightSearchPage flightSearch = new FlightSearchPage(driver);
	flightSearch.clickOnBookButton();
	logger.info("Clicked on Book Button...");
	logger.info("A New Window, Review your itinerary will open...");
	logger.info("<<<<<<<<<<<<<TC_02_Completed Here>>>>>>>>>>>>>>>>>");
}
	
}
