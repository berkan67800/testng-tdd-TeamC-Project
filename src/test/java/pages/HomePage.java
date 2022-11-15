package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.SeleniumUtils;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
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

    @FindBy(id = "secondary-static-link-3")
    public WebElement baggage_Link;

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

    @FindBy(xpath = "(//a[@class='dl-state-default'])[4]")
    public WebElement returnDate;

    @FindBy(id = "shopWithMiles")
    public WebElement shopWithMiles;

    @FindBy(xpath = "//a[@class='forgot-password']")
    public WebElement forgotPasswordLink;

    @FindBy(id = "headSectab3")
    public WebElement needHelpLink;

    @FindBy(id = "primary-static-link-1")
    public WebElement refundHelpLink;

    @FindBy(xpath = "//a[@class='sign-up btn btn-link']")
    public WebElement signUpPageLink;
    
    @FindBy(xpath = "//ngc-search[@class='d-lg-none float-right search-ham ng-tns-c0-0 d-none ng-star-inserted']//a[@aria-haspopup='true']")
    public WebElement searchBox;

    @FindBy(xpath = "//a[@class='notification icon-notification-icon circle-outline']")
    public WebElement notificationButton;

    @FindBy(xpath = "//div[@class='modal-footer mobile-view-all justify-content-start border-0 mobile-view-all-absolute']//span[@aria-hidden='true']")
    public WebElement viewAllButton;

    @FindBy(xpath = "(//a[@href='/en_US/site-map'])[2]")
    public WebElement siteMapButton;
    
    
    
    

    public void selectFromTo(String from, String to) {
        departureField.click();
        searchAirport.sendKeys(Keys.BACK_SPACE, from);
        airportList.click();

        destinationField.click();
        searchAirport.sendKeys(Keys.BACK_SPACE, to);
        airportList.click();
    }

    public void selectDropDownItem(String title, WebElement dropBox, List<WebElement> elements) {
        dropBox.click();
        for (WebElement type : elements) {
            if (type.getAccessibleName().contains(title)) {
                type.click();
                break;
            }
        }
    }
    public void selectDepartDate() {
        dateDropDown.click();
        departDate.click();
    }
        
    public void selectReturnDate() {
        departDate.click();
    }


}