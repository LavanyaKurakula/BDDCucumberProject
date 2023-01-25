package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class PageObjectManager {
	
		private WebDriver driver;

		private ProductsPage productsPage;

		private CartPage cartPage;

		private LoginPage loginPage;

		private CheckoutPage checkoutPage;

		private CheckoutOverviewPage checkoutOverviewPage;

		public PageObjectManager(WebDriver driver) {

			this.driver = driver;

		}

		public LoginPage getLoginPage(){

			return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;

		}

		public ProductsPage getProductsPage() {

			return (productsPage == null) ? productsPage = new ProductsPage(driver) : productsPage;

		}

		public CartPage getCartPage() {

			return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;

		}

		public CheckoutPage getCheckoutPage() {

			return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;

		}
		
		public CheckoutOverviewPage getCheckoutOverviewPage() {

			return (checkoutOverviewPage == null) ? checkoutOverviewPage = new CheckoutOverviewPage(driver) : checkoutOverviewPage;

		}
	}

