package assingmentPackage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLoginPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch the netflix
		driver.get("https://www.netflix.com/in/Login");
		driver.findElement(By.className("placeLabel")).click();
		driver.switchTo().activeElement().sendKeys("abcdefg");

		Thread.sleep(2000);
		
		driver.findElement(By.id("id_password")).sendKeys("123456");
		driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
	
	}

}
