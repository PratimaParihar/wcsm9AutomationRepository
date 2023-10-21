package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	public static void main(String[] args) throws InterruptedException {
		//launch the chrome browser
		WebDriver driver =new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//launch web page
		driver.get("http://desktop-hbul4k6/login.do");
		//take source code of login page
		String loginPageSourceCode = driver.getPageSource();
		System.out.println(loginPageSourceCode);
		//stop the script for 2 sec
		Thread.sleep(2000);
		//close all the browser 
		driver.quit();

	}

}
