package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;
    private final By txtUsername = By.id("user-name");
    private final By txtPassword = By.id("password");
    private final By btnLogin = By.id("login-button");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void accessLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void insertUserCredentials(String username, String password) {
        driver.findElement(txtUsername).sendKeys(username);
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void clickOnLoginButton() {
        driver.findElement(btnLogin).click();
    }


}
