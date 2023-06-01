package POMrepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenerateStaleElementRefExeception {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("trainee");
		driver.navigate().refresh();
		Thread.sleep(4000);
		username.sendKeys("admin");//ek baar refresh ho jane ke baad hum-
								  //-same refrence variable use ni kr skte
	}

}
