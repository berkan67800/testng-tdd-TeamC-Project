package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FirstClassFlight;
import utils.SeleniumUtils;


public class FirstClassTest extends TestBase{


    @Test
    public void navigateToFirstClassFlight() throws InterruptedException {

        FirstClassFlight firstClassFlight = new FirstClassFlight();
        firstClassFlight.travelInfo.click();
        firstClassFlight.firstClass.click();
        Thread.sleep(300);
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("first class"));



    }

    @Test
    public void viewFlightFirstClass() {


        FirstClassFlight firstClassFlight=new FirstClassFlight();
        firstClassFlight.travelInfo.click();
        firstClassFlight.firstClass.click();
        firstClassFlight.bookNow.click();
        firstClassFlight.submitButton.click();

        Assert.assertTrue(firstClassFlight.correctionBar.isDisplayed());

    }

//    @Test
//    public void bookFlightFirstClass() {
//
//
//        FirstClassFlight firstClassFlight=new FirstClassFlight();
//        firstClassFlight.travelInfo.click();
//        firstClassFlight.firstClass.click();
//        firstClassFlight.bookNow.click();
//        firstClassFlight.fromAirportName.sendKeys("DCA", Keys.ARROW_DOWN,Keys.ENTER);
//
//        SeleniumUtils.waitFor(5);
//        firstClassFlight.toAirportName.click();
//        firstClassFlight.toAirportName.sendKeys("JFK",Keys.ARROW_DOWN, Keys.ENTER);
//
//        SeleniumUtils.waitFor(5);






    }




