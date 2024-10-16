package Tests;
import Pages.Checkout_Page;
import org.testng.annotations.Test;
import java.io.IOException;
import java.text.ParseException;


public class Checkout_Test extends TestBase{


    Checkout_Page CheckoutObject;

    @Test( priority = 3)
    public void Checkout() throws InterruptedException, ParseException, IOException {


        CheckoutObject = new Checkout_Page(driver);
        CheckoutObject.CheckoutProcess();
    }
}
