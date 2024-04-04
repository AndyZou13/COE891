package p5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class q5p2 {

	public static String baseURL = "https://www.google.com/";
	static String driverURL = "C:\\Users\\Battl\\Downloads\\chromedriver-win64\\chromedriver.exe";
	public static WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		System.out.println("Launching Chrome");
        System.setProperty("webdriver.chrome.driver", driverURL);
        driver = new ChromeDriver(); 
	}
	@BeforeTest
	public void launchGoogle() {
		driver.get(baseURL);
		Assert.assertEquals("Google", driver.getTitle());
	}
	@BeforeTest
	public void performSearchAndClick1stLink() throws InterruptedException {
		WebElement tb = driver.findElement(By.id("APjFqb"));
		tb.sendKeys("Facebook");
		Thread.sleep(1000);
		WebElement btn = driver.findElement(By.name("btnK"));
		btn.click();
	}
	@Test
	public void FacebookPageTitleVerification() throws InterruptedException {
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		Thread.sleep(1000);
	}
	@AfterTest
	public void driverExit() {
		driver.close();
	}
}
