package selenium;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

public class jsondatasave {

	public static void main(String[] args) throws IOException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String text = null;

		driver.get(
				"http://epds.bihar.gov.in/RCList_Village_Wise.aspx?Village_Code_PMO=1020901116221779&&Village_Name_PMO=Araria&&Panchayat_Code_PMO=000378&&Panchayat_Name_PMO=ARARIA%20BASTI&&District_Code_PMO=209&&District_Name_PMO=Araria&&Tahsil_Code_PMO=01116&&Tahsil_Name_PMO=Araria");
		driver.manage().window().maximize();

		String panchayat = driver.findElement(By.xpath("//span[@id='lblPanchayat']")).getText();
		String path = panchayat.replaceAll("[^a-zA-Z0-9]", " ");
		PrintWriter writer = new PrintWriter(new FileWriter(".//" + path + ".json"));
		JSONArray employeeList = new JSONArray();
		List<WebElement> lst = driver.findElements(By.xpath("//table[@id='gridmain']/tbody/tr"));
		int lst_Size = lst.size();
			try {
		List<WebElement> lst1 = driver
				.findElements(By.xpath("//table[@id='gridmain']/tbody/tr[" + lst_Size + "]/td//td"));
		System.out.println(lst1.size());
		int n = lst1.size();
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
				n = 12;
			}

		}
		
	}finally {
		writer.write(employeeList.toString());
		writer.flush();
		writer.close();
		}
	}



	}


