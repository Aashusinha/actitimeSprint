package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String productName = "APPLE iPhone 11 (Black, 128 GB)";//for dynamicXpath
		String productPrice = "₹45,999";//for dynamicXpath
		
		 driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		 String price = driver.findElement(By.xpath("//div[text()='"+productName+"' ]/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='"+productPrice+"']")).getText();
		 System.out.println(price);
	}

}
