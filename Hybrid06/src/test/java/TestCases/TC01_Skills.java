package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.Loginpage;
import Pages.SkillsPage;


public class TC01_Skills {
	
	WebDriver driver;
	

  @Test
  public void SkillsTest() throws InterruptedException {
	  
	  
	  driver =new ChromeDriver(); 
		driver.manage().window().maximize() ;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
       Loginpage p1 =new Loginpage();
       p1.LoginPageDriver(driver);
       p1.Loginpage("Admin","admin123");
       
       SkillsPage s1=new SkillsPage();
       s1.SkillsPageDriver(driver);
       s1.creted_skills_record3("Testing1","Testing2");
       
       
       HomePage h1=new HomePage();
       h1.HomePageDriver(driver);
       h1.closeBrowser();
       
		
  }
}
