package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	static WebDriver driver;
	public static WebDriver init() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://techfios.com/billing/?ng=login/after/dashboard");
		return driver;
	}
	
	public WebDriver tearDown() {
		driver.close();
		driver.quit();
		return driver;
	}

}
