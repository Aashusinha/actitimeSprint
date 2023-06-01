package testNg;

import org.testng.annotations.Test;

public class C {
	@Test(invocationCount = 3)
	public void a() {
		System.out.println("OH");
	}
	
	@Test
	public void b() {
		System.out.println("jane");
	}
	
	@Test
	public void c() {
		System.out.println("jana");
	}
}
