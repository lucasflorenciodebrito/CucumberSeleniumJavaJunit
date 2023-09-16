Feature: Shopping Cart

  Background: user is logged in
    Given the user is on login page
    When user enters "standard_user" and "secret_sauce"
    Then user is navigated to the home page

  Scenario: Add product to shopping cart changes button name
    When the user clicks on Add to cart button
    Then the button change the name to Remove

  Scenario: Add product to shopping cart increases cart icon
    When the user clicks on Add to cart button
    Then the shopping cart icon increases by one

  Scenario: Correct product is added to cart
    When the user clicks on Add to cart button
    Then the product is added to the shopping cart
    And the user sees the cart with the corresponding product name, description and price






