package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("file:///C:/Users/lion/Desktop/Xpath.html");
	    driver.findElement(By.xpath("//input[@value='A']")).sendKeys(" aashu");
	    driver.quit();
	    

	}

}
