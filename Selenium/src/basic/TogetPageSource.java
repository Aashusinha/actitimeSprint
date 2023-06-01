package basic;

import org.openqa.selenium.edge.EdgeDriver;

public class TogetPageSource {

	public static void main(String[] args) {
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://demo.actitime.com/login.do");
	String pageSource = driver.getPageSource();
	 
	if(pageSource.contains("actitime")) {
		System.out.println("matched");
	
	}
	else
		System.out.println("unmatched");
	
	driver.quit();
		
	
	

	}

}
