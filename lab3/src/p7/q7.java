package p7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class q7 {

	public static String baseURL = "https://www.linkedin.com/login";
	static String driverURL = "C:\\Users\\Battl\\Downloads\\chromedriver-win64\\chromedriver.exe";
	public static WebDriver driver;
	
	@Test
	public void setup() throws InterruptedException {
		System.out.println("Launching Chrome");
        System.setProperty("webdriver.chrome.driver", driverURL);
        driver = new ChromeDriver(); 
        driver.get(baseURL);
        WebElement user = driver.findElement(By.id("username"));
        WebElement pass = driver.findElement(By.id("password"));
        user.sendKeys("");
        pass.sendKeys("");
        WebElement sub = driver.findElement(By.xpath("//button[contains(text(), 'Sign in')]"));
        sub.click();
        Thread.sleep(20000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.linkedin.com/feed/");
	}
}
