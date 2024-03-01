package selenium;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xcel_data_read {

	String filePath;
	String sheetName;
	File file;
	FileInputStream fis;
	Workbook wb;
	public Xcel_data_read(String filePath, String sheetName)  {
		
		this.filePath=filePath;
		this.sheetName=sheetName;
		file=new File(this.filePath);
		try {
			
		fis=new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public  Object getDataFromCell(String sheetName, int row, int col) {
		Sheet ws=wb.getSheet(sheetName);
		Row r=ws.getRow(row);
		Cell cell = r.getCell(col);
		CellType celltype=cell.getCellType();
		if(celltype==CellType.STRING) {
			return cell.getStringCellValue();
		}else if(celltype==CellType.NUMERIC) {
			return cell.getNumericCellValue();
		}else {
			return null;
			
		}
		
	}
}












