package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToFrame {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://jqueryui.com/draggable/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame(frame);
		WebElement box = driver.findElement(By.id("draggable"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(box, 50, 90).perform();
		
		
		//abhi control jo frame ke andar tha usko switchTo().defaultContent() method se bahr laaye hai
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("API documentation")).click();

	}

}
