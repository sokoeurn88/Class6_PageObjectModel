package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest extends BrowserFactory {
	WebDriver driver;
	
	
	// login data
	String userName = "demo@techfios.com";
	String userPassword = "abc123";

	
	
	@Test
	public void verifiedUserLogin() {
				
		
		// calling method from different package by creating class name obj and extend
		// class as well.

		BrowserFactory bf = new BrowserFactory();
		driver = bf.init();
		System.out.println(driver.getTitle());
		
		//calling loginPage class
//		LoginPage lp = new LoginPage();		//this obj will not be help		//do not have ability to take something from other class.
		
		//need help from PageFactory
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);	//constuctor to bring driver to LoginPage by creating  a method and bring thid driver
		login.insertUserName(userName);
		login.insertPassWord(userPassword);
		login.clikcLoginButton();
		
		DashboardPage dbp = PageFactory.initElements(driver, DashboardPage.class);
		dbp.verifyDashboard();
		
		driver = bf.tearDown();
		
	}
}
