package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Stg_Admin_store_addition {
	
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://stg.clicked.jp/admin");
		driver.manage().window().maximize();
	//	Thread.sleep(2000);
		if (driver.findElement(By.xpath("/html/body/div/div/div/form/button")).isDisplayed()) {
			WebElement clickBtn1 = driver.findElement(By.xpath("/html/body/div/div/div/form/button"));
			clickBtn1.click();
			System.out.println(" such button found");
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

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('menu-list-18-menuitem-6').click()");
		System.out.println("done__________________!");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div/div[1]/div[1]/input"))
				.sendKeys("Nexa");
		Thread.sleep(5000);
		WebElement ddown = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/select"));
		Select sc = new Select(ddown);
		sc.selectByVisibleText("キャバクラ");
		sc.selectByIndex(1);
		System.out.println("done____________________!");
		Thread.sleep(5000);
		Select select = new Select(driver
				.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div/div[1]/div[3]/div[2]/select")));
		select.selectByVisibleText("北海道");
		System.out.println("done1_________________!");
		Thread.sleep(5000);
		Select select1 = new Select(driver
				.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div/div[1]/div[4]/div[2]/select")));
		select1.selectByVisibleText("札幌");
		Thread.sleep(3000);

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js.executeScript(
				"document.getElementsByClassName('chakra-button admin_main_btn keep_btn css-taj3dd')[0].click()");
		System.out.println("done3__________________!");
		driver.findElement(By.cssSelector(
				"#__next > div.chakra-container.desktop_main_content_div.admin_main_content_div.css-10gf8jm > div.content_content_div.css-0 > div > div > div > div.admin_detail_head.css-0 > div.btn_box.css-0 > button:nth-child(1)"))
				.click();
		System.out.println("successfully complete\"+ 123");
	}

}
