package genericutilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
public class BaseClass {
	public WebDriver driver;
	public static WebDriver ssdriver;
	public FileInputStream fis;
	public Properties p;
	
	@BeforeTest
	public void openBrowser() throws IOException {
		fis=new FileInputStream("./src/test/resources/commondata.property");
		p=new Properties();
		p.load(fis);
		String browser=p.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		else if(browser.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
		else System.out.println("Invalid browser selection");
		ssdriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("Open browser*****BEFORE TEST",true); 
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
		Reporter.log("Close Browser*****AFTER TEST",true);
	}
	@BeforeMethod
	public void login() throws InterruptedException {
		driver.get(p.getProperty("url"));
		driver.findElement(By.id("username")).sendKeys(p.getProperty("un"));
		driver.findElement(By.id("password")).sendKeys(p.getProperty("pw"));
		driver.findElement(By.id("submit")).click();
		Reporter.log("Enter URL Login to Application",true);
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.xpath("//a[.='Log out']")).click();
		Reporter.log("Logout of Application",true);
	}
}
