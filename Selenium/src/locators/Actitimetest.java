package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimetest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String expectedErrormsg = "Username or Password";
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']")).getText();
	
		
		
		if(text.contains(expectedErrormsg)) {
			System.out.println("matched");
		
		}
		else
			System.out.println("unmatched");
		
		driver.quit();


	}

}
