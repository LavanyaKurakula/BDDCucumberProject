package stepDefinitions;

import org.openqa.selenium.WebDriver;
import managers.PageObjectManager;
import pageObjects.CartPage;
import pageObjects.CheckoutOverviewPage;
import pageObjects.CheckoutPage;
import pageObjects.LoginPage;
import pageObjects.ProductsPage;

public class BaseClass {
	public WebDriver driver;
	public LoginPage loginPg;
	public ProductsPage productsPg;
	public CartPage cartPg;
	public CheckoutPage checkoutPg;
	public CheckoutOverviewPage checkoutOverviewPg;
	public PageObjectManager pageObjectManager;
}
