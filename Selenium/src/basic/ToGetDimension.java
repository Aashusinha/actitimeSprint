package basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;

public abstract class ToGetDimension {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		Dimension dimension = driver.manage().window().getSize();
		System.out.println(dimension);
		Dimension newDim=new Dimension(200,200);
		driver.manage().window().setSize(newDim);//tosetsize
		Thread.sleep(5000);
		driver.quit();
		

	}

}
