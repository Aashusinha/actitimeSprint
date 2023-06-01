package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("file:///C:/Users/lion/Desktop/automation.html");
	    
	    WebElement username = driver.findElement(By.id("12345"));
	    username.sendKeys("qsp");
	    WebElement pswrd = driver.findElement(By.name("abhi"));
	    pswrd.sendKeys("1234");
	   
	    
	    

	}

}
