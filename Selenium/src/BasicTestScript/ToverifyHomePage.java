package BasicTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMrepo.HomePage;
import POMrepo.LoginPage;
import testNg.BaseClass;

public class ToverifyHomePage extends BaseClass {
	@Test
	public void toVerifyhomepage(){
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Enter"));
		String homepageTitle = driver.getTitle();
		
		
		
		Assert.assertTrue(homepageTitle.contains("Enter"));
		System.out.println("the home page has been verified");
			
		
		
		
		
		
		
		
		
	}

}
