package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LuanchFireFoxBrowser {
	public static void main(String[] args) throws InterruptedException {
	// to launch FireFox we need create obj of FireFoxDriver();
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("FireFox is open !!");
		Thread.sleep(2000);
		driver.close();
		System.out.println("FireFox is close !!");
	}
}
