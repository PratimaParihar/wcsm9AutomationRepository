package assingmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLoginPage {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("abcdef");
	driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("123456");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(@class,'acap')]")).click();
	Thread.sleep(2000);
	driver.quit();
	}

}
