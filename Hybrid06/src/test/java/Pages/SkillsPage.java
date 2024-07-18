package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SkillsPage {

	
	 WebDriver driver;
	 
	 
	 public void SkillsPageDriver(WebDriver driver1) {
			
			this.driver=driver1;
			
			
			
		}

	 public void creted_skills_record3(String SkillName,String SkillDescr )throws InterruptedException   {
			
			
			
		  
					//Admin
					driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
							
					//Qualificcaations
					driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
					
					//Skills
					driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
							

					//Add
					driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
					
					//Skill Name
					driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SkillName);
					
					//Skill Descr
					driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SkillDescr);
					
					//Save button
					driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
					
					Thread.sleep(5000);
				}
			}

