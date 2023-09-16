package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;
    private final By btnAddToCart = By.id("add-to-cart-sauce-labs-backpack");
    private final By btnName = By.id("remove-sauce-labs-backpack");
    private final By badgeCart = By.className("shopping_cart_badge");
    private final By iconShoppingCart = By.className("shopping_cart_link");

    private final By ProductQuantity = By.className("cart_quantity");
    private final By ProductName = By.className("inventory_item_name");
    private final By ProductDescription = By.className("inventory_item_desc");
    private final By ProductPrice = By.className("inventory_item_price");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAddToCart() {
        driver.findElement(btnAddToCart).click();
    }

    public String getButtonName() {
        return driver.findElement(btnName).getText();

    }

    public String getShoppingCartIconQuantity() {
        return driver.findElement(badgeCart).getText();

    }

    public void clickOnShoppingCartIcon(){
        driver.findElement(iconShoppingCart).click();
    }

    public String getCartProductName(){
        return  driver.findElement(ProductName).getText();
    }

    public String getCartProductQuantity(){
        return driver.findElement(ProductQuantity).getText();
    }

    public String getCartProductDescription(){
        return driver.findElement(ProductDescription).getText();
    }

    public String getCartProductPrice(){
        return driver.findElement(ProductPrice).getText();
    }

}
