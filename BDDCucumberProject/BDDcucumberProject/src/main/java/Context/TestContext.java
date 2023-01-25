package Context;

import managers.PageObjectManager;
import managers.WebDriverManagerSetup;

public class TestContext {
	
		private WebDriverManagerSetup webDriverManagerSetup;
		private PageObjectManager pageObjectManager;
		
		public TestContext(){
			webDriverManagerSetup = new WebDriverManagerSetup();
			pageObjectManager = new PageObjectManager(webDriverManagerSetup.getDriver());
		}
		
		public WebDriverManagerSetup getWebDriverManagerSetup() {
			return webDriverManagerSetup;
		}
		
		public PageObjectManager getPageObjectManager() {
			return pageObjectManager;
		}
	}