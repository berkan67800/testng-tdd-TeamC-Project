package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class ForgotPasswordPage {

    public ForgotPasswordPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "userId")
    public WebElement userNameField;

    @FindBy(tagName = "button")
    public WebElement continueButton;

    @FindBy(id = "correctionBar")
    public WebElement errorMessage;

    @FindBy(xpath = "//*[contains(text(),' Choose Recovery Method ')]")
    public WebElement header;



}
