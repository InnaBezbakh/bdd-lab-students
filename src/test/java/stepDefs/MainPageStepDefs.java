package stepDefs;

import io.cucumber.java.en.Given;
import pages.MainPage;

public class MainPageStepDefs {

    MainPage mainPage = new MainPage();

    @Given("I am on the Main page of application")
    public void i_am_on_the_main_page_of_application() {

        // Write code here that turns the phrase above into concrete actions
mainPage.openMainPage();
    }
}
