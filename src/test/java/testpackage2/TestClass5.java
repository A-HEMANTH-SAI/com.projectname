package testpackage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass5 {
	
	@Test
	public void test1() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String browser=System.getProperty("BROWSER");
		driver.get(browser);
		Reporter.log(browser+" OPENED SUCCESSFULLY", true);
		Reporter.log(System.getProperty("NAME"),true);
		driver.quit();
		Reporter.log(browser+" CLOSED SUCCESSFULLY",true);
		
	}

}
