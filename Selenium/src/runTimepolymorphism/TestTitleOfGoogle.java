package runTimepolymorphism;

import org.openqa.selenium.WebDriver;

public class TestTitleOfGoogle {
	public static void test(WebDriver driver) {
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		
		if(title.contains("Google")) {
			System.out.println("pass");
		}
		else
			System.out.println("failed");
		
		driver.quit();
	}

}
