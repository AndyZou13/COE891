package p4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class q4 {

	public static String baseURL = "https://lambdatest.github.io/sample-todo-app/";
	static String driverURL = "C:\\Users\\Battl\\Downloads\\chromedriver-win64\\chromedriver.exe";
	public static WebDriver driver;
	
	@BeforeTest
	public void start() throws InterruptedException {
		System.out.println("Launching Chrome");
        System.setProperty("webdriver.chrome.driver", driverURL);
        driver = new ChromeDriver();  
      	driver.get(baseURL);
        Thread.sleep(1500);
        WebElement element1 = driver.findElement(By.name("li2"));
        WebElement element2 = driver.findElement(By.name("li4"));
        element1.click();
        element2.click();
        WebElement tb = driver.findElement(By.id("sampletodotext"));
        tb.clear();
        Thread.sleep(2000);
        tb.sendKeys("Andy");
        Thread.sleep(2000);
        WebElement btn = driver.findElement(By.id("addbutton"));
        btn.click();
	}
	
	@Test
	public void testValid() throws InterruptedException {
		List<WebElement> spans = driver.findElements(By.tagName("span"));
		for (WebElement span : spans) {
			if (span.getText().equals("Andy"))
				Assert.assertTrue(span.getText().equals("Andy"));
		}
		Assert.assertTrue(driver.findElement(By.name("li2")).isSelected());
		Assert.assertTrue(driver.findElement(By.name("li4")).isSelected());
	}
	@AfterTest
	public void breakdown() {
		driver.close();
	}
}
