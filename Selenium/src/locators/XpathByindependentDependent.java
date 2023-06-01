package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByindependentDependent {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		 driver.findElement(By.xpath("//img[contains(@src,'ps://rukminim1.flixcart.com/fk-p-flap/128/128/image/d34810848b2895c9.pn')]")).click();


	}

}
