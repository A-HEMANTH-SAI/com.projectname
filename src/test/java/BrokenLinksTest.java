
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrokenLinksTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com/");
		ArrayList<String> al=new ArrayList<String>();
		Thread.sleep(6000);
		List<WebElement> l=driver.findElements(By.tagName("a"));
		System.out.println("Total links captured :"+l.size());
		for(WebElement t:l) {
			try {
		String eachLink=t.getAttribute("href");
		URL url=new URL(eachLink);
		HttpURLConnection h=(HttpURLConnection)url.openConnection();
		int resCode=h.getResponseCode();
		if(resCode>=400) {
			al.add(eachLink);
			System.out.println(eachLink +"----->"+ resCode );
		}
		}
		catch(ClassCastException e) {}
		catch(MalformedURLException e) {}
		catch(StaleElementReferenceException e) {}
	}
		
		System.out.println("Broken links size: "+al.size());
	}
	
}