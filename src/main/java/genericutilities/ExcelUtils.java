package genericutilities;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelUtils {

	public String readOneCellData(String sheetName,int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(IPathConstants.EXCEL_PATH);
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	}
	
	public void setOneCellData(String sheetName,int rowIndex,int cellIndex,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(IPathConstants.EXCEL_PATH);
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(rowIndex).createCell(cellIndex).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(IPathConstants.EXCEL_PATH);
		wb.write(fos);	
	}
}
