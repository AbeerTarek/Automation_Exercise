package Tests;
import Pages.AddToCart_Page;
import org.testng.annotations.Test;




public class AddToCart_Test extends TestBase{

    AddToCart_Page AddToCartObject;


    @Test( priority = 2)
    public void AddToCart() {


        AddToCartObject = new AddToCart_Page(driver);
        AddToCartObject.AddToCartProcess();
    }
}
