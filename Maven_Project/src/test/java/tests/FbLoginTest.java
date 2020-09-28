package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.FbHomePage;
import pages.FbLoginPage;
import pages.FbProfilePage;

public class FbLoginTest extends TestBase{
	
	@Test
	public void init() throws Exception{

			//driver.get("https://www.facebook.com");
			FbLoginPage loginpage = PageFactory.initElements(driver, FbLoginPage.class);
			loginpage.setEmail("8830158607");
			loginpage.setPassword("9423111564");
			loginpage.clickOnLoginButton();
			
			FbHomePage homepage = PageFactory.initElements(driver, FbHomePage.class);
			homepage.clickOnProfileDropdown();
			homepage.verifyLoggedInUserNameText();
			homepage.clickOnLogoutLink();	
			
		}
	

}
