package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpPage;
import utils.CSVReader;
import utils.Driver;
import utils.SeleniumUtils;

public class SignUpTests extends TestBase{


    @Test
    public void signUpPositive(){

        HomePage homePage = new HomePage();
        SeleniumUtils.jsClick(homePage.signUpPageLink);
        SignUpPage signUpPage = new SignUpPage();


        signUpPage.enterBasicInfoRandom();
        signUpPage.enterContactInfoRandom();
        signUpPage.enterLoginInfoRandom();

        SeleniumUtils.waitFor(1);
        Assert.assertTrue(driver.getTitle().equals("Personal Details : Delta Air Lines"));


    }

    @Test(dataProvider = "info")
    public void signUpPositiveDataFromCSVFile(String firstName,String lastName,String date,String gender,String address,String city,String state,String postalCode,String phone, String email,String username,String password,String q1,String q2){

        logger.assignAuthor("Berkan");
        logger.info("Creating a new account by using CSV file");

        HomePage homePage = new HomePage();
        SeleniumUtils.jsClick(homePage.signUpPageLink);

        SignUpPage signUpPage = new SignUpPage();

        signUpPage.enterBasicInfoCSVFile(firstName,lastName,date,gender);
        //signUpPage.enterContactInfoCSVFile(address,city,state,postalCode,phone,email);
        signUpPage.enterContactInfoRandom();
        //signUpPage.enterLoginInfoCSVFile(username,password,q1,q2);
        signUpPage.enterLoginInfoRandom();


        SeleniumUtils.waitFor(1);
        Assert.assertTrue(driver.getTitle().equals("Personal Details : Delta Air Lines"));


    }





    @DataProvider(name = "info")
    public Object[][] getData(){
        return CSVReader.readFromCSV("src/test/resources/SignUpData.csv");
    }





}
