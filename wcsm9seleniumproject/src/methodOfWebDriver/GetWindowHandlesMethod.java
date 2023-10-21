package methodOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		//take the address of current window or browser
		//parent browser...(the browser or window has controls)
		String parentHandle = driver.getWindowHandle();
		System.out.println("address of parent Browser or window "+parentHandle);
		Thread.sleep(2000);
		//click on open window
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		//get the address of parent as well as child browser
		Set<String> allHandles = driver.getWindowHandles();
		// print the address of browser use for each loop
		for (String wh : allHandles) {
			
			if (!parentHandle.equals(wh)) {
				
				System.out.println("address of child window :"+wh);
				
			} 
			else {
				System.out.println("address of parent window :"+wh);

			}
			
		}
		driver.quit();
	
	}
	

}
