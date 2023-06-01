package testNg;


import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	//@test annotated method
			@Test
			public void demo() {
				String a="abc";
				String b="abc";
				Assert.assertEquals(a, b);
				System.out.println("pass");
				
				
			}

	

}
