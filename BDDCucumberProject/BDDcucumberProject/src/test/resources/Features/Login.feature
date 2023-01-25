Feature: Validate Login
@demo
Scenario Outline: Validate Login with valid credentials 

Given Open the url "https://www.saucedemo.com/" 
And user enter valid username "<username>" and password "<password>"
And Click on login
Then User should be redirected to "https://www.saucedemo.com/inventory.html"

Examples:
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|

@demo1
Scenario: Validate Login with invalid credentials 
Given Open the url "https://www.saucedemo.com/" 
And user enter invalid username "admin" and password "admin"
And Click on login
Then Message should be "Username and password do not match any user in this service"

