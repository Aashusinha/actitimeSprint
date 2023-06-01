package actionsPerform;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyOverlap {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/lion/Desktop/automation.html");
			
			
			Rectangle usernameTextFieldPos=driver.findElement(By.id("12345")).getRect();
			Rectangle pswrdTextFieldPos=driver.findElement(By.id("123456")).getRect();
			
			int yCordinateOfuserName = usernameTextFieldPos.getY();
			int HeightOfuserName =usernameTextFieldPos.getHeight();
				
			int endofUsername = yCordinateOfuserName + HeightOfuserName;
	}

}
