package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel implements IConstant {
	public String getDataFromExcel(String sheet, int rownum, int colnum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(excel_path);
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheet).getRow(rownum).getCell(colnum).toString();
	}

}
