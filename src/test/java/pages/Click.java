package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.Utility.driver;

public class Click {
    By icon_login = By.id("login2");
    By click_signup = By.xpath("//a[@id='signin2']");
    By click_signupButton = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
    By click_login = By.xpath("//button[normalize-space()='Log in']");
    By getText_welcome = By.id("nameofuser");
    By getText_thankyou = By.xpath("//h2[normalize-space()='Thank you for your purchase!']");
    By icon_home = By.xpath("//a[text()='Home ']");
    By click_add_to_cart = By.xpath("//a[@class='btn btn-success btn-lg']");
    By click_cart = By.xpath("//a[@id='cartur']");
    By remove_cart = By.xpath("//a[.='Delete']");
    By click_place_order = By.xpath("//button[normalize-space()='Place Order']");
    By click_logout = By.id("logout2");
    By click_purchase = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    By getMenu_phones = By.xpath("//a[.='Phones']");
    By getMenu_laptops = By.xpath("//a[.='Laptops']");
    By getMenu_monitors = By.xpath("//a[.='Monitors']");


    By getText_product(String product) {
        return By.xpath("//*[contains(text(), '" + product + "')]");
    }


    public void clickIconLogin(){
        driver.findElement(icon_login).click();
    }
    public void clickLoginButton(){
        driver.findElement(click_login).click();
    }
    public void assertWelcome(){
        driver.findElement(getText_welcome).isDisplayed();
    }
    public void clickIconSignup(){
        driver.findElement(click_signup).click();
    }
    public void clickSignupButton(){
        driver.findElement(click_signupButton).click();
    }
    public void assertMsg(String message){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        if (alertText.contains(message)) {
            System.out.println(alertText);
        } else {
            System.out.println("Invalid");
        }
        alert.accept();
    }
    public void assertProduct(String Product) {
        driver.findElement(getText_product(Product)).click();
    }
    public void clickPhonesMenu() {
        driver.findElement(getMenu_phones).click();
    }

    public void clickLaptopsMenu() {
        driver.findElement(getMenu_laptops).click();
    }

    public void clickMonitorsMenu() {
        driver.findElement(getMenu_monitors).click();
    }
    public void clickAddToCart() {
        driver.findElement(click_add_to_cart).click();
    }

    public void clickCart() {
        driver.findElement(click_cart).click();
    }

    public void removeCart() {
        driver.findElement(remove_cart).click();
    }

    public void clickPlaceOrder() {
        driver.findElement(click_place_order).click();
    }

    public void clickPurchase() {
        driver.findElement(click_purchase).click();
    }
    public void clickHome() {
        driver.findElement(icon_home).click();
    }
    public void getTextThank() {
        driver.findElement(getText_thankyou).click();
    }
}
