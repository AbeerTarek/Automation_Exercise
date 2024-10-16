package Pages;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;


public class Login_Page extends PageBase {

    public String generatedEmailAddress;
    private String generatedPassword;

    public Login_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(partialLinkText = "Signup / Login")
    WebElement SignUpLink;

    @FindBy(xpath="//input[@data-qa= 'signup-name']" )
    WebElement NameField;

    @FindBy(xpath="//input[@data-qa= 'signup-email']" )
    WebElement EmailAddressField;

    @FindBy(xpath="//button[@data-qa= 'signup-button']" )
    WebElement SignUpButton;

    @FindBy(id = "id_gender1")
    WebElement GenderField;

    @FindBy(id = "password")
    WebElement PasswordField;

    @FindBy(id = "first_name")
    WebElement FirstNameField;

    @FindBy(id = "last_name")
    WebElement LastNameField;

    @FindBy(id = "address1")
    WebElement AddressField;

    @FindBy(xpath ="//select[@id= 'country']")
    WebElement CountryDDList;

    @FindBy(xpath="//input[@data-qa= 'state']" )
    WebElement StateField;

    @FindBy(xpath="//input[@data-qa= 'city']" )
    WebElement CityField;

    @FindBy(xpath="//input[@data-qa= 'zipcode']" )
    WebElement ZipCodeField ;

    @FindBy(xpath="//input[@data-qa= 'mobile_number']" )
    WebElement MobileNumberField ;

    @FindBy(xpath="//button[@data-qa= 'create-account']" )
    WebElement CreateAccountBtn ;


    @FindBy(xpath="//h2[@data-qa= 'account-created']" )
    WebElement AccountCreatedText ;


    public void SignUp_Login (String CountryDDL){


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        SignUpLink.click();
        NameField.sendKeys(generateRandomString(6));
        EmailAddressField.sendKeys(generateRandomString(6)+"@gmail.com");
        generatedEmailAddress = EmailAddressField.getAttribute("value");
        System.out.println("Generated Email: " + generatedEmailAddress);
        SignUpButton.click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL,"https://automationexercise.com/signup");
        GenderField.click();
        PasswordField.sendKeys(generateRandomNumber(10));
        generatedPassword = PasswordField.getAttribute("value");
        System.out.println("Generated Password: " + generatedPassword);
        FirstNameField.sendKeys(generateRandomString(6));
        LastNameField.sendKeys(generateRandomString(6));
        Select Country = new Select(CountryDDList);
        Country.selectByValue(CountryDDL);
        AddressField.sendKeys(generateRandomString(10));
        StateField.sendKeys(generateRandomString(6));
        CityField.sendKeys(generateRandomString(6));
        ZipCodeField.sendKeys(generateRandomNumber(6));
        MobileNumberField.sendKeys(generateRandomNumber(11));
        CreateAccountBtn.click();
        Assert.assertTrue(AccountCreatedText.isDisplayed());

    }

    public String getGeneratedEmailAddress() {
        return generatedEmailAddress;
    }

    public String getGeneratedPassword() {
        return generatedPassword;
    }
}
