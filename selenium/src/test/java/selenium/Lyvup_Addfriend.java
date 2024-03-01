package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lyvup_Addfriend {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.lyvup.com/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("welikeyou@protonmail.com");
		driver.findElement(By.id("password")).sendKeys("yF=GY2uz@RnR");
		driver.findElement(By.className("remember_me")).click();
		driver.findElement(By.id("dologin")).click();
		/// html/body/div[3]/header/nav/ul/li[5]/a
		System.out.println("===========successfully login===========");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement val = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/header/nav/ul/li[5]/a")));
		val.click();

		WebElement val1 = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div[2]/a[2]/button")));
		val1.click();
		// driver.findElement(By.className("team_btn tooltip")).click();
		/// html/body/div[3]/div/div[1]/div[3]/button
		WebElement val2 = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div[1]/div[3]/button")));
		val2.click();
		driver.findElement(By.id("name")).sendKeys("Roshni2");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("last_name")).sendKeys("patel");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("Roshni2@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("===========select Gender=================");
		 driver.findElement(By.className("gender")).click();
//		WebElement val5 = wait.until(ExpectedConditions.presenceOfElementLocated(
//				By.xpath("/html/body/div[3]/div/div[2]/div[2]/form/div[2]/p[2]/label[2]/input")));
//		val5.click();
		System.out.println("===========select Relationship=================");
		driver.findElement(By.xpath("//*[@id=\"usersProfileForm\"]/div[2]/p[4]/label[1]/input")).click();
//		WebElement val6 = wait.until(ExpectedConditions.presenceOfElementLocated(
//				By.xpath("/html/body/div[3]/div/div[2]/div[2]/form/div[2]/p[4]/label[2]/input")));
//		val6.click();
		driver.findElement(By.id("relation_since")).click();
		System.out.println("===========select year since =================");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select objSelect = new Select(driver.findElement(By.id("relation_since")));
		objSelect.selectByValue("2005");
		driver.findElement(By.id("ff_language")).click();
		System.out.println("===========select Language=================");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Select objSelect2 = new Select(driver.findElement(By.id("ff_language")));
		objSelect2.selectByValue("en");
		System.out.println("===========Add friend successfull=================");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("save_button")).click();
		System.out.println("=============successfully Done=============");
	}
}
