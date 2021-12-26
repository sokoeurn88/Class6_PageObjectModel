package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	//creating constructor to this class for bringing driver from LonginTest.java
	public LoginPage(WebDriver driver){
		this.driver = driver;
		
	}
	
	
	//class associate with method, variable=attribute=field	//Java associate class and obj.
	


	// storing element with By Class
	By userNameField = By.xpath("/html/body/div/div/div/form/div[1]/input");
	By userPasswordField = By.xpath("/html/body/div/div/div/form/div[2]/input");
	By userLoginField = By.xpath("/html/body/div/div/div/form/div[3]/button");
	
	//no ByClass or WebElement work with page object model.
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[1]/input") WebElement USER_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[2]/input") WebElement USER_PASSWORD;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement USER_LOGIN;
	
	public void insertUserName(String userName) {
		
		USER_ELEMENT.sendKeys(userName);
		
	}
	
	public void insertPassWord(String userPassword) {
		
		USER_PASSWORD.sendKeys(userPassword);
		
	}
	
	public void clikcLoginButton() {
		USER_LOGIN.click();
	}
	
}
