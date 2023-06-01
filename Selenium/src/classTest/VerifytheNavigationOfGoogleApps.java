package classTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifytheNavigationOfGoogleApps {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		Testdata data = new Testdata();
		 String URL = data.FetchdatafromExcel("Sheet1", 13, 2);
		 String Calendar = data.FetchdatafromExcel("Sheet1", 15, 2);
		 
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get(URL);
			
			driver.findElement(By.xpath("//a[@aria-expanded='false']")).click();
			
			WebElement frame = driver.findElement(By.name("app"));
			driver.switchTo().frame(frame);
			
			driver.findElement(By.xpath("//span[text()='Calendar']")).click();
			String Title = driver.getTitle();
			if(Title.contains(Calendar)) {
				System.out.println("The user is redirected to the selected Google service.");
			}
			else
				System.out.println("The user is not redirected to the selected Google service.");
			
			driver.close();
	}

}
