package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialTextLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Prime/Desktop/wcsm9Webelement/Link.html");
		Thread.sleep(2000);
		//identify by using partialLinkText
		driver.findElement(By.partialLinkText("seleniumLink")).click();
		//Thread.sleep(2000);

	}

}