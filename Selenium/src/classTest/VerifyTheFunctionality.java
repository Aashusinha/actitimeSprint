package classTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheFunctionality {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		Testdata data = new Testdata();
		 String URL = data.FetchdatafromExcel("Sheet1", 5, 2);
		 String SearchQuerybar = data.FetchdatafromExcel("Sheet1", 6, 2);
		 
		 
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(URL);
		
		WebElement searchbar = driver.findElement(By.name("q"));
		searchbar.sendKeys(SearchQuerybar);
		
		WebElement searchButton = driver.findElement(By.name("btnK"));
		searchButton.click();
		
		String actualtitle = driver.getTitle();
		
		if(actualtitle.contains(SearchQuerybar)) {
			System.out.println("The search results page displayed with relevant search results.");
		}
		else
			System.out.println("The search results page not displayed with relevant search results.");
		
		
		
		
		
		
		
		
		
		
	}


}
