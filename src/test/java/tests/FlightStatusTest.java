package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FlightStatusPage;
import pages.HomePage;
import utils.ConfigReader;
import utils.SeleniumUtils;

public class FlightStatusTest extends TestBase {


    @Test
    public void viewFlightStatusNoEntry() {

        HomePage homePage = new HomePage();
        homePage.travelInfo_Link.click();
        homePage.flightSchedulesLink.click();

        FlightStatusPage flightStatusPage = new FlightStatusPage();
        flightStatusPage.viewFlightStatus.click();

        Assert.assertTrue(flightStatusPage.correctionBar.isDisplayed());


    }

    @Test
    public void viewFlightStatusPositive() {

        HomePage homePage = new HomePage();
        homePage.travelInfo_Link.click();
        homePage.flightSchedulesLink.click();

        FlightStatusPage flightStatusPage = new FlightStatusPage();
        flightStatusPage.fromAirport.sendKeys(ConfigReader.getProperty("from"));
        flightStatusPage.toAirport.sendKeys(ConfigReader.getProperty("to"));
        flightStatusPage.viewFlightStatus.click();

        SeleniumUtils.waitFor(2);

        Assert.assertTrue(driver.getTitle().equals("Flight Schedules : Delta Air Lines"));


    }

    @Test
    public void checkAirportTitles() {

        HomePage homePage = new HomePage();
        homePage.travelInfo_Link.click();
        homePage.flightSchedulesLink.click();

        FlightStatusPage flightStatusPage = new FlightStatusPage();
        flightStatusPage.fromAirport.sendKeys(ConfigReader.getProperty("from"));
        flightStatusPage.toAirport.sendKeys(ConfigReader.getProperty("to"));
        flightStatusPage.viewFlightStatus.click();

        Assert.assertTrue(flightStatusPage.airportTitlesInList(ConfigReader.getProperty("from"), ConfigReader.getProperty("to")));

    }





    }




