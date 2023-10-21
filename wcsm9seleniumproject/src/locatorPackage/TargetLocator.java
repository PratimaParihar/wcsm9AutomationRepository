package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TargetLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//to launch web page
		driver.get("file:///C:/Users/Prime/Desktop/wcsm9Webelement/SimpleLogin.html");
	
		//identify usernameTB and pass input as "admin" 
		driver.findElement(By.tagName("input")).sendKeys("admin");
		
		//identify passwordTB and pass input as "manager" 
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("manager");
		
	}

}
