package Session46;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SwagLabs {

	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
				
		
	}
	
	@Test(priority = 1)
	void testLogo() {
		
		boolean status = driver.findElement(By.xpath("//div[@class='login_logo']")).isDisplayed();
		Assert.assertEquals(status, true);
		
	}
	
	@Test(priority = 2)
	void testURL() {
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.comm/");
	}
	
	@Test(priority = 3 , dependsOnMethods = {"testURL"})
	void testTitle() {
		
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
	}
	
	@AfterClass
	void teardown() {
		driver.quit();
	}
	
	
}
