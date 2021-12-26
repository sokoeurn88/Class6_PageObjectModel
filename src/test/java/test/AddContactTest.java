package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest extends BrowserFactory {
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToAddCustomer() {
		
		driver = BrowserFactory.init();
		
		//need help from PageFactory
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);	//constuctor to bring driver to LoginPage by creating  a method and bring thid driver
		login.insertUserName("demo@techfios.com");
		login.insertPassWord("abc123");
		login.clikcLoginButton();
				
		DashboardPage dbp = PageFactory.initElements(driver, DashboardPage.class);
		dbp.verifyDashboard();
		
		dbp.clickCustomerButton();
		dbp.addCustomerButton();
		
		AddContactPage addcontactpage = PageFactory.initElements(driver, AddContactPage.class);		//when passing driver in here, we need to make a constructor method in AddContactPage.Class to make a connect between this driver and driver in AddCustomerPage
		addcontactpage.insertContact("Sokoeurn chhay");
		addcontactpage.selectCompanyNameElement("Personal Company");
		addcontactpage.insertEmai("sokoeurn.chhaya@gmail.com");
		addcontactpage.insertPhone("501 215 3790");
		addcontactpage.insertPhone("501 215 3790");
		addcontactpage.selectCountry("Hong Kong");
		
		
		
		
		
		BrowserFactory bf = new BrowserFactory();
//		driver = bf.tearDown();
		
	}
	

}
