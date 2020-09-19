package TestNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  
	  String ActualTitle = driver.getTitle();
	  String ExpectedTitle = "Facebook – log in or sign up";
	  
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
  }
  @Test
  public void Login()
  {
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://www.facebook.com");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close(); 
  }

}
