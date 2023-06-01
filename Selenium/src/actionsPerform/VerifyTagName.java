package actionsPerform;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTagName {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lion/Desktop/automation.html");
		String tagname = driver.findElement(By.id("12345")).getTagName();
		System.out.println(tagname);

	}

}
