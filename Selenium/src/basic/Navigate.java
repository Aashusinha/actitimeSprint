package basic;

import org.openqa.selenium.edge.EdgeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();

	}

}
