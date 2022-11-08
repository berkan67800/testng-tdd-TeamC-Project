package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.HomePage;
import utils.ConfigReader;
import utils.SeleniumUtils;

public class ResetPasswordTest extends TestBase{

    @Test
    public void resetPassword(){

        HomePage homePage = new HomePage();
        homePage.loginWindowButton.click();
        homePage.forgotPasswordLink.click();
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
        forgotPasswordPage.userNameField.sendKeys(ConfigReader.getProperty("username"));
        forgotPasswordPage.continueButton.click();
        Assert.assertTrue(SeleniumUtils.elementExists(forgotPasswordPage.header,0));

    }
    @Test
    public void resetPasswordWithNoEntry(){

        HomePage homePage = new HomePage();
        homePage.loginWindowButton.click();
        homePage.forgotPasswordLink.click();
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
        forgotPasswordPage.userNameField.sendKeys("");
        forgotPasswordPage.continueButton.click();
        Assert.assertTrue(forgotPasswordPage.errorMessage.isDisplayed());
    }
}
