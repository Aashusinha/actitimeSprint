package testNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//test Annotated class
public class ToVerifyFB {
	//@test annotated method
		@Test
		public void toVerifyGoogle() {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.facebook.com/");
			System.out.println("before");
			Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign ");
			System.out.println("pass");
		}

}
