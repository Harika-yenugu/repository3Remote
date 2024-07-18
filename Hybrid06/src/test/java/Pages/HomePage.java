package Pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	
	public void HomePageDriver(WebDriver driver1) {
		
		this.driver=driver1;
		
		}
	public void Click_on_logout_button() {
		
	}
	
	
	public void closeBrowser() {
		
		
		driver.close();
		
	}
	

}
