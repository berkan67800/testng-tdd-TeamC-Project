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


}


