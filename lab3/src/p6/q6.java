package p6;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class q6 {
	
	@Test
	public void executeSessionOne() {
		System.out.println("Launching Chrome");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Battl\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4");
        WebElement tb = driver.findElement(By.name("uid"));
		tb.sendKeys("Driver 1");
	}
	@Test
	public void executeSessionTwo() {
		System.out.println("Launching Chrome");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Battl\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4");
        WebElement tb = driver.findElement(By.name("uid"));
		tb.sendKeys("Driver 2");
	}
	@Test
	public void executeSessionThree() {
		System.out.println("Launching Chrome");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Battl\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4");
        WebElement tb = driver.findElement(By.name("uid"));
		tb.sendKeys("Driver 3");
	}
}
