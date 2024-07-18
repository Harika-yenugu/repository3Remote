package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.JobsPage;
import Pages.Loginpage;
import Pages.SkillsPage;


public class TC01_Jobs {
	
	WebDriver driver;
	

  @Test
  public void JobsTest() throws InterruptedException {
	  
	  
	  driver =new ChromeDriver(); 
		driver.manage().window().maximize() ;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
       Loginpage p1 =new Loginpage();
       p1.LoginPageDriver(driver);
       p1.Loginpage("Admin","admin123");
       
       JobsPage j1=new JobsPage();
       j1.JobsPageDriver(driver);
       j1.addjobs("Sales0","Sales1", "Sales2");
       
       HomePage h1=new HomePage();
       h1.HomePageDriver(driver);
       h1.closeBrowser();
       
		
  }
}
