package basic;
 
import org.openqa.selenium.edge.EdgeDriver;

public class OpenActitime {

	public static void main(String[] args) {
		 EdgeDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		

	}

}
