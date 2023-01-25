package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


  public class WebDriverManagerSetup {
	  private WebDriver driver;
  
  public WebDriver getDriver() { 
	  WebDriverManager.chromedriver().setup();
  if(driver == null) driver = new ChromeDriver();
  return driver; 
  }
  }