package p2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class q2 {

	public String baseURL = "http://demo.guru99.com/test/newtour/";
	static String driverURL = "C:\\Users\\Battl\\Downloads\\chromedriver-win64\\chromedriver.exe";
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Launching Chrome");
        System.setProperty("webdriver.chrome.driver", driverURL);
        WebDriver driver = new ChromeDriver();  
      	driver.get("http://demo.guru99.com/test/newtours");
        Thread.sleep(1500);
        String expected = "Welcome: Mercury Tours";
        String actual = driver.getTitle();
        System.out.println(actual);
        System.out.println(expected.equals(actual));
        driver.quit();
	}

}
