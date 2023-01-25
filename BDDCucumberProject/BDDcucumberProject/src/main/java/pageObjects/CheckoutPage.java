package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	WebDriver driver;
	public CheckoutPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first-name")
	WebElement firstname;
	
	@FindBy(id="last-name")
	WebElement lastname;
	
	@FindBy(id="postal-code")
	WebElement zipcode;
	
	@FindBy(id="continue")
	WebElement continuebutn;
	
	public void enterFistname(String firstname1) {
		firstname.sendKeys(firstname1);
	}
	
	public void enterLastname(String lastname2) {
		lastname.sendKeys(lastname2);
	}
	
	public void enterZipcode(String pincode) {
		zipcode.sendKeys(pincode);
	}
	
	public void clickOnContinueButn() {
		continuebutn.click();
	}
	
}
