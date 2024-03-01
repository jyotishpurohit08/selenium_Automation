import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Util.ExcelUtil1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JsonWrite {
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String text = null;

		ExcelUtil1 obj = new ExcelUtil1(".//TestDataUrls.xlsx");

		int rowCnt = obj.getRowCount("Sheet1");

		for (int k = 0; k < rowCnt; k++) {
			Object url = obj.getDataFromCell("Sheet1", k, 0);

			driver.get(url.toString());
			driver.manage().window().maximize();

			String panchayat = driver.findElement(By.xpath("//span[@id='lblPanchayat']")).getText();
			String path = panchayat.replaceAll("[^a-zA-Z0-9]", " ");
			PrintWriter writer = new PrintWriter(new FileWriter(".//" + path + ".json"));
			JSONArray employeeList = new JSONArray();
			List<WebElement> lst = driver.findElements(By.xpath("//table[@id='gridmain']/tbody/tr"));
			int lst_Size = lst.size();
			List<WebElement> lst1 = driver
					.findElements(By.xpath("//table[@id='gridmain']/tbody/tr[" + lst_Size + "]/td//td"));
			System.out.println(lst1.size());
			int n=lst1.size();
			for (int j = 1; j <= n; j++) {
				text = "";
				String getLastPage = driver
						.findElement(By.xpath("//table[@id='gridmain']/tbody/tr[" + lst_Size + "]/td//td[" + j + "]"))
						.getText();
				driver.findElement(By.xpath("//table[@id='gridmain']/tbody/tr[" + lst_Size + "]/td//td[" + j + "]"))
						.click();
				lst = driver.findElements(By.xpath("//table[@id='gridmain']/tbody/tr"));
				for (int i = 2; i < lst.size() - 1; i++) {
					JSONObject json = new JSONObject();
					System.out.println("//table[@id='gridmain']/tbody/tr[" + i + "]/td[1]");
					String str1 = driver.findElement(By.xpath("//table[@id='gridmain']/tbody/tr[" + i + "]/td[1]"))
							.getText();
					String str2 = driver.findElement(By.xpath("//table[@id='gridmain']/tbody/tr[" + i + "]/td[2]"))
							.getText();
					String str3 = driver.findElement(By.xpath("//table[@id='gridmain']/tbody/tr[" + i + "]/td[3]"))
							.getText();
					String str4 = driver.findElement(By.xpath("//table[@id='gridmain']/tbody/tr[" + i + "]/td[4]"))
							.getText();
					String str5 = driver.findElement(By.xpath("//table[@id='gridmain']/tbody/tr[" + i + "]/td[5]"))
							.getText();
					String str6 = driver.findElement(By.xpath("//table[@id='gridmain']/tbody/tr[" + i + "]/td[6]"))
							.getText();
					String str7 = driver.findElement(By.xpath("//table[@id='gridmain']/tbody/tr[" + i + "]/td[7]"))
							.getText();
					json.put("S.No", str1);
					json.put("Ration Card", str2);
					json.put("Card Type", str3);
					json.put("Ration Card Holder Name", str4);
					json.put("Father Name", str5);
					json.put("Number of Family Members", str6);
					json.put("FPS Dealer", str7);
					employeeList.add(json);

				}
				if (getLastPage.contains("..")) {
					j = 2;
					n=12;
				}

			}
			writer.write(employeeList.toString());
			writer.flush();
			writer.close();
		}
	}
}
