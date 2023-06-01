package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToprintchildIDandParentId {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String parentId = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allIds = driver.getWindowHandles();
		
		for(String id:allIds) {
			driver.switchTo().window(id);
			if(!id.equals(parentId)) {
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
				
				
			}
		}
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());


	}

}
