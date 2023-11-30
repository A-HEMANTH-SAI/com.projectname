package testpackage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass5 {
	
	@Test
	public void test1() {
		WebDriver driver;
		String browser=System.getProperty("BROWSER");
		if(browser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		else if(browser.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
		else driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Reporter.log(browser+" OPENED SUCCESSFULLY", true);
		driver.get("URL");
		Reporter.log(driver.getTitle(),true);
		driver.quit();
		Reporter.log(browser+" CLOSED SUCCESSFULLY",true);
		
	}

}
