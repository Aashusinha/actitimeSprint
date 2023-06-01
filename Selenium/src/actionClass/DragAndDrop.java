package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source1 = driver.findElement(By.id("box2"));
		WebElement destination1 = driver.findElement(By.id("box101"));
		
		WebElement source2 = driver.findElement(By.id("box7"));
		WebElement destination2 = driver.findElement(By.id("box107"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source1, destination1).perform();
		
		
		action.dragAndDrop(source2, destination2).perform();

	}

}
