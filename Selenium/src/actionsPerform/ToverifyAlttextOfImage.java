package actionsPerform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyAlttextOfImage {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String alttxt = driver.findElement(By.xpath("src=\"https://rukminim1.flixcart.com/image/200/200/xif0q/cases-covers/back-cover/j/i/6/mycas-black-vv-y35-qcase-original-imagj87uwxzarrzk.jpeg?q=70\"")).getAttribute("title");
			if(alttxt.contains("for Vivo Y35")) {
				System.out.println("pass");
			}
			else
				System.out.println("fail");
			
			driver.quit();
	}

}
