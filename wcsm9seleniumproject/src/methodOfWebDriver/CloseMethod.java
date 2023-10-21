package methodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
	public static void main(String[] args) throws InterruptedException {
		//launch the chrome browser
	WebDriver driver=new ChromeDriver();
	//launch web page
	driver.get("http://omayo.blogspot.com/");
	//maximize the Chrome browser
	driver.manage().window().maximize();
	//stop the script for 2 sec
	Thread.sleep(2000);
	//click on open a pop window link...
	driver.findElement(By.partialLinkText("Open a popup window")).click();		
	//to close the browser
	driver.close();
	}
}
