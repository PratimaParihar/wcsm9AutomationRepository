package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.linkedin.com/hp");
		driver.findElement(By.id("session_key")).sendKeys("pkp@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("session_password")).sendKeys("pra@123");
		
	}

}
