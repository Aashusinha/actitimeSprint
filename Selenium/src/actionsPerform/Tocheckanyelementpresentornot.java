package actionsPerform;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tocheckanyelementpresentornot {

	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement grocry = driver.findElement(By.xpath("//img[@alt='Grocery']"));
		
		 
		if(grocry.isDisplayed()) {
			System.out.println("matched");
			grocry.click();
			String newGrocrywindow = driver.getCurrentUrl();
			driver.switchTo().newWindow(WindowType.TAB);
			driver.navigate().to(newGrocrywindow);
			
		
		}
		else
			System.out.println("unmatched");
		
		driver.quit();

	}

}
