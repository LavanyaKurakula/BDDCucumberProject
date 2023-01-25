package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {

	public CheckoutOverviewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="finish")
	WebElement finishbutn;
	
	public void clickOnFinishButn() {
		finishbutn.click();
	}

}
