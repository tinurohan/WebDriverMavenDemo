package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
		driver = new ChromeDriver();	
		
	}
	
	@Test
	public void doLogin() {
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("tinu.mw@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("ABD");
		//driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();

			
	}
	
	@AfterSuite
	public void tearDown() {
		
		
		driver.quit();
	}
	

}
