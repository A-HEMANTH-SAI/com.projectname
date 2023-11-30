import org.testng.Assert;
import org.testng.Reporter;

public class HardAssertTest {

	
	public void testMethod1() {
		Reporter.log("----line1----",true);
		Reporter.log("----line2----",true);
		Assert.assertEquals("s","s","customized msg");
		Reporter.log("----line3----",true);
		Reporter.log("----line4----",true);
		Reporter.log("----line5----",true);
		
		
	}
}
