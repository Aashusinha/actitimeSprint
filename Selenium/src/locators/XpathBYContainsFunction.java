package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBYContainsFunction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.selenium.dev/");
		 String para = driver.findElement(By.xpath("//p[contains(text(),'If you want to create robus')]")).getText();
		 System.out.println(para);

	}

}
