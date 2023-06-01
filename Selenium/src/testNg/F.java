package testNg;

import org.testng.annotations.Test;

public class F {
	@Test(groups="smoke",priority=1)
	public void SignUp() {
		System.out.println("the user has signedUp");
	}
	@Test(groups="smoke",priority=2)
	public void SignIn() {
		System.out.println("the user has signedin");
	}
	
	@Test(groups="regression",priority=3)
	public void Compose() {
		System.out.println("the user has composed the mail");
	}
}
