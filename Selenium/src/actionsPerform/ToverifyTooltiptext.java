package actionsPerform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyTooltiptext {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String tooltiptext = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		if(tooltiptext.contains("Do not select if this computer is shared")) {
			System.out.println("pass:verified");
		}
		else
			System.out.println("Fail:not verified");
		
		driver.quit();
	}

}
