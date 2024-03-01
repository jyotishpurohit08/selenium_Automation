package selenium;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class office_project {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		PrintWriter pw = new PrintWriter(new FileWriter(".//test.html"));
		pw.println("<table class=\"cellstyle\" cellspacing=\"0\" cellpadding=\"4\" id=\"gridmain\" style=\"color:#333333;width:100%;border-collapse:collapse;\">\r\n"
				+ "			<tbody><tr style=\"color;background-color:#5D7B9D;font-weight:bold;\">\r\n"
				+ "				<th align=\"left\" scope=\"col\">S.NO.</th><th align=\"left\" scope=\"col\">Ration Card</th><th align=\"left\" scope=\"col\">Card Type</th><th align=\"left\" scope=\"col\"> Ration Card Holder Name</th><th align=\"left\" scope=\"col\">Father Name</th><th align=\"left\" scope=\"col\">Number of Family Members</th><th align=\"left\" scope=\"col\">FPS Dealer</th>\r\n"
				+ "			</tr>");
		
		driver.get(
				"http://epds.bihar.gov.in/RCList_Village_Wise.aspx?Village_Code_PMO=1020901116801307&&Village_Name_PMO=Araria%20(Nagar%20Parishad)&&Panchayat_Code_PMO=000377&&Panchayat_Name_PMO=Araria%20(Nagar%20Parishad)&&District_Code_PMO=209&&District_Name_PMO=Araria&&Tahsil_Code_PMO=01116&&Tahsil_Name_PMO=Araria");
		driver.manage().window().maximize();
		List<WebElement> lst = driver.findElements(By.xpath("//table[@id='gridmain']/tbody/tr"));
		int lst_Size = lst.size();
		List<WebElement> lst1 = driver
				.findElements(By.xpath("//table[@id='gridmain']/tbody/tr[" + lst_Size + "]/td//td"));
		System.out.println(lst1.size());
		for (int j = 1; j <= lst1.size(); j++) {
			driver
			.findElement(By.xpath("//table[@id='gridmain']/tbody/tr[" + lst_Size + "]/td//td["+j+"]")).click();
			lst = driver.findElements(By.xpath("//table[@id='gridmain']/tbody/tr"));
			for (int i = 2; i < lst.size()-1 ; i++) {
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
				pw.write("<tr style=\"color:#333333;background-color:#F7F6F3;\">");
				pw.write("<td align=\"left\"> <span>" +str1+"</span></td><td align=\"left\"><a href=\"javascript:__doPostBack('gridmain$ctl02$LinkButton1','')\" style=\"color:Blue;\">"+str2+"</a></td>");
				pw.write("<td align=\"left\">"+str3+"</td>");
				pw.write("<td align=\"left\">"+str4+"</td>");
				pw.write("<td align=\"left\">"+str5+"</td>");
				pw.write("<td align=\"left\">"+str6+"</td>");
				pw.write("<td align=\"left\">"+str7+"<br></td>");
				pw.write("</tr><tr style=\"color:#284775;background-color:White;\">");
			}
		}
		pw.close();
	}



	}


