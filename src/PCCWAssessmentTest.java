import org.openqa.selenium.By;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PCCWAssessmentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoke chromedriver.exe
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/nesel/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// go to Practice Test Automation 
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		//userName
		WebElement userName =  driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("student");
		
		//password
		WebElement password =  driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Password123");
		
		//Submit
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		//Successful Login
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds	(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='post-title']")));
		driver.quit();
	}

}
