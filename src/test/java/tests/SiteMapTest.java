package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SiteMapPage;
import utils.SeleniumUtils;

import java.util.Set;

public class SiteMapTest extends TestBase{


    @Test
    public void siteMapTest() throws InterruptedException {

        HomePage homePage = new HomePage();
        SeleniumUtils.jsClick(homePage.siteMapButton);
        SiteMapPage siteMapPage = new SiteMapPage();
        siteMapPage.CorporateBulkGiftCard.click();

        siteMapPage.orderNowButton.click();
        SeleniumUtils.waitFor(3);

        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("window.scrollBy(0,400)");
        SeleniumUtils.waitFor(3);

        Set<String> allWindows = driver.getWindowHandles();
        for (String currentWindow: allWindows){
            driver.switchTo().window(currentWindow);
        }
        SeleniumUtils.waitFor(3);
        js = ((JavascriptExecutor)driver);
        js.executeScript("window.scrollBy(0,400)");
        SeleniumUtils.waitFor(3);

        SeleniumUtils.jsClick(siteMapPage.getAccesButton); SeleniumUtils.waitFor(3);

        Set<String> allWindows2 = driver.getWindowHandles();
        for (String currentWindow: allWindows2){
            driver.switchTo().window(currentWindow);
        }
        Faker faker = new Faker();
        siteMapPage.registerEmailButton.sendKeys(faker.internet().emailAddress());
        siteMapPage.registerButton.click();
        js = ((JavascriptExecutor)driver);
        js.executeScript("window.scrollBy(0,700)");
        siteMapPage.cancelButton.click();
        siteMapPage.yesButton.click();
        SeleniumUtils.waitFor(3);

        Assert.assertEquals(driver.getCurrentUrl(),"https://business.giftcards.delta.com/login/login/");

    }
}
