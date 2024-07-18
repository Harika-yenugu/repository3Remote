package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	WebDriver driver;
	
	
	public void LoginPageDriver(WebDriver driver1) {
		
		this.driver =driver1;
		
		
	}
	
	public void OpenOrangeHRM(String TestURL) {
		
		driver.get(TestURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
	}
	public void Loginpage(String username1,String password1) throws InterruptedException {
		
		
		
		 driver.findElement(By.name("username")).sendKeys(username1);
		 driver.findElement(By.name("password")).sendKeys(password1);
		 driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  Thread.sleep(5000);
		
		
	}

}
