package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class FirstClassFlight {

    public FirstClassFlight (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "headSectab1")
    public WebElement travelInfo;

    @FindBy(linkText= "First Class")
    public WebElement firstClass;


    @FindBy(linkText = "BOOK NOW")
    public WebElement bookNow;

    @FindBy(id = "fromAirportName")
    public WebElement fromAirportName;

    @FindBy(id = "toAirportName")
    public WebElement toAirportName;

    @FindBy(id = "selectTripType")
    public WebElement tripType;

    @FindBy(id = "btnSubmit")
    public WebElement submitButton;

    @FindBy(id = "correctionBar")
    public WebElement correctionBar;










}
