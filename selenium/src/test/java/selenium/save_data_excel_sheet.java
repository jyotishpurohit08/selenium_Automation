package selenium;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class save_data_excel_sheet {

	public static void main(String[] args) {
		
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Sheet1");

		//Create a row and add some data to it
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Data 1");
		cell = row.createCell(1);
		cell.setCellValue("Data 2");

		//Save the workbook to a file
		try {
		    FileOutputStream outputStream = new FileOutputStream("file.xlsx");
		    workbook.write(outputStream);
		    workbook.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}

	}

}
