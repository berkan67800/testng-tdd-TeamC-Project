package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class DeltaLinks {

    public DeltaLinks (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath= "/html/body/app-root/app-home/ngc-global-footer/footer/div/div/div[2]/div/ngc-footer-column/div/div/div[1]/ul[1]/li[1]/a")
    public WebElement about_Us;

    @FindBy(xpath = "//a[@href='/us/en/careers/overview'][@class='footernav-careers']")
    public WebElement careers;

    @FindBy(xpath = "//a[@href='/https://news.delta.com'] ")
    public WebElement newHub;


    @FindBy(xpath = "//a[@href='/https://ir.delta.com/']")
    public WebElement investorRelations;


    @FindBy(xpath = "//a[@href='https://business.delta.com/content/b2b/en/home.html']")
    public WebElement businessTravel;


    @FindBy(xpath = "//a[@href='https://pro.delta.com/content/common/en/agencymap.html']")
    public WebElement travelAgents;


    @FindBy(xpath = "//a[@href='/us/en/delta-digital/mobile']")
    public WebElement mobileApp;


    
}
