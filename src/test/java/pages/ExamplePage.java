package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ExamplePage {

    public ExamplePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
