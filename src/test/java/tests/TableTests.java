package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaggagePage;
import pages.ChangeOrCancelPage;
import pages.HomePage;
import pages.SpecialItemPage;
import utils.SeleniumUtils;

import java.util.List;

public class TableTests extends TestBase {

    @Test
    public void checkHeaderTexts(){

        logger.assignAuthor("Berkan");
        logger.info("Checking 'Change Your Flight' table headers");

        HomePage homePage = new HomePage();
        homePage.needHelpLink.click();
        homePage.refundHelpLink.click();

        ChangeOrCancelPage changeOrCancelPage = new ChangeOrCancelPage();
        changeOrCancelPage.overviewLink.click();

        List<String> headers = SeleniumUtils.getElementsText(changeOrCancelPage.tableHeaders);

        Assert.assertEquals(headers,changeOrCancelPage.tableOneHeaders);




    }




}
