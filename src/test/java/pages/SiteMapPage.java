package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SiteMapPage {

    public SiteMapPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@href='/content/www/en_US/shop/gift-card/corporate-bulk-gift-cards.html']")
    public WebElement CorporateBulkGiftCard;

    @FindBy(xpath = "//a[@class='btn btn-danger btn-primary-cta btn-block btn-default']")
    public WebElement orderNowButton;

    @FindBy(xpath = "//a[normalize-space()='Get Access']")
    public WebElement getAccesButton;

    @FindBy(xpath = "//input[@id='register-email']")
    public WebElement registerEmailButton;

    @FindBy(xpath = "//button[normalize-space()='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "//a[normalize-space()='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//a[@id='cancel-registration-yes']")
    public WebElement yesButton;



    //button[@aria-label='No thanks'] - feedback





}
