package basic;

import org.openqa.selenium.edge.EdgeDriver;

public class ToPerformBrowserHistoryNavigation {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.facebook.com/login/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();

	}

}
