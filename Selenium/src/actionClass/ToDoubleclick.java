package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDoubleclick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		WebElement button = driver.findElement(By.id("add"));
		
		//WebElement button = driver.findElement(By.xpath("(//button[@type=\"button\"])[1]"));
		 Actions action = new Actions(driver);
		 action.doubleClick(button).perform();

	}

}
