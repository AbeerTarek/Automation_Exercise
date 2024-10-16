package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class PageBase {

    protected WebDriver driver;

    public PageBase(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public  String generateRandomString(int size) {
        Random rand=new Random();
        String aToZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzs";
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < size; i++) {
            int randIndex=rand.nextInt(aToZ.length());
            res.append(aToZ.charAt(randIndex));
        }
        return res.toString();
    }

    public  String generateRandomNumber(int size) {
        Random rand=new Random();
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < size; i++) {
            int randIndex=rand.nextInt(9);
            res.append(randIndex);
        }
        return res.toString();
    }



}
