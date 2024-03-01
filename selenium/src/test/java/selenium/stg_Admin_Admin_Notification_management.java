package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class stg_Admin_Admin_Notification_management {
	
	public static boolean isDisplayed(By by, WebDriver driver) {
		try {
			driver.findElement(by).isDisplayed();
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://stg.clicked.jp/admin");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		if (driver.findElement(By.xpath("/html/body/div/div/div/form/button")).isDisplayed()) {
			WebElement clickBtn1 = driver.findElement(By.xpath("/html/body/div/div/div/form/button"));
			clickBtn1.click();
		} else {
			System.out.println("No such button found");
		}
		Thread.sleep(5000);
		driver.findElement(By.id("login_id")).sendKeys("admin@clicked");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("clicked@admin");
		Thread.sleep(2000);
		WebElement checkbox = driver
				.findElement(By.xpath("/html/body/div[1]/form/div/div/div/div/div/div[2]/div[3]/div/label/span"));
		if (!checkbox.isSelected()) {

			// creating a reference
			JavascriptExecutor js = (JavascriptExecutor) driver;

			// calling the method
			js.executeScript("document.querySelector('input[id=remember_me').click()", args);

			System.out.println("check already");
		} else {
			System.out.println("check already" + checkbox.getText());
		}
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		System.out.println("login successfully --------------!");
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('menu-list-18-menuitem-15').click()");
		System.out.println("done__________________!");
		Thread.sleep(10000);
		driver.findElement(By.name("searchStartDate")).sendKeys("08-05-2022 11:48");
		Thread.sleep(5000);
		driver.findElement(By.name("searchEndDate")).sendKeys("28-11-2022 11:48");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(
				"#__next > div.chakra-container.desktop_main_content_div.admin_main_content_div.css-10gf8jm > div.content_content_div.css-0 > div > div.management_side_information_table.css-0 > div > div.table_box.css-0 > div.manager_side_info_list.css-0 > table > tbody > tr:nth-child(1) > td:nth-child(5) > div.custom_btn_box.css-0 > button:nth-child(1)"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(
				"#__next > div.chakra-container.desktop_main_content_div.admin_main_content_div.css-10gf8jm > div.content_content_div.css-0 > div > div > div > div.admin_detail_head.css-0 > div.btn_box.css-0 > button:nth-child(2)"))
				.click();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div[2]/textarea"))
				.sendKeys("hlw what are you doing");
		Thread.sleep(5000);
		Select select = new Select(driver.findElement(
				By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/select")));
		select.selectByVisibleText("非公開");
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div[3]/div[2]/label[2]"))
				.click();
		Thread.sleep(5000);
		// driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/button")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript(
				"document.getElementsByClassName('chakra-button admin_main_btn keep_btn css-taj3dd')[0].click()");
		System.out.println("done1__________________!");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(
				"#__next > div.chakra-container.desktop_main_content_div.admin_main_content_div.css-10gf8jm > div.content_content_div.css-0 > div > div > div > div.admin_detail_head.css-0 > div.btn_box.css-0 > button:nth-child(3)"))
				.click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println("The text inside the alert:" + alert.getText());
		alert.dismiss();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(
				"#__next > div.chakra-container.desktop_main_content_div.admin_main_content_div.css-10gf8jm > div.content_content_div.css-0 > div > div > div > div.admin_detail_head.css-0 > div.btn_box.css-0 > button:nth-child(1)"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='form_field css-0']/child::input")).sendKeys("28-11-2022T0011:16");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='form_field css-0']/child::textarea")).sendKeys("what are you doing");
		Thread.sleep(5000);
		Select select1 = new Select(
				driver.findElement(By.xpath("//div[@class='form_field css-0']/child::div/child::select")));
		select1.selectByVisibleText("非公開");
		Thread.sleep(5000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript(
				"document.getElementsByClassName('chakra-checkbox tag_check_box css-1uiwwan')[0].click()");
		Thread.sleep(5000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript(
				"document.getElementsByClassName('chakra-button admin_main_btn keep_btn css-taj3dd')[0].click()");
		System.out.println("done2__________________!");
		System.out.println("successfully complete"+ 123);
	}

}
