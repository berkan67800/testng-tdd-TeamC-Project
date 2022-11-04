package tests;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.SeleniumUtils;

public class BaggageTest extends TestBase{



    @Test
    public void navigateToBaggagePage() throws InterruptedException {

      HomePage homePage = new HomePage();
      homePage.travelInfo_Link.click();
      Thread.sleep(500);
      homePage.Baggage_Link.click();
      Assert.assertTrue(driver.getTitle().equals("Baggage Policy and Fees | Delta Air Lines"));

    }

    @Test
    public void checkedBaggageFee() throws InterruptedException {

        HomePage homePage = new HomePage();
        homePage.travelInfo_Link.click();
        homePage.Baggage_Link.click();
        BaggagePage baggagePage = new BaggagePage();
        Thread.sleep(500);
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
    }

