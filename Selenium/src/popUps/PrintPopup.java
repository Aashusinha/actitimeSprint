package popUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class PrintPopup {

	public static void main(String[] args) throws AWTException, InterruptedException, FindFailed {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_P);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Pattern filename = new Pattern("F:\\Javaprog\\eclipse\\Selenium\\FilenameButton.png");
		Pattern saveButton= new Pattern("F:\\Javaprog\\eclipse\\Selenium\\saveButton2.png");
		
		Screen screen = new Screen();
		screen.wait(filename, 20);
		screen.type(filename, "screenshot");
		Thread.sleep(20);
		screen.click(saveButton);
		
		
		
		

	}

}
