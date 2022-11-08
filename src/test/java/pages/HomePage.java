package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.SeleniumUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
        SeleniumUtils.waitFor(1);
    }



    @FindBy(xpath = "//a[@data-analytics-id='home-shop-1']")
    public WebElement vacationDeals_Link;

    @FindBy(xpath = "//a[@data-analytics-id='home-shop-2']")
    public WebElement shopHotels_Link;

     @FindBy(xpath = "//a[@data-analytics-id='home-shop-3']")
    public WebElement rentACar_Link;

    @FindBy(xpath = "//a[@data-analytics-id='home-shop-4']")
    public WebElement giftCardsLink;

    @FindBy(xpath = "//a[@data-analytics-id='home-shop-5']")
    public WebElement updatedBagTravelFees_link;

    @FindBy(linkText = "Travel Info")
    public WebElement travelInfo_Link;

    @FindBy(linkText = "Baggage")
    public WebElement Baggage_Link;

    @FindBy(linkText = "Flight Schedules")
    public WebElement flightSchedulesLink;

    @FindBy(id = "login-modal-button")
    public WebElement loginWindowButton;

    @FindBy(xpath = "//input[@aria-label='SkyMiles Number Or Username*']")
    public WebElement loginUserNameField;

    @FindBy(xpath = "//input[@aria-label='Password*']")
    public WebElement loginPassword;

    @FindBy(xpath = "//div[@class='login-button']//button[@type='submit']")
    public WebElement loginSubmitButton;

    @FindBy(xpath = "//input[@aria-label='Last Name*']")
    public WebElement loginLastNameField;

    @FindBy(xpath = "//div[@class='logged-in-container logged-in-flyout ng-star-inserted']")
    public WebElement loginContainer;

    @FindBy(xpath = "//p[@class='idp-alert-warning-message-text']")
    public WebElement loginErrorMessageBar;

    @FindBy(id = "btn-book-submit")
    public WebElement flightSearchButton;
    @FindBy(id = "correctionBar")
    public WebElement searchErrorMessage;

    @FindBy(xpath = "//a[@id='fromAirportName']//span[@class='airport-code d-block']")
    public WebElement departureField;

    @FindBy(id = "search_input")
    public WebElement searchAirport;

    @FindBy(xpath = "(//li[@class='airport-list ng-star-inserted'])[1]")
    public WebElement airportList;

    @FindBy(xpath = "//a[@id='toAirportName']//span[@class='airport-code d-block']")
    public WebElement destinationField;

    @FindBy(xpath = "//span[@aria-describedby='selectTripType-val']")
    public WebElement tripTypeDropDown;

    @FindBy(xpath = "//ul[@class='select-ui-optionUL ng-tns-c1-2 select-ui-optionUL-overflow']//li")
    public List<WebElement> tripTypes;

    @FindBy(xpath = "//span[@aria-labelledby='passengers-label']")
    public WebElement passengersDropDown;

    @FindBy(xpath = "//ul[@id='passengers-desc']//li")
    public List<WebElement> passengerAmount;

    @FindBy(id = "input_departureDate_1")
    public WebElement dateDropDown;

    @FindBy(xpath = "(//a[@class='dl-state-default'])[2]")
    public WebElement departDate;

    @FindBy(id = "shopWithMiles")
    public WebElement shopWithMiles;

    @FindBy(xpath = "//a[@class='forgot-password']")
    public WebElement forgotPasswordLink;




    public void selectFromTo(String from, String to){
        departureField.click();
        searchAirport.sendKeys(Keys.BACK_SPACE,from);
        airportList.click();

        destinationField.click();
        searchAirport.sendKeys(Keys.BACK_SPACE,to);
        airportList.click();
    }

    public void selectDropDownItem(String title, WebElement dropBox, List<WebElement> elements){
        dropBox.click();
        for (WebElement type : elements) {
            if (type.getAccessibleName().contains(title)){
                type.click();
                break;
            }
        }
    }
    public void selectDate(){
        dateDropDown.click();
        departDate.click();
    }

























    public List<String> websiteTitlesExpected(){

        return new ArrayList<>(Arrays.asList(
                "Delta Vacations",
                "Travel with Delta",
                "Travel with Delta",
                "Travel Gift Card | Delta Air Lines",
                "Baggage Policy and Fees | Delta Air Lines"
        ));
    }
    public List<WebElement> links(){
        return new ArrayList<>(Arrays.asList(
                vacationDeals_Link,
                shopHotels_Link,
                rentACar_Link,
                giftCardsLink,
                updatedBagTravelFees_link
        ));

    }









}
