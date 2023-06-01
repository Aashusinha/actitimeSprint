package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testData/properties.properties");//root/foldername/filename.extension
		Properties property = new Properties();
		property.load(fis);
		
		 String urlFromPropertyFile = property.getProperty("url");
		 String usernameFromPropertyFile = property.getProperty("username");
		 String passwordFromPropertyFile = property.getProperty("password");
		 
		 System.out.println(urlFromPropertyFile);
		 System.out.println(usernameFromPropertyFile);
		 System.out.println(passwordFromPropertyFile);
		 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.manage().window().maximize();
		 driver.get(urlFromPropertyFile);
		 driver.findElement(By.id("username")).sendKeys(usernameFromPropertyFile);
		 WebElement passwordTeextField = driver.findElement(By.name("pwd"));
		 passwordTeextField.sendKeys(passwordFromPropertyFile);
		 passwordTeextField.sendKeys(Keys.ENTER);

		 
		

	}

}
