package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		//Thread.sleep(5000);
		
		WebElement emailTextBox = driver.findElement(By.id("email"));
		boolean displayed = emailTextBox.isDisplayed();
		if(displayed) {
			System.out.println("pass");
			
		}
		else
			System.out.println("fail");

	}

}
