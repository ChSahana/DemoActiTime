package Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void test() {
		Reporter.log("Test passed",true);
	}

}
