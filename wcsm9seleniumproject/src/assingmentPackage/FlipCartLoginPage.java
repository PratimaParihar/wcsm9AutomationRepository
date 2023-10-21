package assingmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipCartLoginPage {
		public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable notifications-");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//handle hidden pop up
	//	driver.findElement(By.xpath("//span[text(),'']")).click();)
		Thread.sleep(2000);
		//identify search box and pass mobile as input
		driver.findElement(By.xpath("//div[@class='_2SmNnR']/descendant::input[@class='Pke_EE']")).sendKeys("mobile",Keys.ENTER);
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		//driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]")).click();
		}
}
