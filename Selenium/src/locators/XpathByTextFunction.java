package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTextFunction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("file:///C:/Users/lion/Desktop/automation.html");
	  String header = driver.findElement(By.xpath("//h1[text()=' Salenium First Page ']")).getText();
	  System.out.println(header);

	}

}
