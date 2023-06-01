package testNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ToVerifyGoogleOnChromeAndEdge {
	//@test annotated method
	
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void toVerifyGoogle(String browser) {
		
		if(browser.equals("chrome")) {
			 driver=new ChromeDriver();
		}
		
		if(browser.equals("edge")) {
			 driver=new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
		
		
		if(driver.getTitle().equals("Google")) {
			System.out.println("pass:the title is verified");
		}
		else
			System.out.println("fail:the title is not verified");
		
	}

}
