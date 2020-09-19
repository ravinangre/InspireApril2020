package TestNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupsDemo {
	WebDriver driver;
    // Saving the expected title of the Webpage
    String title = "ToolsQA - Demo Website For Automation";
    
   
    @BeforeMethod(groups = {"sanity","regression" }) 
    public void starting_point(){
    	System.out.println("This is the starting point of the test");
    	//Initialize Chrome Driver
    	//driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");	
     driver = new ChromeDriver();
     driver.get("https://demoqa.com/");
    }
    
    
    @Test(groups = { "sanity" }) 
    public void checkTitle() { 
       String testTitle = "ToolsQA";
       String originalTitle = driver.getTitle();
      Assert.assertEquals(originalTitle, testTitle);
    } 
    
    @Test(groups = { "regression" }) 
    public void click_element() { 
       driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img")).click();
        System.out.println("Home Page heading is displayed"); 
    }
    @Test(groups = { "regression" }) 
    public void click_element1() { 
       driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/a/img")).click();
        System.out.println("Home Page heading is displayed"); 
    }
    @AfterMethod(groups = {"sanity", "regression" }) 
    public void teardown()
    {
    	driver.close();
    }
    
}
