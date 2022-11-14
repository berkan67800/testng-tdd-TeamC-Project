package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class NotificationTestElementsPage {

    public NotificationTestElementsPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='nav-item nav-item-drawer-link first-item']//parent::div")
    public WebElement collapsableText;

    @FindBy(xpath = "//div[@class='panel-body']//li[@class='additional-nav-item ']//a[@href='/us/en/advisories/coronavirus-travel/overview']")
    public WebElement firstOption;

    @FindBy(xpath = "//div[@class='info-content-container']")
    public WebElement reconnetJojTravel;

    @FindBy(xpath = "//a[@id='yesBtn']")
    public WebElement feedbackYesButton;

    @FindBy(xpath = "//a[@id='noBtn']")
    public WebElement feedbackNoButton;

    @FindBy(xpath = "//span[@class='acknowledge']")
    public WebElement thankYouForFeedbackMessage;
}
