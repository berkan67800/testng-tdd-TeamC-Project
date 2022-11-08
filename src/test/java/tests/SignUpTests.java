package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;
import utils.SeleniumUtils;

public class SignUpTests extends TestBase{


    @Test (groups = "smoke")
    public void signUpPositive(){


        SignUpPage signUpPage = new SignUpPage();

        signUpPage.signUpPageLink.click();
        signUpPage.enterBasicInfoRandom();
        signUpPage.enterContactInfoRandom();
        signUpPage.enterLoginInfoRandom();

        SeleniumUtils.waitFor(1);
        Assert.assertTrue(driver.getTitle().equals("Personal Details : Delta Air Lines"));


    }


}
