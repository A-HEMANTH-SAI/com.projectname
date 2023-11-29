package genericutilities;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
public class DataProviderClass {
	
	@DataProvider
	public Object[][] storeData() throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream(IPathConstants.EXCEL_PATH);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		int rowCount=sh.getLastRowNum();
		int cellCount=sh.getRow(0).getLastCellNum();
		Object[][] obj=new Object[rowCount][cellCount];
		System.out.println(rowCount+"  "+cellCount);
		for(int i=0;i<=rowCount-1;i++) {
			Row r=sh.getRow(i);
			for(int j=0;j<cellCount;j++) 
				obj[i][j]=r.getCell(j).getStringCellValue();
			System.out.println("row="+i);		
		}
		
		return obj;
	}

}
