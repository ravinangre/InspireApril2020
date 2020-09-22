import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	public WebDriver driver;
	@Test(dataProvider="facebookdata")
	public void logintofacebook(String sUsername, String sPassword) throws InterruptedException{

		   System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		   
		   driver = new ChromeDriver();
		 
		      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		      driver.get("https://www.facebook.com");
		 
		      driver.manage().window().maximize();
		      
		      driver.findElement(By.xpath("//input[@id='email']")).sendKeys(sUsername);
				 
		      driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(sPassword);
		 
		      driver.findElement(By.xpath("//button[@name='login']")).click();
		      
		      String title=driver.getTitle();
		      
		     // Assert.assertEquals(title, "(3) Facebook");
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

	@DataProvider(name="facebookdata")
	public Object [][] passData()
	{
		return new Object[][] {
			{"9423111564","8830158607"}, 
			{"8830158607","7875888498"},
			{"123456","5647895"},
			{"5678588","58745874"}
			};
		}
}
		/*Object[][] data=new Object [4][2];
		
		data[0][0]="admin";
		data[0][1]="admin123";
		
		data[1][0]="9423111564";
		data[1][1]="7875888498";
		
		data[2][0]="32548";
		data[2][1]="2587545";
		
		data[3][0]="587578";
		data[3][1]="258745";
		return data; */
