package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clicked_user_home_page {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://stg.clicked.jp/user/home");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("menu-button-user_module_menu_box")).click();
		driver.findElement(By.id("menu-list-user_module_menu_box-menuitem-1")).click();
		driver.navigate().back();
		driver.findElement(By.id("menu-list-user_module_menu_box-menuitem-2")).click();
		driver.findElement(By.linkText("プロフィール設定")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("window.scroll(0,1000)");
		driver.navigate().back();
		driver.findElement(By.id("menu-list-user_module_menu_box-menuitem-3")).click();
		driver.navigate().back();
		
	}

}
