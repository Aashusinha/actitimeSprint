package actionsPerform;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
         WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lion/Desktop/Xpath.html");
		WebElement Atxtfld = driver.findElement(By.xpath("//input[@value='A']"));
		WebElement Btxtfld =driver.findElement(By.xpath("//input[@value='B']"));
		
		Dimension dim1 = Atxtfld.getSize();
		Dimension dim2 = Btxtfld.getSize();
		
		int w1 = dim1.getHeight();
		int w2 = dim2.getHeight();
		
		if(dim1.equals(dim2))
		{
			System.out.println("A and B are same");
		}
		else
			System.out.println("notsame");
		

	}

}
