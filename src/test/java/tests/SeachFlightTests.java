package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.CSVReader;
import utils.SeleniumUtils;

public class SeachFlightTests extends TestBase{

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
         SeleniumUtils.waitFor(1);
         homePage.selectDropDownItem("One Way", homePage.tripTypeDropDown,  homePage.tripTypes);
         homePage.selectDepartDate();
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
        homePage.selectDepartDate();
        homePage.selectDropDownItem("2",homePage.passengersDropDown,homePage.passengerAmount);
        SeleniumUtils.jsClick(homePage.shopWithMiles);
        SeleniumUtils.jsClick(homePage.flightSearchButton);
        SeleniumUtils.waitFor(2);

        Assert.assertTrue(driver.getCurrentUrl().contains("/flight-search/search-results"));

    }

    @Test (dataProvider = "flightSearchData")
    public void seachFlightCSVFile(String from,String to,String type,String passenger){

        logger.assignAuthor("Berkan");
        logger.info("Seaching flights by using CSV file");
        logger.info("DATA:["+from+","+to+","+type+","+passenger+"]");

        HomePage homePage = new HomePage();

        homePage.selectFromTo(from,to);
        SeleniumUtils.waitFor(1);
        homePage.selectDropDownItem(type, homePage.tripTypeDropDown,  homePage.tripTypes);
        homePage.selectDepartDate();
        if (type.equals("Round Trip")) homePage.selectReturnDate();
        homePage.selectDropDownItem(passenger,homePage.passengersDropDown,homePage.passengerAmount);
        SeleniumUtils.jsClick(homePage.flightSearchButton);
        SeleniumUtils.waitFor(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("/flight-search/search-results"));

    }

    @DataProvider(name = "flightSearchData")
    public Object[][] getData(){
        return CSVReader.readFromCSV("src/test/resources/Book_Flight.csv");
    }







}
