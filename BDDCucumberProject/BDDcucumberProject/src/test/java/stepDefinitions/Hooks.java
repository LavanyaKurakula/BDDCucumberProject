package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass{
	
		TestContext testContext;
		public Hooks(TestContext context) {
			testContext = context;
			
	}
		@Before
		public void setUp() {
			driver = testContext.getWebDriverManagerSetup().getDriver();
			driver.manage().window().maximize();
		}
		
		@After
		public void end(Scenario sc) throws IOException {
			if(sc.isFailed()==true) {
				String FilePath="D:\\Test1\\BDDcucumberProject\\Screenshot\\failedscrshot.png";
				TakesScreenshot scrShot=(TakesScreenshot) driver;
				byte[] data= scrShot.getScreenshotAs(OutputType.BYTES);
				sc.attach(data, "image/png", "failedscreenshot");
//				File srcFile= scrShot.getScreenshotAs(OutputType.FILE);
//				File destFile= new File(FilePath);
//				FileUtils.copyFile(srcFile, destFile);

			}
			driver.quit();
		}
}
