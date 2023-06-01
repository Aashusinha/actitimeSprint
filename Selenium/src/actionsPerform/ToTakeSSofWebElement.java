package actionsPerform;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeSSofWebElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		File source = driver.findElement(By.name("login")).getScreenshotAs(OutputType.FILE);
		File destination = new File("./ScreenShot/loginButton.png");
		Files.copy(source, destination);
	}

}
