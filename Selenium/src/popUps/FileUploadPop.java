package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class FileUploadPop {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531");
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Pattern filename = new Pattern("F:\\Javaprog\\eclipse\\Selenium\\textFile2.png");
		Pattern openButton= new Pattern("F:\\Javaprog\\eclipse\\Selenium\\orignalopenbutton.png");
		
		Screen screen = new Screen();
		screen.wait(filename, 20);
		screen.type(filename, "F:\\Javaprog\\eclipse\\Selenium\\Automation 1.docx.pdf");
		Thread.sleep(2000);
		screen.click(openButton);
	}

}
