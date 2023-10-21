package methodOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v113.indexeddb.model.Key;

public class SwicthTo {
	public static void main(String[] args) throws InterruptedException {
		
	
	//to launch chrome Browser
		WebDriver driver =new ChromeDriver();
		//maximize the chrome browser
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//stop the script for 2 sec
		//switch control to active elements
		driver.switchTo().activeElement().sendKeys("selenium", Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
}

}
