package selenium;

import static org.testng.Assert.fail;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class stg_Admin_Store_Management {
	
	public static boolean isDisplayed(By by, WebDriver driver) {
		try {
			driver.findElement(by).isDisplayed();
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://stg.clicked.jp/admin");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		if (driver.findElement(By.xpath("/html/body/div/div/div/form/button")).isDisplayed()) {
			WebElement clickBtn1 = driver.findElement(By.xpath("/html/body/div/div/div/form/button"));
			clickBtn1.click();
			System.out.println(" such button found");
		} else {

			System.out.println("No such button found");
		}
		Thread.sleep(5000);
		driver.findElement(By.id("login_id")).sendKeys("admin@clicked");
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("clicked@admin");
		Thread.sleep(5000);
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
		Thread.sleep(8000);
		driver.findElement(By.id("menu-list-18-menuitem-5")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/form/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[1]/input"))
				.sendKeys("1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/form/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[2]/input"))
				.sendKeys("シャルマ店");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/form/div[2]/div[2]/div/div[1]/div[2]/div[2]/button[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/form/div[2]/div[2]/div/div[1]/div[2]/div[2]/button[2]"))
				.click();
		
		/////// Store Edit/Update///////
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(
				"#\\#appp > div > div.table_box.css-0 > div.store_table.css-0 > table > tbody > tr:nth-child(1) > td:nth-child(6) > div.custom_btn_box.css-0 > button:nth-child(1)"))
				.click();
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
				"#__next > div.chakra-container.desktop_main_content_div.admin_main_content_div.css-10gf8jm > div.content_content_div.css-0 > div > div > div > div.admin_detail_head.css-0 > div.btn_box.css-0 > button:nth-child(2)"))
				.click();
		Thread.sleep(7000);
//		driver.findElement(By.xpath("//*[@id=\\\"__next\\\"]/div[2]/div[2]/div/div/div/div[1]/div[1]/input")).clear();
//		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div/div[1]/div[1]/input")).sendKeys("A");
		Thread.sleep(5000);
		Select select1 = new Select(driver
				.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/select")));
		select1.selectByVisibleText("キャバクラ");
		Thread.sleep(5000);
		Select select2 = new Select(driver
				.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div/div[1]/div[3]/div[2]/select")));
		select2.selectByVisibleText("東京");
		Thread.sleep(5000);
		Select select3 = new Select(driver
				.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div/div[1]/div[4]/div[2]/select")));
		select3.selectByVisibleText("新宿");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\\\"__next\\\"]/div[2]/div[2]/div/div/div/div[1]/div[5]/div[1]/input"))
//				.clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div/div[1]/div[5]/div[1]/input"))
				.sendKeys("abcd");
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div/div[1]/div[5]/div[2]/div[2]/input[1]"))
				.sendKeys("7:30");
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div/div[1]/div[5]/div[2]/div[2]/input[2]"))
				.sendKeys("8:00");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div/div[1]/div[5]/div[2]/div[2]/label"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div/div[1]/div[5]/div[2]/div[2]/label"))
				.click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\\\"__next\\\"]/div[2]/div[2]/div/div/div/div[1]/div[5]/div[3]/textarea"))
//				.clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div/div[1]/div[5]/div[3]/textarea"))
				.sendKeys("sjfhsuigfsejfhvsdugfursgjshvuksdhgjshguidshgjksrhgiushg");
		Thread.sleep(5000);
//		driver.findElement(By.name("one_set_time")).clear();
//		Thread.sleep(5000);
		driver.findElement(By.name("one_set_time")).sendKeys("80");
		Thread.sleep(5000);
//		driver.findElement(By.name("one_set_amount")).clear();
//		Thread.sleep(5000);
		driver.findElement(By.name("one_set_amount")).sendKeys("1100");
		Thread.sleep(5000);
		Select select4 = new Select(driver.findElement(
				By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div/div[1]/div[5]/div[5]/div[2]/select")));
		select4.selectByVisibleText("あり");
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\\\"__next\\\"]/div[2]/div[2]/div/div/div/div[1]/div[5]/div[6]/input"))
//				.clear();
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div/div[1]/div[5]/div[6]/input"))
				.sendKeys("www.instagram.com");
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\\\"__next\\\"]/div[2]/div[2]/div/div/div/div[1]/div[5]/div[7]/input"))
//				.clear();
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div/div[1]/div[5]/div[7]/input"))
				.sendKeys("www.twitter.com");
		Thread.sleep(5000);
	//	 driver.findElement(By.id("store_main_image_id")).click();
//		 Thread.sleep(5000);
		driver.findElement(
				By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/input"))
				.sendKeys("C:\\Users\\HP\\Downloads\\range-rover-theme-vv18.jpg");
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
				"document.getElementsByClassName('chakra-button admin_main_btn keep_btn css-taj3dd')[0].click()");
		System.out.println("done__________________!");
		Thread.sleep(8000);
//		driver.findElement(By.cssSelector(
//				"#__next > div.chakra-container.desktop_main_content_div.admin_main_content_div.css-10gf8jm > div.content_content_div.css-0 > div > div > div > div.admin_detail_head.css-0 > div.btn_box.css-0 > button:nth-child(1)"))
//				.click();
//		Thread.sleep(2000);
		System.out.println("successfully complete\"+ 123");
		
		
		
  
    
	}

}
