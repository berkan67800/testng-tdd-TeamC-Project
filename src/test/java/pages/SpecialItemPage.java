package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SpecialItemPage {

    public SpecialItemPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath ="//div[@class='container globalanchorchk textdescription']//span[@class='desktop-text']//a[@href='/us/en/baggage/special-items/overview']")
    public WebElement specialItems;

    @FindBy(linkText = "Children & Infant Items")
    public WebElement childrenInfantItems;

    @FindBy(xpath = "//div[@class='panel-body']//a[@href='/us/en/baggage/special-items/fragile-bulky-other-items']")
    public WebElement fragileAndBulkyItems;

    @FindBy(xpath = "//div[@class='panel-body']//a[@href='/us/en/baggage/special-items/musical-instruments']")
    public WebElement musicalInstruments;
}
