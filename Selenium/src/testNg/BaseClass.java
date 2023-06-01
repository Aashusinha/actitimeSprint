package testNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POMrepo.HomePage;
import POMrepo.LoginPage;

public class BaseClass {
	//Preconditions
	public WebDriver driver;
	
	@BeforeSuite
	public void bs() {
		System.out.println("database conection established");
	}
	
	@BeforeClass
	public void bc() {
		driver=new ChromeDriver();
		System.out.println("The browser has been launched");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		
		System.out.println("The Url has been navigated");
	}
	
	@BeforeMethod
	public void bm() {
		LoginPage login = new LoginPage(driver);
		login.loginAction("admin", "manager");
		System.out.println("Logged in to the browser");
		
	}
	
	
	//@test 
	//yahn pe rahega jahn pe hamara main script hoga
	/*{
		//ToverifyHomePage
		
	    }*/
	
	
	
	
	//PostConditions
	@AfterMethod
	public void am() {
		HomePage home = new HomePage(driver);
		home.LogoutAction();
		System.out.println("Logged out from the browser");
		
	}
	@AfterClass
	public void Ac() {
		driver.quit();
		System.out.println("The browser has been closed");
		
	}
	
	@AfterSuite
	public void As() {
		System.out.println("database conection closed");
	}

}
