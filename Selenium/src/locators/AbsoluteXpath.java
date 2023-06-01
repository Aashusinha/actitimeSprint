package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("file:///C:/Users/lion/Desktop/Xpath.html");
	    driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys(" aashu");
	    driver.findElement(By.xpath("//div[1]/input[2]")).sendKeys(" monu");
	    driver.findElement(By.xpath("//div[2]/input[1]")).sendKeys(" pappu");
	    driver.findElement(By.xpath("//div[1]/input[1]")).sendKeys(" bholu");

	}

}
