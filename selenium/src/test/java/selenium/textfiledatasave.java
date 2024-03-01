package selenium;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class textfiledatasave {

	public static void main(String[] args) throws IOException {
	    			

	    			WebDriverManager.chromedriver().setup();
	    			WebDriver driver = new ChromeDriver();
	    			FileOutputStream fos = new FileOutputStream(new File(".//test.txt"));
	    			  OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
	    			  BufferedWriter writer = new BufferedWriter(osw);
	    			  String text = null;

	    			driver.get(
	    					"http://epds.bihar.gov.in/RCList_Village_Wise.aspx?Village_Code_PMO=1020901116801307&&Village_Name_PMO=Araria%20(Nagar%20Parishad)&&Panchayat_Code_PMO=000377&&Panchayat_Name_PMO=Araria%20(Nagar%20Parishad)&&District_Code_PMO=209&&District_Name_PMO=Araria&&Tahsil_Code_PMO=01116&&Tahsil_Name_PMO=Araria");
	    			driver.manage().window().maximize();
	    			List<WebElement> lst = driver.findElements(By.xpath("//table[@id='gridmain']/tbody/tr"));
	    			int lst_Size = lst.size();
	    			List<WebElement> lst1 = driver
	    					.findElements(By.xpath("//table[@id='gridmain']/tbody/tr[" + lst_Size + "]/td//td"));
	    			System.out.println(lst1.size());
	    			for (int j = 1; j <= lst1.size(); j++) {
	    				driver.findElement(By.xpath("//table[@id='gridmain']/tbody/tr[" + lst_Size + "]/td//td[" + j + "]"))
	    						.click();
	    				lst = driver.findElements(By.xpath("//table[@id='gridmain']/tbody/tr"));
	    				for (int i = 2; i < lst.size() - 1; i++) {
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
	    					System.out.print(str1 + " ");
	    					System.out.print(str2 + " ");
	    					System.out.print(str3 + " ");
	    					System.out.print(str4 + " ");
	    					System.out.print(str5 + " ");
	    					System.out.print(str6 + " ");
	    					System.out.print(str7 + " ");
	    					System.out.println();
	    					text=str1+","+str2+","+str3+","+str4+","+str5+","+str6+","+str7;
	    					writer.append(text);
	    					writer.newLine();
	    				}
	    			}
	    			System.out.println(text);
	    			writer.write("here is last data");
	    			writer.close();
	    		
	    	
	}
	
	}


