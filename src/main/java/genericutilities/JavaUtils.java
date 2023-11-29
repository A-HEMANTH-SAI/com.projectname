package genericutilities;
import java.util.Date;
import java.util.Random;

public class JavaUtils {
	
	Random ran=new Random();
	public int randomNumber(int orign, int bound) {	
		return ran.nextInt(orign, bound);
	}
	
	public int randomNumber(int bound) {
		return ran.nextInt(bound);
	}
	
	public int randomNumber() {
		return ran.nextInt();
	}
	
	public String getSysDate() {
		Date date=new Date();
		return date.toString();
	}
}
