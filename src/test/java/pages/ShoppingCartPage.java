package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {

    private final WebDriver driver;

    private final By cartProductQuantity = By.className("cart_quantity");
    private final By cartProductName = By.className("inventory_item_name");
    private final By cartProductDescription = By.className("inventory_item_desc");
    private final By cartProductPrice = By.className("inventory_item_price");


    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCartProductName(){
       return  driver.findElement(cartProductName).getText();
    }

    public String getCartProductQuantity(){
        return driver.findElement(cartProductQuantity).getText();
    }

    public String getCartProductDescription(){
        return driver.findElement(cartProductDescription).getText();
    }

    public String getCartProductPrice(){
        return driver.findElement(cartProductPrice).getText();
    }
}
