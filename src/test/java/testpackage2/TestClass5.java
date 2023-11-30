package testpackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass5 {

	@Test
	public void test1() {
		Reporter.log(System.getProperty("NAME"));
	}
	
	
	
}
