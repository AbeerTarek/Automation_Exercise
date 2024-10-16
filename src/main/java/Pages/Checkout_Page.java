package Pages;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.time.Duration;



public class Checkout_Page extends PageBase{
    public Checkout_Page(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath="//a[@class= 'btn btn-default check_out']")
    WebElement ProceedToCheckoutbtn;

    @FindBy(xpath="//a[@class= 'btn btn-default check_out']")
    WebElement PlaceOrderbtn;

    @FindBy(xpath="//input[@name= 'name_on_card']")
    WebElement NameOnCard;

    @FindBy(xpath="//input[@name= 'card_number']")
    WebElement CardNumber;

    @FindBy(xpath="//input[@name= 'cvc']")
    WebElement CVC;

    @FindBy(xpath="//input[@name= 'expiry_month']")
    WebElement Expiration;

    @FindBy(xpath="//input[@name= 'expiry_year']")
    WebElement Year;

    @FindBy(xpath="//button[@data-qa= 'pay-button']")
    WebElement PayandConfirmbtn;


    public void CheckoutProcess () {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        ProceedToCheckoutbtn.click();
        Assert.assertEquals("Address Details","Address Details");
        PlaceOrderbtn.click();
        Assert.assertEquals("Payment","Payment");
        NameOnCard.sendKeys(generateRandomString(10));
        CardNumber.sendKeys(generateRandomNumber(16));
        CVC.sendKeys(generateRandomNumber(3));
        Expiration.sendKeys(generateRandomNumber(2));
        Year.sendKeys(generateRandomNumber(4));
        PayandConfirmbtn.click();
        Assert.assertEquals("Order Placed!","Order Placed!");
       }
    }



