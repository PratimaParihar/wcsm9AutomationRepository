package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OranageHRMLoginLocator {
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.tagName("input")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("admin123");
		
		}
}
