package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Click;
import pages.Input;
import pages.OpenBrowser;

public class LoginStep {
    Click c = new Click();
    Input i = new Input();
    OpenBrowser o = new OpenBrowser();

    public LoginStep(){
        this.c = new Click();
        this.i = new Input();
    }

    @Given("opens the web page")
    public void opensTheWebPage() {
        o.openBrowser();
    }

    @And("user click icon login")
    public void userClickIconLogin() {
        c.clickIconLogin();
    }

    @When("user input username {string}")
    public void userInputUsername(String username) {
        i.inputLoginUsername(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String passsword) {
        i.inputLoginPassword(passsword);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        c.clickLoginButton();
    }

    @Then("user will see message {string}")
    public void userWillSeeMessage(String msg) {
        c.assertMsg(msg);
    }

    @Then("user will see text welcome")
    public void userWillSeeTextWelcome() {
        c.assertWelcome();
    }
}
