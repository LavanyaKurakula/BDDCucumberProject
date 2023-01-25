Feature: Add, remove and checkout Products

Background: launch the app and login
Given Open the url "https://www.saucedemo.com/" 
And user enter invalid username "standard_user" and password "secret_sauce"
And Click on login
Then User should be redirected to "https://www.saucedemo.com/inventory.html"

@check
Scenario: Adding products to the cart 
When Click on AddToCart button for Items
|Items|
|Sauce Labs Backpack|
|Sauce Labs Bike Light|
Then Items should be added to cart
|Items|
|Sauce Labs Backpack|
|Sauce Labs Bike Light|

@demo2
Scenario: Removing products from the cart 
When Click on AddToCart button for Items
|Items|
|Sauce Labs Backpack|
|Sauce Labs Bike Light|
Then Items should be added to cart
|Items|
|Sauce Labs Backpack|
|Sauce Labs Bike Light|
When User click on remove button for Items
|Items|
|Sauce Labs Backpack|
|Sauce Labs Bike Light|
Then Items should be removed from cart
|Items|
|Sauce Labs Backpack|
|Sauce Labs Bike Light|

@run
Scenario: Checkout products in the cart 
When Click on AddToCart button for Items
|Items|
|Sauce Labs Backpack|
|Sauce Labs Bike Light|
Then Items should be added to cart
|Items|
|Sauce Labs Backpack|
|Sauce Labs Bike Light|
When User go to cart page
And Click on checkout button
And Fill the checkout info with firstname "My" lastname "name" zipcode "566007"
And Click on continue button
Then User should be redirected to "https://www.saucedemo.com/checkout-step-two.html"
When click on finish button
Then Message should be "THANK YOU FOR YOUR ORDER"

