package genericutilities;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class PropertyFileUtils {
	Properties pw=new Properties();
	public void putPropertyData(String key, String value) throws IOException {
		pw.setProperty(key, value);
	}
	public void savePropertyData() throws IOException {
		FileOutputStream fos=new FileOutputStream(IPathConstants.PROPERTY_PATH);
		pw.store(fos,"Write Data");
	}
	public String readPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream(IPathConstants.PROPERTY_PATH);
		pw.load(fis);
		return pw.getProperty(key);
	}
}
