package selenium;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class write_data_excel {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"http://epds.bihar.gov.in/RCList_Village_Wise.aspx?Village_Code_PMO=1020901116801307&&Village_Name_PMO=Araria%20(Nagar%20Parishad)&&Panchayat_Code_PMO=000377&&Panchayat_Name_PMO=Araria%20(Nagar%20Parishad)&&District_Code_PMO=209&&District_Name_PMO=Araria&&Tahsil_Code_PMO=01116&&Tahsil_Name_PMO=Araria");
		driver.manage().window().maximize();
		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("student Details");

		Map<String, Object[]> data = new TreeMap<String, Object[]>();

		data.put("1", new Object[] { "S.NO", "Ration Card", "Card Type", "Ration Card Holder Name", "Father Name",
				"Number of Family Members", "FPS Dealer" });
		data.put("2", new Object[] { 1, "102090111680130700000001", "PHH", "मसो. साहिक खातून", "श्र्वगीय इसराइल", "3",
				"प्रदीप कुमार पासवान\r\n" + "(120900100026)" });
		data.put("3", new Object[] { 2, "102090111680130700000001", "PHH", "मसो. साहिक खातून", "श्र्वगीय इसराइल", "3",
				"प्रदीप कुमार पासवान\r\n" + "(120900100026)" });
		data.put("4", new Object[] { 3, "102090111680130700000001", "PHH", "मसो. साहिक खातून", "श्र्वगीय इसराइल", "3",
				"प्रदीप कुमार पासवान\r\n" + "(120900100026)" });
		Set<String> keyset = data.keySet();

		int rownum = 0;

		for (String key : keyset) {

			Row row = sheet.createRow(rownum++);

			Object[] objArr = data.get(key);

			int cellnum = 0;

			for (Object obj : objArr) {

				Cell cell = row.createCell(cellnum++);

				if (obj instanceof String)
					cell.setCellValue((String) obj);

				else if (obj instanceof Integer)
					cell.setCellValue((Integer) obj);
			}
		}

		try {

			FileOutputStream out = new FileOutputStream(new File("C:\\Users\\HP\\Desktop\\jyo.xlsx"));
			workbook.write(out);

			out.close();

			System.out.println("gfgcontribute.xlsx written successfully on disk.");
		}

		// Catch block to handle exceptions
		catch (Exception e) {

			e.printStackTrace();
		}

	}

}
