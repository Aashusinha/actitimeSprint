package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("file:///C:/Users/lion/Desktop/Xpath.html");
	    driver.findElement(By.xpath("html/body/div[2]/input[2]")).sendKeys(" aashu");
	    driver.findElement(By.xpath("html/body/div[1]/input[1]")).sendKeys(" aashu");
	    driver.findElement(By.xpath("html/body/div[2]/input[1]")).sendKeys(" aashu");
	    driver.findElement(By.xpath("html/body/div[1]/input[2]")).sendKeys(" aashu");
	}

}
