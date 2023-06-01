package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnSuggestion {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("shukla");
		//Thread.sleep(2000);
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//span[contains(text(),'ukla')]"));
		System.out.println(autosuggestion);
		System.out.println("the no of suggestion: "+autosuggestion.size());
		for(WebElement suggestion:autosuggestion) {
			if(suggestion.getText().contains("paksha")) {
				suggestion.click();
			}
		}

	}

}
