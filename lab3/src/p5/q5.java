package p5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class q5 {

	public static String baseURL = "https://www.google.com/";
	static String driverURL = "C:\\Users\\Battl\\Downloads\\chromedriver-win64\\chromedriver.exe";
	public static WebDriver driver;
	
	@Test(priority = 1)
	public void openBrowser() {
		System.out.println("Launching Chrome");
        System.setProperty("webdriver.chrome.driver", driverURL);
        driver = new ChromeDriver(); 
	}
	@Test(priority = 2)
	public void launchGoogle() {
		driver.get(baseURL);
		Assert.assertEquals("Google", driver.getTitle());
	}
	@Test(priority = 3)
	public void performSearchAndClick1stLink() throws InterruptedException {
		WebElement tb = driver.findElement(By.id("APjFqb"));
		tb.sendKeys("Facebook");
		Thread.sleep(1000);
		WebElement btn = driver.findElement(By.name("btnK"));
		btn.click();
		WebElement search = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
		search.click();
		Thread.sleep(1000);
	}
	@Test(priority = 4)
	public void FacebookPageTitleVerification() throws InterruptedException {
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		Thread.sleep(1000);
	}
	@Test(priority = 5)
	public void driverExit() {
		driver.close();
	}
}
