package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.ShoppingCartPage;
import support.WebDriverManager;

import static org.junit.Assert.assertEquals;


public class ShoppingCartSteps {

    private WebDriver driver;
    private HomePage homePage;
    private ShoppingCartPage shoppingCartPage;
    private String productQuantity;
    private String productName;
    private String productDescription;
    private String productPrice;

    public ShoppingCartSteps() {
        this.driver = WebDriverManager.getDriver();
        this.homePage = new HomePage(driver);
        this.shoppingCartPage = new ShoppingCartPage(driver);
    }

    @When("the user clicks on Add to cart button")
    public void the_user_clicks_on_add_to_cart_button() {
        homePage.clickOnAddToCart();
    }
    @Then("the button change the name to Remove")
    public void the_button_change_the_name_to_remove() {
        assertEquals(homePage.getButtonName(), "Remove");
    }

    @Then("the shopping cart icon increases by one")
    public void the_shopping_cart_icon_increases_by_one() {
        assertEquals("1", homePage.getShoppingCartIconQuantity());
    }

    @When("the user clicks on Add to cart button to the product {string}")
    public void the_user_clicks_on_add_to_cart_button_to_the_product() {
        homePage.clickOnAddToCart();
    }
    @Then("the product is added to the shopping cart")
    public void the_product_is_added_to_the_shopping_cart() {
        homePage.clickOnShoppingCartIcon();
        productDescription = homePage.getCartProductDescription();
        productName = homePage.getCartProductName();
        productPrice = homePage.getCartProductPrice();
        productQuantity = homePage.getCartProductQuantity();
    }

    @Then("the user sees the cart with the corresponding product name, description and price")
    public void the_user_sees_the_cart_with_the_corresponding_product_name_description_and_price() {
        assertEquals(productDescription,shoppingCartPage.getCartProductDescription());
        assertEquals(productPrice, shoppingCartPage.getCartProductPrice());
        assertEquals(productName, shoppingCartPage.getCartProductName());
        assertEquals(productQuantity, shoppingCartPage.getCartProductQuantity());
    }

}
