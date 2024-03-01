package Util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;
import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ExcelUtil1 {

	String filePath;
	String sheetName;
	File file;
	FileInputStream fis;
	Workbook wb;
	public ExcelUtil1(String filePath) {
		this.filePath= filePath;
		this.sheetName=sheetName;
		 file= new File(this.filePath);
		 try {
			fis= new FileInputStream(file);
			 wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public int getRowCount(String sheetName) {
		int index = wb.getSheetIndex(sheetName);
		if (index == -1)
			return 0;
		else {
			Sheet sheet  = wb.getSheetAt(index);
			int number = sheet.getLastRowNum() + 1;
			return number;
		}

	}
	public Object getDataFromCell(String sheet,int row, int col) {
		Sheet ws =wb.getSheet(sheet);
		
		Row r = ws.getRow(row);
		
		Cell cell = r.getCell(col);
		CellType celltype =cell.getCellType();
		if(celltype==CellType.STRING) {
			return cell.getStringCellValue();
		}else if(celltype== CellType.NUMERIC) {
			return cell.getNumericCellValue();
		}else {
			return null;
		}
	}
	
	public Object[][] getDataFromExcel(String sheet) {
		Sheet ws =wb.getSheet(sheet);
		int totalRowCount = ws.getLastRowNum()-ws.getFirstRowNum();
		Object arr[][]= new Object[totalRowCount+1][];
		for(int i=0;i<=totalRowCount;i++) {
			Row r = ws.getRow(i);
			int n= r.getLastCellNum();
			arr[i]= new Object[r.getLastCellNum()];
			for(int j=0;j<r.getLastCellNum();j++) {
				Cell cell = r.getCell(j);
				CellType celltype =cell.getCellType();
				if(celltype==CellType.STRING) {
					arr[i][j]= cell.getStringCellValue();
				}else if(celltype== CellType.NUMERIC) {
					arr[i][j]= cell.getNumericCellValue();
				}
			}
			
		}
		return arr;
		
		
	}
	
	
	
	
	
}
