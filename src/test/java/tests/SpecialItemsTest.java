package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaggagePage;
import pages.HomePage;
import pages.SpecialItemPage;
import utils.SeleniumUtils;

public class SpecialItemsTest extends TestBase {


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
    public void checkFragileAndBulkyItems() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.travelInfo_Link.click();
        homePage.Baggage_Link.click();
        BaggagePage baggagePage = new BaggagePage();
        Thread.sleep(300);
        SeleniumUtils.jsClick(baggagePage.specialItems);
        SpecialItemPage specialItemPage = new SpecialItemPage();
        specialItemPage.fragileAndBulkyItems.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.delta.com/us/en/baggage/special-items/fragile-bulky-other-items");

    }

    @Test
    public void checkMusicalInstruments() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.travelInfo_Link.click();
        homePage.Baggage_Link.click();
        BaggagePage baggagePage = new BaggagePage();
        Thread.sleep(300);
        SeleniumUtils.jsClick(baggagePage.specialItems);
        SpecialItemPage specialItemPage = new SpecialItemPage();
        specialItemPage.musicalInstruments.click();
       Assert.assertTrue(driver.getTitle().contains("Musical Instruments"));


    }
}