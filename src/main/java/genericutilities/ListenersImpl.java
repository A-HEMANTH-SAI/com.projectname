package genericutilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImpl implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		TakesScreenshot t=(TakesScreenshot)BaseClass.ssdriver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/"+result.getName()+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
