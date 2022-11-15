package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.SeleniumUtils;

import java.util.List;

public class SignUpPage {

    public SignUpPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//input[@aria-label='First Name']")
    public WebElement firstNameField;

    @FindBy(xpath = "//input[@aria-label='Last Name']")
    public WebElement lastNameField;

    @FindBy(xpath = "(//div[@class='idp-dropdown'])[4]")
    public WebElement genderDropdown;

    @FindBy(xpath = "//li[contains(@id,'genderoption')]")
    public List<WebElement> genderDOBDropdownItems;

    @FindBy(xpath = "(//div[@class='idp-dropdown'])[1]")
    public WebElement monthDOBDropdownLink;

    @FindBy(xpath = "//li[contains(@id,'monthoption')]")
    public List<WebElement> monthDOBDropdownItems;


    @FindBy(xpath = "(//div[@class='idp-dropdown'])[2]")
    public WebElement dayDOBDropdown;

    @FindBy(xpath = "//li[contains(@id,'dateoption')]")
    public List<WebElement> dayDOBDropdownItems;




    @FindBy(xpath = "(//div[@class='idp-dropdown'])[3]")
    public WebElement yearDOBDropdown;

    @FindBy(xpath = "//li[contains(@id,'yearoption')]")
    public List<WebElement> yearDOBDropdownItems;

    @FindBy(id = "basic-info-next")
    public WebElement basicInfoNextButton;

    @FindBy(xpath = "//input[@aria-label='Address Line 1']")
    public WebElement addressLine1;

    @FindBy(xpath = "//input[@aria-label='City']")
    public WebElement cityField;

    @FindBy(xpath = "//div[@aria-describedby='idp-countrySubdivisionCode__selected']")
    public WebElement stateDropdown;


    @FindBy(xpath = "//li[contains(@id,'countrySubdivisionCodeoption')]")
    public List<WebElement> stateDOBDropdownItems;

    @FindBy(xpath = "//input[@aria-label='Postal Code']")
    public WebElement postalCodeField;

    @FindBy(xpath = "//input[@aria-label='Phone Number (Mobile Preferred)']")
    public WebElement phoneNumberField;

    @FindBy(xpath = "//input[@aria-label='Email Address']")
    public WebElement emailField;

    @FindBy(xpath = "//input[@aria-label='Confirm Email Address']")
    public WebElement confirmEmailField;

    @FindBy(xpath = "//input[@aria-label='Enter a Username']")
    public WebElement userNameField;

    @FindBy(xpath = "//input[@aria-label='Enter  a Password']")
    public WebElement passwordField;

    @FindBy(xpath = "//input[@aria-label='Confirm Password']")
    public WebElement confirmPasswordField;

    @FindBy(id = "login-info-submit")
    public WebElement loginInfoSubmit;

    @FindBy(id = "contact-info-next")
    public WebElement contactInfoNextButton;

    @FindBy(xpath = "//div[@aria-describedby='idp-securityQs1__selected']")
    public WebElement securityQuestion1;

    @FindBy(xpath = "//div[@aria-describedby='idp-securityQs2__selected']")
    public WebElement securityQuestion2;

    @FindBy(xpath = "//input[@aria-label='Answer 1']")
    public WebElement answer1Field;

    @FindBy(xpath = "//input[@aria-label='Answer 2']")
    public WebElement answer2Field;








    public void enterBasicInfoRandom(){
        Faker faker = new Faker();

        firstNameField.sendKeys(faker.name().firstName());
        lastNameField.sendKeys(faker.name().lastName());
        monthDOBDropdownLink.sendKeys(Keys.ARROW_UP,Keys.TAB);
        dayDOBDropdown.sendKeys(Keys.ARROW_UP,Keys.TAB);
        yearDOBDropdown.sendKeys(Keys.ARROW_UP,Keys.TAB);
        genderDropdown.sendKeys(Keys.ARROW_DOWN);
        basicInfoNextButton.click();

}


    public void enterContactInfoRandom(){
        Faker faker = new Faker();

        String email = faker.internet().emailAddress();

        addressLine1.sendKeys(faker.address().streetAddress());
        cityField.sendKeys(faker.address().city());
        stateDropdown.sendKeys(Keys.ARROW_UP,Keys.ARROW_UP);
        postalCodeField.sendKeys(faker.address().zipCode().substring(0,5));
        phoneNumberField.sendKeys(faker.phoneNumber().cellPhone().replace(".",""));
        emailField.sendKeys(email);
        confirmEmailField.sendKeys(email);
        contactInfoNextButton.click();

    }

    public void enterLoginInfoRandom(){
        Faker faker = new Faker();
        String password = faker.internet().password(8,20,true,false,true);

        SeleniumUtils.waitFor(1);
        userNameField.sendKeys(faker.name().username().replace(".",""));
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(password);
        securityQuestion1.sendKeys(Keys.ARROW_UP,Keys.TAB);
        answer1Field.sendKeys(faker.animal().name());
        securityQuestion2.sendKeys(Keys.ARROW_UP,Keys.TAB);
        answer2Field.sendKeys(faker.animal().name());
        loginInfoSubmit.click();

    }

    public void enterBasicInfoCSVFile(String firstName, String lastName, String date, String gender){
        String dateArr[] = date.split("-");

        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        SeleniumUtils.selectDropDownItem(dateArr[0],monthDOBDropdownLink,monthDOBDropdownItems);
        SeleniumUtils.selectDropDownItem(dateArr[1],dayDOBDropdown,dayDOBDropdownItems);
        SeleniumUtils.selectDropDownItem(dateArr[2],yearDOBDropdown,yearDOBDropdownItems);
        SeleniumUtils.selectDropDownItem(gender,genderDropdown,genderDOBDropdownItems);
        basicInfoNextButton.click();

    }
    public void enterContactInfoCSVFile(String address,String city,String state,String postalCode,String phone,String email){

        SeleniumUtils.waitFor(1);
        addressLine1.sendKeys(address);
        cityField.sendKeys(city);
        SeleniumUtils.selectDropDownItem(state,stateDropdown,stateDOBDropdownItems);
        postalCodeField.sendKeys(postalCode);
        phoneNumberField.sendKeys(phone);
        emailField.sendKeys(email);
        confirmEmailField.sendKeys(email);
        contactInfoNextButton.click();

    }

    public void enterLoginInfoCSVFile(String username,String password,String q1,String q2){
        SeleniumUtils.waitFor(1);
        userNameField.sendKeys(username);
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(password);
        securityQuestion1.sendKeys(Keys.ARROW_UP,Keys.TAB);
        answer1Field.sendKeys(q1);
        securityQuestion2.sendKeys(Keys.ARROW_UP,Keys.TAB);
        answer2Field.sendKeys(q2);
        loginInfoSubmit.click();

    }



}
