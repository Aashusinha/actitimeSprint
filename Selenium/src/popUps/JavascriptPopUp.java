package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavascriptPopUp {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoqa.com/alerts");
	driver.findElement(By.id("alertButton")).click();
	driver.switchTo().alert().accept();
	
	driver.findElement(By.id("confirmButton")).click();
	driver.switchTo().alert().dismiss();
	
	
	
	Actions action = new Actions(driver);
	action.sendKeys(Keys.PAGE_DOWN).perform();
	
	driver.findElement(By.id("promtButton")).click();
	Alert alert = driver.switchTo().alert();
	
	String alertMessage = alert.getText();
	System.out.println(alertMessage);
	
	alert.sendKeys("qsp");
	alert.accept();
	

	}

}
