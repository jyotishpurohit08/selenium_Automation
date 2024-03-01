package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jal_jeevan_mission {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

	//	System.setProperty("webdriver.chrome.driver", "/home/enirantar/Downloads/chromedriver");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ejalshakti.gov.in/IMISReports/");
		int waitingtime = 3000;

		String aanganwadi_number ="1,587" ;
		driver.manage().window().maximize();
		driver.get("https://ejalshakti.gov.in/IMISReports/");
		Thread.sleep(waitingtime);
		driver.findElement(By.linkText("Coverage of Schools / Aanganwadis / Institutions with Tap Connections"))
		.click();

		String pID = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();

		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
		driver.switchTo().window(itr.next());
		}

		driver.findElement(
		By.id("ContentPlaceHolder_rpt_Oth_lkbstate_8")).click();

		Thread.sleep(waitingtime);
		System.out.println("=======go to page number ====== 0");
		driver.findElement(By.linkText(aanganwadi_number)).click();

		Thread.sleep(waitingtime);
		System.out.println("=======downloading excel for page ====== 0");
		driver.findElement(By.id("convertEXCEL")).click();

		Thread.sleep(waitingtime);
		int num_rows = driver.findElements(By.xpath("//*[@id=\"upPnl\"]/div/div[1]/table/tbody/tr/td/a")).size();
		
		System.out.println("======= num_rows ======" + num_rows);
		for (int i = 1; i <= num_rows; i++) {
		System.out.println("=======go to page number ======" + i);
		driver.findElement(By.id("ContentPlaceHolder_repIndex_lnkPages_" + i)).click();
		Thread.sleep(waitingtime);
		System.out.println("=======downloading excel for page ======" + i);
		driver.findElement(By.id("convertEXCEL")).click();
		}
		driver.quit();


		}



}


