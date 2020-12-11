package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;


public class LoginPageStepDefs {


LoginPage loginPage = new LoginPage();

    @When("I login with user {string} and {string}")
    public void i_login_with_user_and(String email, String password) {
        System.out.format("Thread ID - %2d - %s from %s feature file.\n",
                Thread.currentThread().getId(), email, password);
        // Write code here that turns the phrase above into concrete actions
    loginPage.clickButtonMyAccount();
    loginPage.clickButtonLogin();
    loginPage.setMyEmail(email);
    loginPage.setMyPassword(password);
    loginPage.clickSubmitButton();
    }

}
