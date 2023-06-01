package actionsPerform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyTagname {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String tagname = driver.findElement(By.id("username")).getTagName();
		//first we find element of textfield and get tagname
		if(tagname.contains("input")) {
			//then we check tagname is input or not
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(3000);
			System.out.println("passed");
		}
		
		else
			System.out.println("error:");
		
	

	}

}
