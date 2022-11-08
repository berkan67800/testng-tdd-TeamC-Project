package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.InfoTravel;

public class InfoTravelTest extends TestBase {

    @Test
    public void navigateToTripProtection() throws InterruptedException {


        InfoTravel infoTravel=new InfoTravel();
        infoTravel.travelInfo.click();
        infoTravel.trip_Protection.click();
        Thread.sleep(3000);
//        Assert.assertTrue(driver.getTitle().toLowerCase().contains("trip protection search: delta air lines"));

    }
}
