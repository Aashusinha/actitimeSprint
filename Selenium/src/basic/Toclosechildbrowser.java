package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toclosechildbrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String parentid = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allid = driver.getWindowHandles();
		
		for(String id:allid) {
			driver.switchTo().window(id);
			if(!id.equals(parentid)) {
				Thread.sleep(3000);
				driver.close();
				
				
			}
		}

	}

}
