package tests;

import org.openqa.selenium.By;
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

            Thread.sleep(200);

            Set<String> allWindows = driver.getWindowHandles();
               for (String currentWindow: allWindows){
                    driver.switchTo().window(currentWindow);

          }     Thread.sleep(200);

            notificationTestElementsPage.collapsableText.click();

            SeleniumUtils.jsClick(notificationTestElementsPage.firstOption);
            SeleniumUtils.waitFor(3);

            Assert.assertEquals(driver.getCurrentUrl(), "https://www.delta.com/us/en/travel-planning-center/travel-planning-overview");

             SeleniumUtils.scrollToElement(notificationTestElementsPage.reconnetJojTravel);
             SeleniumUtils.waitFor(3);

             String reconnectExpectedText = "Reconnect With the Joy of Travel";
             WebElement reconnectText = driver.findElement(By.xpath("//h2[normalize-space()='Reconnect With the Joy of Travel']"));
             if (reconnectText.getText().equals(reconnectExpectedText)){
                 System.out.println("First hyper Link is clickable");

            notificationTestElementsPage.feedbackYesButton.click();
            SeleniumUtils.waitFor(3);

            Assert.assertTrue(notificationTestElementsPage.thankYouForFeedbackMessage.isDisplayed());
             }

        }



    }
