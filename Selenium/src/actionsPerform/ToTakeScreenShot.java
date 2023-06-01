package actionsPerform;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		TakesScreenshot ts = (TakesScreenshot)driver;//dwncasting
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./ScreenShot/error.png");
		Files.copy(source, destination);

	}

}
