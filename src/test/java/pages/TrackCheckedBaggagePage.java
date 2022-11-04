package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class TrackCheckedBaggagePage {

    public TrackCheckedBaggagePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='col-6 mt-1 errorText']")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@value='Check Bag Status']")
    public WebElement checkBagStatusButton;

    @FindBy(xpath = "//div[@class='nextpagename']")
    public WebElement BagGuarantee;




}
