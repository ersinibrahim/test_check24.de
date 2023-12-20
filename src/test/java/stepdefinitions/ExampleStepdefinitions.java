package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.ExamplePage;
import utilities.ConfigReader;
import utilities.Driver;

public class ExampleStepdefinitions {
 ExamplePage examplePage = new ExamplePage();



 @Given("user goes the check24 home page")
 public void user_goes_the_check24_home_page() {
  Driver.getDriver().get(ConfigReader.getProperty("toUrl"));  throw new io.cucumber.java.PendingException();
 }

}
