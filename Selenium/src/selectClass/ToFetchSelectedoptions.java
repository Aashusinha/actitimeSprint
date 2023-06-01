package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToFetchSelectedoptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/select-menu");
		
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		
		
		Select select = new Select(dropdown);
		
		select.selectByValue("volvo");
		Thread.sleep(2000);
		select.selectByVisibleText("Saab");
		Thread.sleep(2000);
		select.selectByVisibleText("Opel");
		Thread.sleep(2000);
		
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		for(WebElement options:selectedOptions) {
			System.out.println(options.getText());
		}
		String firstselect = select.getFirstSelectedOption().getText();
		System.out.println(firstselect);
	}

}
