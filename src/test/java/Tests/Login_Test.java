package Tests;
import Pages.Login_Page;
import junit.framework.Assert;
import org.testng.annotations.Test;




public class Login_Test extends TestBase {

    Login_Page Login_PageObject;



    @Test( priority = 1)
    public void SignUp_LoginProcess() {

        Login_PageObject = new Login_Page(driver);
        Login_PageObject.SignUp_Login("India");
        String generatedEmail = Login_PageObject.getGeneratedEmailAddress();
        System.out.println("Email used during signup: " + generatedEmail);
        Assert.assertNotNull("Email should not be null", generatedEmail);
        String generatedPassword = Login_PageObject.getGeneratedPassword();
        System.out.println("Password used during signup: " + generatedPassword);
        Assert.assertNotNull("Password should not be null", generatedPassword);
    }
}
