package basic;

import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

public class ToGetPosition {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos.getX());
		System.out.println(pos.getY());
		
		Point point = new Point(300,200);
		driver.manage().window().setPosition(point);
		driver.quit();

	}

}
