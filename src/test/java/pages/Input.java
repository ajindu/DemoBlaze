package pages;

import org.openqa.selenium.By;

import static helper.Utility.driver;

public class Input {
    By input_loginUsername = By.id("loginusername");
    By input_loginPassword = By.id("loginpassword");
    By input_signUsername = By.id("sign-username");
    By input_signPassword = By.id("sign-password");
    By input_name = By.id("name");
    By input_country = By.id("country");
    By input_city = By.id("city");
    By input_card = By.id("card");
    By input_month = By.id("month");
    By input_year = By.id("year");

    public void inputLoginUsername(String username){
        driver.findElement(input_loginUsername).sendKeys(username);
    }
    public void inputLoginPassword(String password){
        driver.findElement(input_loginPassword).sendKeys(password);
    }
    public void inputSignUsername(String sgUsername){
        driver.findElement(input_signUsername).sendKeys(sgUsername);
    }
    public void inputSignPassword(String sgPassword){
        driver.findElement(input_signPassword).sendKeys(sgPassword);
    }
    public void inputName(String name){
        driver.findElement(input_name).sendKeys(name);
    }
    public void inputCountry(String country){
        driver.findElement(input_country).sendKeys(country);
    }
    public void inputCity(String city){
        driver.findElement(input_city).sendKeys(city);
    }
    public void inputCard(String card){
        driver.findElement(input_card).sendKeys(card);
    }
    public void inputMonth(String month){
        driver.findElement(input_month).sendKeys(month);
    }
    public void inputYear(String year){
        driver.findElement(input_year).sendKeys(year);
    }
}
