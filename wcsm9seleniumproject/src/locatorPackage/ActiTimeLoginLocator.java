package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginLocator {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://desktop-hbul4k6/login.do");
		//identify usernameTB and pass input as "admin"
		//driver.findElement(By.tagName("input")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		//identify passwordTB and pass input as "manager" 
		Thread.sleep(2000);
		//driver.findElement(By.tagName("input")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();		
	}

}
