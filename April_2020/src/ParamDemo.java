import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamDemo {
	public static WebDriver driver;
	@Test(retryAnalyzer = RetryAnalyzer.class)
	@Parameters("browser")
	public void ParameterizedTest(String browser)
	{
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("open chrome browser");
			driver.get("http://www.google.com");
			String Title = "Google1";
			String Actual_title=driver.getTitle();
			Assert.assertEquals(Title, Actual_title);
		}
		else if(browser.equalsIgnoreCase("mozilla")) {
			System.setProperty("webdriver.gecko.driver","D://geckodriver.exe");
			driver=new FirefoxDriver();
			System.out.println("open Firefox browser");
			driver.get("http://www.google.com");
		}
		
		}
}
