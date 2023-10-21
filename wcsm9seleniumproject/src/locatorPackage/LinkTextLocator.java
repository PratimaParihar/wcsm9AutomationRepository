package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Prime/Desktop/wcsm9Webelement/Link.html");
		Thread.sleep(2000);
		//identify link by using  LinkText 
		driver.findElement(By.linkText("seleniumLink")).click();
	
	}
}
