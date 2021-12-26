package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddContactPage {
	WebDriver driver;
	
	public AddContactPage(WebDriver driver) {
		this.driver = driver;		//this.driver=driver in AddContactPage and driver= WebDriver driver parameterize from AddContactTest.
	}
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement Full_Name_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement Company_Name_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") WebElement Email_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]") WebElement Phone_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]") WebElement Country_Element;	//onyly copy <select tag>
	
	public void insertContact(String username) {
		Full_Name_Element.sendKeys(username);		
	}
	
	public void selectCompanyNameElement(String text) {
		Select sel = new Select(Company_Name_Element);
		sel.selectByVisibleText(text);
		
	}
	
	public void insertEmai(String email) {
		Email_Element.sendKeys(email);
	}
	
	public void insertPhone(String phone) {
		Phone_Element.sendKeys(phone);
	}
	
	public void selectCountry(String countrytext) {
		Select sel1 = new Select(Country_Element);
		sel1.selectByVisibleText(countrytext);
		
	}
}
