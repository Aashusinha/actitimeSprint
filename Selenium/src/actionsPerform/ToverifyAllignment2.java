package actionsPerform;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyAllignment2 {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/login/");
			
			
			Point usernameTextFieldPos=driver.findElement(By.xpath("(//div[@class=\"clearfix _5466 _44mg\"])[1]")).getLocation();
			Point pswrdTextFieldPos=driver.findElement(By.xpath("(//div[@class=\'clearfix _5466 _44mg\'])[2]")).getLocation();
			
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
