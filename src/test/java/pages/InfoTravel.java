package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class InfoTravel {

    public InfoTravel (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "headSectab1")
    public WebElement travelInfo;
    @FindBy(id = "secondary-static-link-17")
    public WebElement trip_Protection;

}
