package basic;

import org.openqa.selenium.edge.EdgeDriver;

public class ToFetchWindowId {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		String windowId1 = driver.getWindowHandle();
		System.out.println(windowId1);
		
		EdgeDriver driver2=new EdgeDriver();
		String windowId2 = driver2.getWindowHandle();
		System.out.println(windowId2);

	}

}
