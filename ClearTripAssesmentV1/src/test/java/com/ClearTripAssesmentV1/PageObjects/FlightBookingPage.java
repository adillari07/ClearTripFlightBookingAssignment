package com.ClearTripAssesmentV1.PageObjects;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightBookingPage {

	WebDriver ldriver;
	String exp_month = "August 2021";
	String exp_date = "22";

	public FlightBookingPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath  = "//*[text()='Round trip']")
	WebElement roundTripSelection;
	
	public void clickOnRoundTrip()//logic to select and click on roundTrip
	{
		roundTripSelection.click(); //clicking on roundTrip
	}
	
	@FindBy(xpath  = "//h4[contains(.,'From')]//following-sibling::div//input[@type='text']")
	WebElement fromtag;
	
	
	public void clearTextOfFromTag() {
		fromtag.clear();// clearing existing text if any in From option			
	}
	
	public void inputOfFromTag() {
		fromtag.sendKeys("Mumbai");
	}
	
	@FindBy(xpath  = "//li//p[contains(text(),'Mumbai')]")
	WebElement selectMumbai;
	
	public void clickonMumbai() {
		selectMumbai.click();	
	}
	
	@FindBy(xpath  = "//h4[contains(.,'To')]//following-sibling::div//input[@type='text']")
	WebElement totag;
	
	
	public void clearTextOfToTag() {
		totag.clear();// clearing existing text if any in To option			
	}
	
	public void inputOfToTag() {
		totag.sendKeys("Delhi");
	}
	
	@FindBy(xpath  = "//li//p[contains(text(),'Delhi')]")
	WebElement selectDelhi;
	
	public void clickonDelhi() {
		selectDelhi.click();	
	}
	
	@FindBy(xpath  = "//*[@class='row pl-4 pr-4 p-relative']//button[1]")
	WebElement fromDate;
	
	@FindBy(xpath  = "//*[@class='row pl-4 pr-4 p-relative']//button[2]")
	WebElement toDate;
	
	@FindBy(xpath  = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[5]/div[5]/div[1]/div[1]")
	WebElement departureDate;
	
	@FindBy(xpath  = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[5]/div[7]/div[1]/div[1]")
	WebElement returnDate;
	
	public void clickOnDepartOn() {
		fromDate.click();	
		departureDate.click();
		departureDate.click();	
	}

	public void clickOnReturnOn() {
		toDate.click();	
		returnDate.click();
	}

	@FindBy(xpath  = "//h4[contains(.,'Adults')]//following-sibling::select//option[contains(text(),'2')]")
	WebElement selectAdults;
	
	@FindBy(xpath  = "//h4[contains(.,'Children')]//following-sibling::select//option[contains(text(),'1')]")
	WebElement selectChild;
	
	@FindBy(xpath  = "//div[@class='col flex flex-middle']//button[text()='Search flights']")
	WebElement clickOnSearchFlights;
	
	public void selectAdults() {
		selectAdults.click();	
	}
	
	public void selectChild() {
		selectChild.click();	
	}
	
	public void clickOnSearchFlights() {
		clickOnSearchFlights.click();
		//Get handles of the windows
        String mainWindowHandle = ldriver.getWindowHandle();
        Set<String> allWindowHandles = ldriver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                	ldriver.switchTo().window(ChildWindow);
            }
        }
			
	}

}
