package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class BaggagePage {

    public BaggagePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText= "Checked Baggage Fees")
    public WebElement baggageFee;

    @FindBy(xpath = "//div[@id='collapseInner2']//a[@href='/us/en/baggage/checked-baggage/track-checked-baggage']")
    public WebElement trackingCheckedBaggage;

    @FindBy(xpath ="//div[@class='container globalanchorchk textdescription']//span[@class='desktop-text']//a[@href='/us/en/baggage/special-items/overview']")
    public WebElement specialItems;

    @FindBy(linkText= "Carry-On Baggage")
    public WebElement carryOnBaggage;

    @FindBy(linkText= "Travel Changes")
    public WebElement travelChanges;

    @FindBy(linkText= "Travel Services")
    public WebElement travelServices;

    @FindBy(xpath = "//div[@class='col-12 clearfix baggagewrapper__bag-estimate-subtitle px-0']//i[@aria-hidden='true']")
    public WebElement activeMilitaryDutyInfo;

    @FindBy(xpath = "//div[@id='cdk-overlay-3']")
    public WebElement popupPage;

    @FindBy(xpath = "//div[@class='login-modal-close-icon-box']//button[@role='button']")
    public WebElement militaryOkButton;

    @FindBy(xpath = "//h2[@class='idp-dialog__header--title mat-dialog-title header--dark ng-star-inserted']")
    public WebElement bagForActiveMilitaryHeader;

    //=========================================================================================

    @FindBy(xpath = "//input[@aria-label='Origin']")
    public WebElement origin;

    @FindBy(xpath = "//input[@aria-label='Destination']")
    public WebElement destination;

    @FindBy(xpath = "//div[@aria-describedby='idp-input_onboard_experience__selected']")
    public WebElement onBoardExperience;

    @FindBy(xpath = "//idp-molecule-calendar-dropdown[@id='input_date_purchase']//div[@class='idp-molecule-calendar-dropdown idp-molecule-calendar-dropdown--add-margin']")
    public WebElement purchaseDate;

    @FindBy(xpath = "(//div[contains(@class, 'calendar-table__anchor-date calendar-table__focused')])[1]/following-sibling::div[1]")
    public WebElement purchaseDateDay;

    @FindBy(xpath = "(//section)[1]//button[contains(text(),'done')]")
    public WebElement purchaseDateDoneButton;

    @FindBy(xpath = "//idp-molecule-calendar-dropdown[@formcontrolname='travelDate']//div[@class='idp-molecule-calendar-dropdown idp-molecule-calendar-dropdown--add-margin']")
    public WebElement travelDate;

    @FindBy(xpath = "(//button[@aria-label='Next month'])[2]")
    public WebElement travelDateNextMonth;

    @FindBy(xpath = "(//div[@class='calendar-table__col calendar-table-day__current--15'])[2]")
    public WebElement travelDateDay;


    @FindBy(xpath = "(//section)[2]//button[contains(text(),'done')]")
    public WebElement travelDateDoneButton;


    @FindBy(xpath = "//idp-simple-info[@class='head-table-cell']//span[@class='ng-star-inserted']")
    public WebElement calculatorPopUpAirport;



    @FindBy(xpath = "//div[@aria-describedby='idp-passengers__selected']")
    public WebElement numOfPassenger;

    @FindBy(xpath = "//div[@aria-describedby='idp-medallion-status__selected']")
    public WebElement medallionStatus;

    @FindBy(xpath = "//div[@aria-describedby='idp-credit-card-status__selected']")
    public WebElement skyMiles;

    @FindBy(xpath = "//idp-button[@class='cal-estimate-btn float-right mt-0 mt-md-2']//button")
    public WebElement calculateEstimate;


    @FindBy(xpath = "//li//a[@href='/us/en/baggage/checked-baggage/excess-overweight-baggage']")
    public WebElement excessAndOverweightBag;








}


