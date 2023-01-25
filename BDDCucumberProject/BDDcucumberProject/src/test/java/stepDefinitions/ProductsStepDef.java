package stepDefinitions;

import java.util.List;

import org.testng.Assert;

import Context.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsStepDef extends BaseClass {

	TestContext testContext;
	public ProductsStepDef(TestContext context) {
		testContext = context;
		productsPg=	testContext.getPageObjectManager().getProductsPage();
		cartPg=	testContext.getPageObjectManager().getCartPage();
		 checkoutPg = testContext.getPageObjectManager().getCheckoutPage();
		 checkoutOverviewPg= testContext.getPageObjectManager().getCheckoutOverviewPage();
	}
	
////////////////Add to cart///////////////////

@When("Click on AddToCart button for Items")
public void click_on_add_to_cart_button_for_items(DataTable additems) throws InterruptedException {
Thread.sleep(3000);
List<String> itemsneeded = additems.asList();
productsPg.clickOnAddToCartButn(itemsneeded);
}

@Then("Items should be added to cart")
public void items_should_be_added_to_cart(DataTable addeditems) throws InterruptedException {
Thread.sleep(3000);
productsPg.clickOnCarticon();
List<String> added_items = addeditems.asList();
boolean result=cartPg.addedToCart(added_items);
Assert.assertEquals(result, true);

}
///////////////////Remove from cart///////////////////////
@When("User click on remove button for Items")
public void user_click_on_remove_button_for_items(DataTable addeditems) {
List<String> added_items = addeditems.asList();
cartPg.clickOnRemoveButn(added_items);

}

@Then("Items should be removed from cart")
public void items_should_be_removed_from_cart(DataTable addeditems) {
productsPg.clickOnCarticon();
List<String> added_items = addeditems.asList();
boolean result=cartPg.removedFromCart(added_items);
Assert.assertEquals(result, true);

}

/////////////////////checkout//////////////////////

	@When("User go to cart page")
	public void user_go_to_cart_page() {
		productsPg.clickOnCarticon();
	}
	
	@When("Click on checkout button")
	public void click_on_checkout_button() {
	    cartPg.clickOnCheckoutButn();
	}
	
	@When("Fill the checkout info with firstname {string} lastname {string} zipcode {string}")
	public void fill_the_checkout_info_with_firstname_lastname_zipcode(String firstname, String lastname, String zipcode) {
	    checkoutPg.enterFistname(firstname);
	    checkoutPg.enterLastname(lastname);
	    checkoutPg.enterZipcode(zipcode);
	}
	
	@When("Click on continue button")
	public void click_on_continue_button() {
		checkoutPg.clickOnContinueButn();
	}

	@When("click on finish button")
	public void click_on_finish_button() {
	  checkoutOverviewPg.clickOnFinishButn();
	}

	
}
