package stepDefs;

import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import pages.MyAccountPage;

public class MyAccountPageStepDefs {

    MyAccountPage myAccountPage = new MyAccountPage();

    @Then("I see text {string} on the successful login page")
    public void i_see_text_on_the_successful_login_page(String myAccountText) {
        String actualTextAfterLogin = myAccountPage.getSuccessfullLoginText();
        // Write code here that turns the phrase above into concrete actions

       // throw new io.cucumber.java.PendingException();
        Assertions.assertThat(actualTextAfterLogin).isEqualTo(myAccountText);
    }
}
