package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.ConfigReader;
import utils.SeleniumUtils;

public class LoginTests extends TestBase{

    @Test (groups = "smoke")
    public void logInPositive(){


        HomePage homePage = new HomePage();

        homePage.loginWindowButton.click();
        homePage.loginUserNameField.sendKeys(ConfigReader.getProperty("username"));
        SeleniumUtils.waitFor(1);
        homePage.loginLastNameField.sendKeys(ConfigReader.getProperty("lastName"));
        homePage.loginPassword.sendKeys(ConfigReader.getProperty("password"));
        homePage.loginSubmitButton.click();

        Assert.assertTrue(SeleniumUtils.elementExists(homePage.loginContainer,0));

    }

    @Test
    public void logInNoCredentials(){


        HomePage homePage = new HomePage();

        homePage.loginWindowButton.click();
        homePage.loginSubmitButton.click();

        Assert.assertTrue(homePage.loginErrorMessageBar.isDisplayed());

    }

    @Test (groups = "smoke")
    public void logInNegative(){


        HomePage homePage = new HomePage();
        Faker faker = new Faker();

        homePage.loginWindowButton.click();
        homePage.loginUserNameField.sendKeys(ConfigReader.getProperty("username"));
        SeleniumUtils.waitFor(1);
        homePage.loginLastNameField.sendKeys(faker.address().zipCode());
        homePage.loginPassword.sendKeys(ConfigReader.getProperty("password"));
        homePage.loginSubmitButton.click();

        Assert.assertTrue(homePage.loginErrorMessageBar.isDisplayed());

    }
}
