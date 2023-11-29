import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class HardAssertTest {


	public void testMethod1() {
		SoftAssert sa=new SoftAssert();
		Reporter.log("----line1----",true);
		Reporter.log("----line2----",true);
		sa.fail();
		Reporter.log("----line3----",true);
		Reporter.log("----line4----",true);
		Reporter.log("----line5----",true);
		
		
	}
}
