package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NotificationTestElementsPage;
import pages.HomePage;
import utils.SeleniumUtils;

import java.util.Set;

public class NotificationTest extends TestBase{


      @Test
       public void notificationButtonCheck() throws InterruptedException {

            HomePage homePage = new HomePage();
            SeleniumUtils.waitFor(1);
            homePage.notificationButton.click();
            SeleniumUtils.jsClick(homePage.viewAllButton);
            SeleniumUtils.waitFor(1);
            NotificationTestElementsPage notificationTestElementsPage = new NotificationTestElementsPage();

            Set<String> allWindows = driver.getWindowHandles();
               for (String currentWindow: allWindows){
                    driver.switchTo().window(currentWindow);
           }     Thread.sleep(200);

            notificationTestElementsPage.collapsableText.click();

            SeleniumUtils.jsClick(notificationTestElementsPage.firstOption);
            SeleniumUtils.waitFor(3);

            Assert.assertEquals(driver.getCurrentUrl(), "https://www.delta.com/us/en/travel-planning-center/travel-planning-overview");

             SeleniumUtils.scrollToElement(notificationTestElementsPage.reconnetJojTravel);

             String reconnectExpectedText = "Reconnect With the Joy of Travel";
             WebElement reconnectText = driver.findElement(By.xpath("//h2[normalize-space()='Reconnect With the Joy of Travel']"));
             if (reconnectText.getText().equals(reconnectExpectedText)){
                 System.out.println("First hyper Link is clickable");

            notificationTestElementsPage.feedbackYesButton.click();
            SeleniumUtils.waitFor(3);

            Assert.assertTrue(notificationTestElementsPage.thankYouForFeedbackMessage.isDisplayed());
             }

        }

        @Test
        public void negativeFeedbackCheck() throws InterruptedException {
          HomePage homePage = new HomePage();
            SeleniumUtils.waitFor(1);
            homePage.notificationButton.click();
            SeleniumUtils.jsClick(homePage.viewAllButton);
          NotificationTestElementsPage notificationTestElementsPage = new NotificationTestElementsPage();

        Set<String> allWindows = driver.getWindowHandles();
        for (String currentWindow: allWindows){
            driver.switchTo().window(currentWindow);

        }     Thread.sleep(200);

          notificationTestElementsPage.collapsableText.click();

          SeleniumUtils.jsClick(notificationTestElementsPage.firstOption);
          SeleniumUtils.waitFor(3);

          notificationTestElementsPage.feedbackNoButton.click();

          notificationTestElementsPage.feedbackThreeStars.click();
            //Thread.sleep(500);
            notificationTestElementsPage.selectionsButton.click();
            notificationTestElementsPage.selectionsButton.sendKeys(Keys.ARROW_DOWN);
            //Thread.sleep(500);

            notificationTestElementsPage.feedbackSubmitButton.click();
            notificationTestElementsPage.feedbackOkButton.click();

           SeleniumUtils.waitFor(5);

            Assert.assertEquals(driver.getCurrentUrl(),"https://www.delta.com/us/en/travel-planning-center/travel-planning-overview");









    }

    }
