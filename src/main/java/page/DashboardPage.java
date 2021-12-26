package page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {
	WebDriver driver;
	
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement  dashboard_header_element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement  Customer_element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement  Add_Customer_element;
	
	public void verifyDashboard() {
		
		assertassertEquals(dashboard_header_element.getText(), "Dashboard", "Wrong page! please try again");
	}
	
	public void clickCustomerButton() {
		Customer_element.click();
	}
	
	public void addCustomerButton() {
		Add_Customer_element.click();
	}

	private void assertassertEquals(String text, String string, String string2) {
		// TODO Auto-generated method stub
		
	}
}
