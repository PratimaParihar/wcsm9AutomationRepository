package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		// to launch chrome we need create obj of ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome is open!!");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Chrome is close!!");
		
	}
	
}
