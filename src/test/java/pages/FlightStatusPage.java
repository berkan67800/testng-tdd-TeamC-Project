package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class FlightStatusPage {


    public FlightStatusPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[text()='View flight status ']")
    public WebElement viewFlightStatus;

    @FindBy(xpath = "//div[@id='correctionBar']")
    public WebElement correctionBar;

    @FindBy(id = "fromAirport")
    public WebElement fromAirport;

    @FindBy(id = "toAirport")
    public WebElement toAirport;

    @FindBy(xpath = "//td[@aria-describedby='d']//span[@class='aircode']")
    public List<WebElement> departureAirportInList;

    @FindBy(xpath = "//td[@aria-describedby='e']//span[@class='aircode']")
    public List<WebElement> arrivalAirportInList;





    public boolean airportTitlesInList(String departure, String arrival) {

        boolean arrivalCheck = true;
        boolean departureCheck = true;

        for (WebElement departureText : departureAirportInList) {
            if(!departureText.getText().equals(departure)) departureCheck = false;
        }
        for (WebElement arrivalText : arrivalAirportInList) {
            if(!arrivalText.getText().equals(arrival)) arrivalCheck = false;
        }
        return arrivalCheck&&departureCheck;
    }

}
