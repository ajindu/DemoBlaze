package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.Click;
import pages.Input;
import pages.OpenBrowser;

public class SignupStep {

    Click c = new Click();
    Input i = new Input();
    OpenBrowser o = new OpenBrowser();
    public SignupStep(){
        this.c = new Click();
        this.i = new Input();
    }
    @And("user click icon sign up")
    public void userClickIconSignUp() {
        c.clickIconSignup();
    }

    @When("user input sign up username {string}")
    public void userInputSignUpUsername(String username) {
        i.inputSignUsername(username);
    }

    @And("user input sign up password {string}")
    public void userInputSignUpPassword(String password) {
        i.inputSignPassword(password);
    }

    @And("user click sign up button")
    public void userClickSignUpButton() {
        c.clickSignupButton();
    }

}
