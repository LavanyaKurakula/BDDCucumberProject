package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class CartPage {

	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='cart_contents_container']//div[@class='cart_list']//div[@class='inventory_item_name']")
	List<WebElement> cartItems;
	
	@FindBy(id="checkout")
	WebElement checkoutbutn;
	
	@FindBy(xpath="//button[text()='Remove']")
	List<WebElement> removeButns;
	
	public boolean addedToCart(List<String> added_items) {
		boolean result = true;
		for (int i=0; i<cartItems.size(); i++)
		{
			String item=cartItems.get(i).getText();
			if(!added_items.contains(item)) { 
				result=false;
				return result;
			}
		}
		 return result;
	}
	
	public void clickOnRemoveButn(List<String> itemsneeded) {
		for(int i=0;i<cartItems.size();i++) {
			String cartitem=cartItems.get(i).getText();
	    	 if(itemsneeded.contains(cartitem))

	    	    {
	    		 removeButns.get(i).click(); 
	    	    }
		}
		 
	}
	
	public boolean removedFromCart(List<String> added_items) {
		boolean result = true;
		for (int i=0; i<cartItems.size(); i++)
		{
			String item=cartItems.get(i).getText();
			if(added_items.contains(item)) { 
				result=false;
				return result;
			}
		}
		 return result;
	}

	public void clickOnCheckoutButn() {
		checkoutbutn.click();
	}
}
