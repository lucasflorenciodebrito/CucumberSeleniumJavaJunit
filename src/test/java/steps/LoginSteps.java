package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import support.WebDriverManager;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

    private WebDriver driver;
    private LoginPage loginPage;

    public LoginSteps() {
        this.driver = WebDriverManager.getDriver();
        this.loginPage =  new LoginPage(driver);
    }

    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        loginPage.accessLoginPage();
    }
    @When("user enters {string} and {string}")
    public void user_enters_a_valid_username_and_password(String username, String password) {
        loginPage.insertUserCredentials(username, password);
        loginPage.clickOnLoginButton();
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
      assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }

    @After
    public void afterScenario() {
        WebDriverManager.quitDriver();
    }

}
