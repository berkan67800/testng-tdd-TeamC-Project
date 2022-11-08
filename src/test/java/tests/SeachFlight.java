package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.SeleniumUtils;

public class SeachFlight extends TestBase{

    @Test
    public void seachFlightNegativeNoEntry(){

        HomePage homePage = new HomePage();

        homePage.flightSearchButton.click();
        Assert.assertTrue(homePage.searchErrorMessage.isDisplayed());
    }


     @Test
    public void seachFlightPositive(){

        HomePage homePage = new HomePage();

         homePage.selectFromTo("LAX","JFK");
         homePage.selectDropDownItem("One Way", homePage.tripTypeDropDown,  homePage.tripTypes);
         homePage.selectDate();
         homePage.selectDropDownItem("2",homePage.passengersDropDown,homePage.passengerAmount);
         SeleniumUtils.jsClick(homePage.flightSearchButton);
         SeleniumUtils.waitFor(2);
         Assert.assertTrue(driver.getCurrentUrl().contains("/flight-search/search-results"));

    }

    @Test
    public void seachFlightPositiveWithMiles(){

        HomePage homePage = new HomePage();

        homePage.selectFromTo("LAX","JFK");
        homePage.selectDropDownItem("One Way", homePage.tripTypeDropDown,  homePage.tripTypes);
        homePage.selectDate();
        homePage.selectDropDownItem("2",homePage.passengersDropDown,homePage.passengerAmount);
        SeleniumUtils.jsClick(homePage.shopWithMiles);
        SeleniumUtils.jsClick(homePage.flightSearchButton);
        SeleniumUtils.waitFor(2);

        Assert.assertTrue(driver.getCurrentUrl().contains("/flight-search/search-results"));

    }






}
