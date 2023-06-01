package actionsPerform;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignment {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/lion/Desktop/automation.html");
			
			
			Point usernameTextFieldPos=driver.findElement(By.id("12345")).getLocation();
			Point pswrdTextFieldPos=driver.findElement(By.id("123456")).getLocation();
			
			int xCordinateOfuserName = usernameTextFieldPos.getX();
			int yCordinateOfuserName =usernameTextFieldPos.getY();
			
			
			int xCordinateOfpswrd = pswrdTextFieldPos.getX();
			int yCordinateOfpswrd = pswrdTextFieldPos.getY();
			
			
			
			if(xCordinateOfuserName== xCordinateOfpswrd)
			{
				System.out.println("pass");	
			}
			else
				System.out.println("fail");
			
			driver.quit();

	}

}
