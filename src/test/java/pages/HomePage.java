package pages;

import com.github.dockerjava.api.model.Link;
import io.opentelemetry.api.baggage.Baggage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//a[@data-analytics-id='home-shop-1']")
    public WebElement vacationDeals_Link;

    @FindBy(xpath = "//a[@data-analytics-id='home-shop-2']")
    public WebElement shopHotels_Link;

     @FindBy(xpath = "//a[@data-analytics-id='home-shop-3']")
    public WebElement rentACar_Link;

    @FindBy(xpath = "//a[@data-analytics-id='home-shop-4']")
    public WebElement giftCardsLink;

    @FindBy(xpath = "//a[@data-analytics-id='home-shop-5']")
    public WebElement updatedBagTravelFees_link;

    @FindBy(linkText = "Travel Info")
    public WebElement travelInfo_Link;

    @FindBy(linkText = "Baggage")
    public WebElement Baggage_Link;
    @FindBy(linkText = "Flight Schedules")
    public WebElement flightSchedulesLink;














    public List<String> websiteTitlesExpected(){

        return new ArrayList<>(Arrays.asList(
                "Delta Vacations",
                "Travel with Delta",
                "Travel with Delta",
                "Travel Gift Card | Delta Air Lines",
                "Baggage Policy and Fees | Delta Air Lines"
        ));
    }
    public List<WebElement> links(){
        return new ArrayList<>(Arrays.asList(
                vacationDeals_Link,
                shopHotels_Link,
                rentACar_Link,
                giftCardsLink,
                updatedBagTravelFees_link
        ));

    }









}
