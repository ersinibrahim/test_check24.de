package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.Elements_Homepage;

public class Elements_HomepageSteps {

    Elements_Homepage elements_homepage;

    public Elements_HomepageSteps(Elements_Homepage elements_homepage) {
        this.elements_homepage = elements_homepage;
    }



    @Given("Control the element on the homepage is clickable and available for dropdowns")
    public void controlTheElementOnTheHomepageIsClickableAndAvailableForDropdowns() {
        elements_homepage.listElementsIsclickable(elements_homepage.getElements());

        elements_homepage.hoverElementandDropdownsMenuVisibility(elements_homepage.getElements_dropDownsMenu());



    }


}
