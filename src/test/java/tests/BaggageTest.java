package tests;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.Alert;
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
      homePage.Baggage_Link.click();
      Assert.assertTrue(driver.getTitle().equals("Baggage Policy and Fees | Delta Air Lines"));

    }

    @Test
    public void checkedBaggageFee() throws InterruptedException {

        HomePage homePage = new HomePage();
        homePage.travelInfo_Link.click();
        homePage.Baggage_Link.click();
        BaggagePage baggagePage = new BaggagePage();
        Thread.sleep(300);
        SeleniumUtils.jsClick(baggagePage.trackingCheckedBaggage); // JavaScript executor ornegi
        Assert.assertTrue(driver.getTitle().equals("Track Your Baggage | Delta Air Lines"));

    }
   @Test
   public void checkBaggageStatusNoEntry() throws InterruptedException {
       HomePage homePage = new HomePage();
       homePage.travelInfo_Link.click();
       homePage.Baggage_Link.click();
       BaggagePage baggagePage = new BaggagePage();
       Thread.sleep(300);
       SeleniumUtils.jsClick(baggagePage.trackingCheckedBaggage);
       TrackCheckedBaggagePage trackCheckedBaggagePage = new TrackCheckedBaggagePage();
       trackCheckedBaggagePage.checkBagStatusButton.click();
       Assert.assertTrue(trackCheckedBaggagePage.errorMessage.isDisplayed());
    }


    @Test
    public void checkSpecialItems() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.travelInfo_Link.click();
        homePage.Baggage_Link.click();
        BaggagePage baggagePage = new BaggagePage();
        Thread.sleep(300);
        SeleniumUtils.jsClick(baggagePage.specialItems);
        SpecialItemPage specialItemPage = new SpecialItemPage();
        specialItemPage.childrenInfantItems.click();
        Assert.assertTrue(driver.getTitle().equals("Children & Infant Items"));
    }

    @Test
    public void checkBagGuaranteeWarningMessage() throws InterruptedException {
            HomePage homePage = new HomePage();
            homePage.travelInfo_Link.click();
            homePage.Baggage_Link.click();
            BaggagePage baggagePage = new BaggagePage();
            Thread.sleep(300);
            SeleniumUtils.jsClick(baggagePage.trackingCheckedBaggage);
            TrackCheckedBaggagePage trackCheckedBaggagePage = new TrackCheckedBaggagePage();
            trackCheckedBaggagePage.BagGuarantee.click();
            BagsOnTimePage bagsOnTimePage = new BagsOnTimePage();
            bagsOnTimePage.submitButton.submit();
            Assert.assertTrue(bagsOnTimePage.warningMessage.isDisplayed());


        }

        @Test
    public void checkActiveMilitaryOnButton() throws InterruptedException {
            HomePage homePage = new HomePage();
            homePage.travelInfo_Link.click();
            SeleniumUtils.waitFor(1);
            homePage.Baggage_Link.click();
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
            homePage.Baggage_Link.click();
            BaggagePage baggagePage = new BaggagePage();
            Thread.sleep(500);
            baggagePage.origin.sendKeys(ConfigReader.getProperty("from"),Keys.TAB);
            baggagePage.destination.sendKeys(ConfigReader.getProperty("to"), Keys.TAB);
            baggagePage.onBoardExperience.sendKeys(Keys.ARROW_DOWN, Keys.TAB);
//            baggagePage.purchaseDate.sendKeys(Keys.ARROW_DOWN, Keys.TAB);
//            baggagePage.travelDate.sendKeys(Keys.ARROW_DOWN, Keys.TAB);
            baggagePage.numOfPassenger.sendKeys(Keys.ARROW_DOWN, Keys.TAB);
            baggagePage.medallionStatus.sendKeys(Keys.TAB);
            baggagePage.skyMiles.sendKeys(Keys.ARROW_DOWN, Keys.TAB);
            SeleniumUtils.waitFor(5);
            SeleniumUtils.jsClick(baggagePage.calculateEstimate);
            SeleniumUtils.waitFor(5);


            
        }

}