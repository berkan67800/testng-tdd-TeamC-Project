package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class BagsOnTimePage {

    public BagsOnTimePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='toolTipErrorMessageContainer']")
    public WebElement warningMessage;



}

