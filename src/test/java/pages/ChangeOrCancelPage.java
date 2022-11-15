package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChangeOrCancelPage {

    public ChangeOrCancelPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='chart'][1]//tr/th")
    public List<WebElement> tableHeaders;

    @FindBy(xpath = "//ul[@id='information-nav-item-accordion']//a[@class='nav-item first-item']")
    public WebElement overviewLink;

    public List<String> tableOneHeaders = new ArrayList<>(Arrays.asList(
            "TIME PERIOD",
            "BASIC ECONOMY TICKET*",
            "NON-REFUNDABLE TICKET",
            "REFUNDABLE TICKET",
            "DURING 24-HR RISK-FREE CANCELLATION PERIOD",
            "AFTER 24-HR RISK-FREE CANCELLATION PERIOD**",
            "WITHIN 24 HRS OF FLIGHT DEPARTURE"

    ));


}
