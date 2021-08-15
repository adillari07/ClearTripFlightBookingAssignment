package com.ClearTripAssesmentV1.PageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightSearchPage {

	WebDriver ldriver;

    public FlightSearchPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath  = "//*[@class='flex flex-middle flex-1 flex-end']//Button")
	WebElement flightBookButton;
	
	public void clickOnBookButton()
	{
		flightBookButton.click(); //clicking on Book Button
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