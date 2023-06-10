package pages;

import org.openqa.selenium.support.PageFactory;
import utiliies.Driver;

public class GoogleHomePage {
    public  GoogleHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
        System.out.println();
    }
}
