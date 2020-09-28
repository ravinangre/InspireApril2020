import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(ListnerDemo.class)
public class CrossBrowser {
	public WebDriver driver;

	  @Parameters("browser")

	  @BeforeClass

	  // Passing Browser parameter from TestNG xml

	  public void beforeTest(String browser) {

	  // If the browser is Firefox, then do this

	  if(browser.equalsIgnoreCase("firefox")) {
		 
	//Initializing the firefox driver (Gecko)
		  System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		  driver = new FirefoxDriver();	  

	  }else if (browser.equalsIgnoreCase("chrome")) { 

		  //Initialize the chrome driver
		  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		  driver = new ChromeDriver();

	  } 

	  // Enter the website address in the browser

	  driver.get("https://www.demoqa.com"); 
	  System.out.println("Thread ID Is : " + Thread.currentThread().getId());
	  }

	  // Once Before method is completed, Test method will start

	  @Test public void ClickLogo() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img")).click();

		}  

	  @Test(enabled=false)
	  public void SkipTest1()
	  {
		  System.out.println("Skip Test");
	  }
	  
	  @Test
	  public void FailDemo()
	  {
		  Assert.assertTrue(true);
	  }
	  @AfterClass public void afterTest() {

			driver.quit();

		}
	  @Test  // Skip Test
		public void SkipTest() {
			throw new SkipException("Skipping The Test Method ");
		}
	  private int i = 1;

		@Test (successPercentage = 60, invocationCount = 3) //Failing Within Success
		public void AccountTest() {
				if(i < 2)
					Assert.assertEquals(i , i);
			i++;
		}

}
