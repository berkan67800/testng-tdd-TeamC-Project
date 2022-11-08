package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.ConfigReader;
import utils.SeleniumUtils;

public class BaggageTest extends TestBase{

    @Test
    public void navigateToBaggagePage() throws InterruptedException {

      HomePage homePage = new HomePage();
      homePage.travelInfo_Link.click();
      Thread.sleep(300);
      homePage.baggage_Link.click();
      Assert.assertTrue(driver.getTitle().equals("Baggage Policy and Fees | Delta Air Lines"));

    }

    @Test
    public void checkedBaggageFee() throws InterruptedException {

        HomePage homePage = new HomePage();
        SeleniumUtils.waitFor(1);
        homePage.travelInfo_Link.click();
        homePage.baggage_Link.click();
        BaggagePage baggagePage = new BaggagePage();
        Thread.sleep(300);
        SeleniumUtils.jsClick(baggagePage.trackingCheckedBaggage); // JavaScript executor ornegi
        Assert.assertTrue(driver.getTitle().equals("Track Your Baggage | Delta Air Lines"));

    }
   @Test
   public void checkBaggageStatusNoEntry() throws InterruptedException {
       HomePage homePage = new HomePage();
       SeleniumUtils.waitFor(1);
       homePage.travelInfo_Link.click();
       homePage.baggage_Link.click();
       BaggagePage baggagePage = new BaggagePage();
       Thread.sleep(300);
       SeleniumUtils.jsClick(baggagePage.trackingCheckedBaggage);
       TrackCheckedBaggagePage trackCheckedBaggagePage = new TrackCheckedBaggagePage();
       trackCheckedBaggagePage.checkBagStatusButton.click();
       Assert.assertTrue(trackCheckedBaggagePage.errorMessage.isDisplayed());
    }



    @Test
    public void checkBagGuaranteeTitle()  {
            HomePage homePage = new HomePage();
            homePage.travelInfo_Link.click();
            homePage.baggage_Link.click();
            BaggagePage baggagePage = new BaggagePage();
             SeleniumUtils.jsClick(baggagePage.trackingCheckedBaggage);
            Assert.assertTrue(driver.getTitle().contains("Track Your Baggage | Delta Air Lines"));

        }

        @Test
    public void checkActiveMilitaryOnButton() throws InterruptedException {
            HomePage homePage = new HomePage();
            homePage.travelInfo_Link.click();
            homePage.baggage_Link.click();
            BaggagePage baggagePage = new BaggagePage();
            Thread.sleep(300);
            SeleniumUtils.jsClick(baggagePage.activeMilitaryDutyInfo);
            SeleniumUtils.jsClick(baggagePage.militaryOkButton);
            Assert.assertTrue(baggagePage.bagForActiveMilitaryHeader.isDisplayed());

        }

    @Test
    public void checkCalculateBagWithoutTrip() throws InterruptedException {

        HomePage homePage = new HomePage();
        SeleniumUtils.waitFor(1);
        homePage.travelInfo_Link.click();
        homePage.baggage_Link.click();
        BaggagePage baggagePage = new BaggagePage();
        Thread.sleep(500);
        baggagePage.origin.sendKeys(ConfigReader.getProperty("from"),Keys.TAB);
        baggagePage.destination.sendKeys(ConfigReader.getProperty("to"), Keys.TAB);
        baggagePage.onBoardExperience.sendKeys(Keys.ARROW_DOWN, Keys.TAB);
        baggagePage.purchaseDate.click();
        baggagePage.purchaseDateDay.click();
        baggagePage.purchaseDateDoneButton.click();
        baggagePage.travelDate.click();
        baggagePage.travelDateNextMonth.click();
        baggagePage.travelDateDay.click();
        baggagePage.travelDateDoneButton.click();
        baggagePage.numOfPassenger.sendKeys(Keys.ARROW_DOWN, Keys.TAB);
        baggagePage.medallionStatus.sendKeys(Keys.TAB);
        baggagePage.skyMiles.sendKeys(Keys.ARROW_DOWN, Keys.TAB);
        SeleniumUtils.jsClick(baggagePage.calculateEstimate);
        String airportInfo = baggagePage.calculatorPopUpAirport.getText().replaceAll("[^a-zA-Z]", "");
        Assert.assertTrue(airportInfo.equals(ConfigReader.getProperty("from")+ConfigReader.getProperty("to")));

    }


            @Test
    public void checkExcessAndOverweightBag() throws InterruptedException {

                HomePage homePage = new HomePage();
                SeleniumUtils.waitFor(1);
                homePage.travelInfo_Link.click();
                homePage.baggage_Link.click();
                BaggagePage baggagePage = new BaggagePage();
                Thread.sleep(500);
                SeleniumUtils.jsClick(baggagePage.excessAndOverweightBag);
                Assert.assertEquals(driver.getCurrentUrl(),"https://www.delta.com/us/en/baggage/checked-baggage/excess-overweight-baggage");

    }
}
