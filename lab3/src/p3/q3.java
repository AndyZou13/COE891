package p3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class q3 {

	public static String baseURL = "http://www.facebook.com";
	static String driverURL = "C:\\Users\\Battl\\Downloads\\chromedriver-win64\\chromedriver.exe";
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Launching Chrome");
        System.setProperty("webdriver.chrome.driver", driverURL);
        driver = new ChromeDriver();  
      	driver.get(baseURL);
        Thread.sleep(1500);
        WebElement element = driver.findElement(By.id("email"));
        System.out.println(element.getTagName());
        driver.quit();
	}
}
