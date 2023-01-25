package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import Context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends BaseClass {
	
	
	TestContext testContext;
	public LoginStepDef(TestContext context) {
		testContext = context;
		driver = testContext.getWebDriverManagerSetup().getDriver();
		loginPg= testContext.getPageObjectManager().getLoginPage();
		productsPg=	testContext.getPageObjectManager().getProductsPage();
		cartPg=	testContext.getPageObjectManager().getCartPage();
	}

	
	
	/*
	 * @Given("User launches the browser") public void user_launches_the_browser() {
	 *
	 * driver = testContext.getWebDriverManagerSetup().getDriver();
	 * 
	 * }
	 */
	  
	@Given("Open the url {string}") public void Open_the_url(String url) {
	  driver.get(url);
	 }
	 

	@When("user enter valid username {string} and password {string}")
	public void user_enter_valid_username_and_password(String user, String pwd) throws InterruptedException {
	  Thread.sleep(3000);
	 // pageObjectManager = new PageObjectManager(driver);
	  
	  // loginPg = pageObjectManager.getLoginPage();
		loginPg.enterEmail(user);
	   loginPg.enterPassword(pwd);
	}

	@When("Click on login")
	public void click_on_login() {
	    loginPg.clickOnLogin();
	}
	   
	@Then("User should be redirected to {string}")
	public void user_should_be_redirected_to(String expectedurl) {
	    String currenturl=driver.getCurrentUrl();
	    if(currenturl.equals(expectedurl)) {
	    	Assert.assertTrue(true);
	    }
	    else
	    	Assert.assertTrue(false);
	}	
	/////////invalid login/////////////
	@When("user enter invalid username {string} and password {string}")
	public void user_enter_invalid_username_and_password(String user1, String pwd1) throws InterruptedException {
		Thread.sleep(3000);
		loginPg.enterEmail(user1);
	   loginPg.enterPassword(pwd1);
	}

	@Then("Message should be {string}")
	public void message_should_be(String errormsg) {
		if(driver.getPageSource().contains(errormsg))
		    	Assert.assertTrue(true); 
		    else
		    	Assert.assertTrue(false);
		}	
	
//	 @After
//	    public void tearDown() {
//	       testContext.getDriver().quit();
//	    }
	
//	@After
//	public void end(Scenario sc) throws IOException {
//	if(sc.isFailed()==true) {
//	String FilePath="D:\\Test1\\BDDcucumberProject\\Screenshot\\failedscrshot.png";
//	TakesScreenshot scrShot=(TakesScreenshot) driver;
//	File srcFile= scrShot.getScreenshotAs(OutputType.FILE);
//
//	File destFile= new File(FilePath);
//
//	FileUtils.copyFile(srcFile, destFile);
//
//	}
//	 testContext.getWebDriverManagerSetup().closeDriver();
//	}

}