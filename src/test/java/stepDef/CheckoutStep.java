package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Click;
import pages.Input;
import pages.OpenBrowser;

public class CheckoutStep {
    Click c = new Click();
    Input i = new Input();
    OpenBrowser o = new OpenBrowser();

    public CheckoutStep(){
        this.c = new Click();
        this.i = new Input();
    }
    @And("user click phones menu")
    public void userClickPhonesMenu() throws InterruptedException {
        Thread.sleep(3000);
        c.clickPhonesMenu();
    }

    @And("user click product {string}")
    public void userClickProduct(String product){
        c.assertProduct(product);
    }

    @And("user click add to cart")
    public void userClickAddToCart() {
        c.clickAddToCart();
    }

    @And("user click home")
    public void userClickHome() {
        c.clickHome();
    }

    @And("user click laptops menu")
    public void userClickLaptopsMenu() throws InterruptedException {
        Thread.sleep(3000);
        c.clickLaptopsMenu();
    }

    @And("user click delete")
    public void userClickDelete() {
        c.removeCart();
    }

    @And("user click cart icon")
    public void userClickCartIcon() throws InterruptedException {
        Thread.sleep(3000);
        c.clickCart();
    }

    @And("user click place order")
    public void userClickPlaceOrder() {
        c.clickPlaceOrder();
    }
    @And("user input name {string}")
    public void userInputName(String name) {
        i.inputName(name);
    }
    @And("user input country {string}")
    public void userInputCountry(String country) {
        i.inputCountry(country);
    }

    @And("user input city {string}")
    public void userInputCity(String city) {
        i.inputCity(city);
    }

    @And("user input credit card {string}")
    public void userInputCreditCard(String cc) {
        i.inputCard(cc);
    }

    @And("user input month {string}")
    public void userInputMonth(String month) {
        i.inputMonth(month);
    }

    @And("user input year {string}")
    public void userInputYear(String year) {
        i.inputYear(year);
    }

    @And("user click purchase")
    public void userClickPurchase() {
        c.clickPurchase();
    }

    @Then("user will see thank you pop up")
    public void userWillSeeThankYouPopUp() {
        c.getTextThank();
    }
}
