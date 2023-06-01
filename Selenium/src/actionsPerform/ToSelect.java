package actionsPerform;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelect {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement dayElement = driver.findElement(By.id("day"));
		Select select = new Select(dayElement);
		select.selectByIndex(6);
		
		WebElement monthElement = driver.findElement(By.id("month"));
		Select select1 = new Select(monthElement);
		select1.selectByVisibleText("Mar");
		
		WebElement yearElement = driver.findElement(By.id("year"));
		Select select2 = new Select(yearElement);
		select2.selectByValue("1996");
		
		
		
		

	}

}
