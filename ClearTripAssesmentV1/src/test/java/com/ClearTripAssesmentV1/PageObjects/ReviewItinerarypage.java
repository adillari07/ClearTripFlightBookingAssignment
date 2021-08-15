package com.ClearTripAssesmentV1.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ReviewItinerarypage {

	WebDriver ldriver;

    public ReviewItinerarypage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath  = "//h2[contains(text(),'Review your itinerary')]")
	WebElement reviewIternity;
	
	@FindBy(xpath  = "//h3[@class='fs-4 c-neutral-900 fw-400']")
	WebElement standardFare;
	
	@FindBy(xpath  = "//h3[contains(.,'Protect your trip with travel insurance')]//ancestor::div[@class='flex flex-middle']//following-sibling::div//button")
	WebElement addInsuranceButton;
	
	@FindBy(xpath  = "//*[@class='fs-4' and contains(text(),'Total price')]//following-sibling::p")
	WebElement totalPriceWithInsurance;
	
	@FindBy(xpath  = "//h3[@class='fs-4 c-neutral-900 fw-400']/ancestor::div[@class='flex flex-middle']/following-sibling::div//h3")
	WebElement standardFareAmount;
	
	public void validateReviewIternityPage()
	{
		String gettext = reviewIternity.getText();
		Assert.assertEquals(gettext, "Review your itinerary");
	}
	
	public void clickOnStandardFare()
	{
		standardFare.click();
	}
	
	public void addInsurance()
	{
		JavascriptExecutor executor = (JavascriptExecutor)ldriver;
		executor.executeScript("arguments[0].click();", addInsuranceButton);
		System.out.println(standardFareAmount.getText());
		System.out.println(totalPriceWithInsurance.getText());
	}
	

	
}
