package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class stg_Admin_videocall_management {
	
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
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('menu-list-18-menuitem-13').click()");
		System.out.println("done__________________!");
		Thread.sleep(8000);
		driver.findElement(By.name("storeid")).sendKeys("1");
		Thread.sleep(5000);
         driver.findElement(By.name("storename")).sendKeys("シャルマ店");
         Thread.sleep(5000);
         driver.findElement(By.name("castid")).sendKeys("2c39996f-ef7b-48e5-b148-c7499d509434");
         Thread.sleep(5000);
         driver.findElement(By.name("castname")).sendKeys("Cast_マルティ");
         Thread.sleep(5000);
         driver.findElement(By.xpath("//*[@id=\"__next\"]/form/div[2]/div[2]/div/div[1]/div[2]/div[2]/button[1]")).click();
         Thread.sleep(5000);
         driver.findElement(By.xpath("//*[@id=\"__next\"]/form/div[2]/div[2]/div/div[1]/div[2]/div[2]/button[2]")).click();
         Thread.sleep(5000);
         driver.findElement(By.cssSelector("#__next > form > div.chakra-container.desktop_main_content_div.admin_main_content_div.css-10gf8jm > div.content_content_div.css-0 > div > div.videocall_list.css-0 > div > div.table_box.css-0 > div > table > tbody > tr:nth-child(1) > td:nth-child(6) > div.custom_btn_box.css-0 > button")).click();
         Thread.sleep(5000);
         driver.findElement(By.cssSelector("#__next > div.chakra-container.desktop_main_content_div.admin_main_content_div.css-10gf8jm > div.content_content_div.css-0 > div > div > div.heading_and_btn_box.css-0 > button")).click();
        
        System.out.println("successfully complete"+ 123);
        
	}

}
