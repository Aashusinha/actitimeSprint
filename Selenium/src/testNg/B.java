package testNg;

import org.testng.annotations.Test;

public class B {
	@Test(priority=3)
	public void Aashu() {
		System.out.println("Name=Aashu");
	}
	
	@Test(priority=1)
	public void golu() {
		System.out.println("Name=golu");
	}
	
	@Test(priority=2)
	public void conu() {
		System.out.println("Name=Conu");
	}

}
