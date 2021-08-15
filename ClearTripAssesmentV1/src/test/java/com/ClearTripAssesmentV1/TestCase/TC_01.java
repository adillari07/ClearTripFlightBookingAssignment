package com.ClearTripAssesmentV1.TestCase;
import org.testng.annotations.Test;

import com.ClearTripAssesmentV1.PageObjects.FlightBookingPage;
import com.ClearTripAssesmentV1.PageObjects.FlightSearchPage;
import com.ClearTripAssesmentV1.PageObjects.ReviewItinerarypage;

public class TC_01 extends BaseClass 
{


@Test
public void roundTripBookingSearchTest() throws InterruptedException
{
	driver.manage().window().maximize();
	driver.get(baseUrl);
	logger.info("ClearTrip URL launched and Window is maximized...");
	logger.info("<<<<<<<<<<<<<TC_01_Test Case for Flight Booking for a RoundTrip with 2 Adults and 1 Child>>>>>>>>>>>>>>>>>");
	FlightBookingPage flightBooking = new FlightBookingPage(driver);
	flightBooking.clickOnRoundTrip();	
	logger.info("Clicked and selected RoundTrip...");
	flightBooking.clearTextOfFromTag();	
	logger.info("cleared existing text...");
	flightBooking.inputOfFromTag();	
	logger.info("Provided input as Mumbai...");
	flightBooking.clickonMumbai();	
	logger.info("Clicked and Selected Mumbai from the option...");
	flightBooking.clearTextOfToTag();	
	logger.info("cleared existing text...");
	flightBooking.inputOfToTag();	
	logger.info("Provided input as Delhi...");
	flightBooking.clickonDelhi();	
	logger.info("Clicked and Selected Delhi from the option...");
	flightBooking.clickOnDepartOn();
	logger.info("Clicked and Selected Depart On date...");
	flightBooking.clickOnReturnOn();
	logger.info("Clicked and Selected Return On date...");
	flightBooking.selectAdults();	
	logger.info("Clicked On drop down and selected 2 Adults...");
	flightBooking.selectChild();	
	logger.info("Clicked On drop down and selected 1 child...");
	flightBooking.clickOnSearchFlights();	
	Thread.sleep(1000);
	logger.info("Clicked On Search Flights...");
	logger.info("<<<<<<<<<<<<<<<TC_01 COMPLETED HERE FOR BOOKING OF A ROUND TRIP AND CLICKED ON SEARCH FLIGHTS BUTTON>>>>>>>>>>>>>>>>>>>");
	logger.info("<<<<<<<<<<<<<TC_02_Test Case for Flight Search and Booking Page>>>>>>>>>>>>>>>>>");
	logger.info("Flight Search is loading...");
	logger.info("Flight Search is loaded...");
	logger.info("Flight Search Results Displayed...");
	Thread.sleep(10000);
	FlightSearchPage flightSearch = new FlightSearchPage(driver);
	flightSearch.clickOnBookButton();
	Thread.sleep(10000);
	logger.info("Clicked on Book Button...");
	logger.info("A New Window, Review your itinerary will open...");
	logger.info("<<<<<<<<<<<<<TC_02_Completed Here>>>>>>>>>>>>>>>>>");
	logger.info("<<<<<<<<<<<<<TC_03_Started...Here we are Review the itinerary>>>>>>>>>>>>>>>>>");
	ReviewItinerarypage reviewItinerarypage = new ReviewItinerarypage(driver);
	reviewItinerarypage.validateReviewIternityPage();
	logger.info("Iternity Reviewed...");
	reviewItinerarypage.clickOnStandardFare();
	logger.info("Clicked and Selected Standard fare...");
	reviewItinerarypage.addInsurance();
	logger.info("Clicked and added Insurance...");
	logger.info("Total Price after adding Insurance is greater than Standard Price...");
	
}
	
}
