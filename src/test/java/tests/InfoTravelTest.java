package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.InfoTravel;
import utils.SeleniumUtils;

public class InfoTravelTest extends TestBase {

    @Test
    public void navigateToTripProtection() throws InterruptedException {


        InfoTravel infoTravel=new InfoTravel();
        infoTravel.travelInfo.click();
        infoTravel.trip_Protection.click();
        SeleniumUtils.waitFor(1);
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Delta Air Lines | Flights & Plane Tickets + Hotels & Rental Cars"));

    }
}
