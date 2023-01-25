package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
WebDriver driver;
	
	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='inventory_item_description']//div[@class='inventory_item_name']")
	List<WebElement> productNames;
	
	
	@FindBy(xpath ="//div[@id='inventory_container']/div[@class='inventory_list']/div[@class='inventory_item']//button")
	List<WebElement> addToCartButns;
	
	@FindBy(id="shopping_cart_container")
	WebElement carticon;
	
	
	
	public void clickOnAddToCartButn(List<String> itemsneeded) {
		for(int i=0;i<productNames.size();i++) {
			String productName=productNames.get(i).getText();
	    	 if(itemsneeded.contains(productName))
	    	    {
	    		 addToCartButns.get(i).click(); 
	    	    }
		}
	}
	
	public void clickOnCarticon() {
		carticon.click();
	}

	
	
	
}