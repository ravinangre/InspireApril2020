import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FBDemo {
@Test
public void demo() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
	WebDriver  driver = new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	WebElement Username = driver.findElement(By.xpath("//*[@id='email']"));
	WebElement Password = driver.findElement(By.xpath("//*[@id='pass']"));
	WebElement loginButton = driver.findElement(By.xpath("//*[@name='login']"));
	Username.sendKeys("8830158607");
	Password.sendKeys("9423111564");
	loginButton.click();
	Thread.sleep(5000);
	String Expected_user= "Ravi B";
	String Actual_user = driver.findElement(By.xpath("//div[contains(text(),'Ravi B')]")).getText();
	
	Assert.assertEquals(Actual_user, Expected_user);
	
	String Expected_title = "Facebook";
	String Actual_title = driver.getTitle();
	Assert.assertEquals(Actual_title, Expected_title);
	
	WebElement dropdownButton = driver.findElement(By.xpath("//*[@id='userNavigationLabel']"));
	
	dropdownButton.click();
	
	WebElement LogoutLink = driver.findElement(By.xpath("//span[contains(text(),'Log Out')]"));
	
	LogoutLink.click();
	
	driver.close();
	
	
	
	
	}
}
