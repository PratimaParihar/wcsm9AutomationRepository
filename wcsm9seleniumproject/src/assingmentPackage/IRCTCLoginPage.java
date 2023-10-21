package assingmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTCLoginPage {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		//driver.switchTo().activeElement().sendKeys("pune");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(@class, 'fa fa-window-close')]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8 ')]")).sendKeys("pune",Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@aria-autocomplete, 'list')]")).sendKeys("patna");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='27']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class, 'ng-tns-c65-12 ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'search_btn train_Search')]")).click();
		
		
	}

}
