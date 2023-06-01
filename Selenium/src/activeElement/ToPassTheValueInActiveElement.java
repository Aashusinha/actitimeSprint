package activeElement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPassTheValueInActiveElement {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement activeEle = driver.switchTo().activeElement();
		activeEle.sendKeys("hello");
		activeEle.sendKeys(Keys.ENTER);
	}

}
