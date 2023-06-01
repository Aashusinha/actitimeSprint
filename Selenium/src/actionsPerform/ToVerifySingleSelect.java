package actionsPerform;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifySingleSelect {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement dayElement = driver.findElement(By.id("day"));
		
		
		Select select = new Select(dayElement);
		boolean multiple = select.isMultiple();
		
		if(multiple) {
			System.out.println("the drop dwn is multiselect");
		}
		else
			System.out.println("the drop dwn is singleselect");

	}

}
