package Pages;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;


public class AddToCart_Page extends PageBase{


    public AddToCart_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//a[@href= '/products']")
    WebElement ProductsLink;

    @FindBy(xpath="//i[@class= 'fa fa-plus-square']")
    WebElement ViewProduct;

    @FindBy(xpath="//button[@type= 'button']")
    WebElement AddToCartBtn;

    @FindBy(xpath="//a[@href= '/view_cart']")
    WebElement ViewCartLink;



    public void AddToCartProcess () {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        ProductsLink.click();
        ViewProduct.click();
        AddToCartBtn.click();
        Assert.assertEquals("Added!","Added!");
        ViewCartLink.click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL,"https://automationexercise.com/view_cart");
    }
}
