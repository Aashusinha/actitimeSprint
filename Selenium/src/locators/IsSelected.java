package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		
		WebElement checkbox= driver.findElement(By.id("keepLoggedInCheckBox"));
		checkbox.click();
		Thread.sleep(5000);
		boolean selected = checkbox.isSelected();
		
		if(selected) {
			System.out.println("pass");
		}
		else
			System.out.println("fail");

	}

}
