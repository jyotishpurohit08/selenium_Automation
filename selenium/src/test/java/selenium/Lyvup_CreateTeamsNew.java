package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lyvup_CreateTeamsNew {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://app.lyvup.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("admin@welikeyou.nl");
		driver.findElement(By.id("password")).sendKeys("yF=GY2uz@RnR");
		driver.findElement(By.className("remember_me")).click();
		driver.findElement(By.id("dologin")).click();
		System.out.println("================= successfully login =================");
		driver.findElement(By.linkText("Teams")).click();
//		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm']")).click();
//		driver.findElement(By.xpath("//*[@id=\"form_id\"]/div[1]/div[1]/div")).click();
//		Select objSelect = new Select(driver.findElement(By.id("Account_type_id")));
//		objSelect.selectByVisibleText("superadmin");
//		driver.findElement(By.id("Account_name_id")).sendKeys("Makers");
//		driver.findElement(By.xpath("//*[@id=\"form_id\"]/div[1]/div[3]/div")).click();
//		Select objSelect1 = new Select(driver.findElement(By.id("company")));
//		objSelect1.selectByVisibleText("2 Feb oganisation");
//		driver.findElement(By.id("department_id")).sendKeys("ITc");
//		driver.findElement(By.xpath("//*[@id=\"form_id\"]/div[1]/div[10]/div")).click();
//		Select objSelect2 = new Select(driver.findElement(By.id("role_set_id")));
//		objSelect2.selectByVisibleText("Amstelring");
//		driver.findElement(By.xpath("//*[@id=\"form_id\"]/div[1]/div[11]/div")).click();
//		Select objSelect3 = new Select(driver.findElement(By.id("skill_set_id")));
//		objSelect3.selectByVisibleText("Amstelring");
//		driver.findElement(By.xpath("//*[@id=\"form_id\"]/div[1]/div[12]/div")).click();
//		Select objSelect4 = new Select(driver.findElement(By.id("language")));
//		objSelect4.selectByVisibleText("English");
//		WebElement web=driver.findElement(By.xpath("//*[@id=\"form_id\"]/div[2]/button[2]"));
//		web.click();
//		driver.findElement(By.xpath("//*[@id=\"team_block\"]/div/div/nav/ul/li[6]/a")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[4]/td[12]/div[1]/button[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"form_id\"]/div[1]/div[1]/div")).click();
//		Select objSelect5 = new Select(driver.findElement(By.id("Account_type_id")));
//		objSelect5.selectByVisibleText("Organisation");
//		driver.findElement(By.id("Account_name_id")).sendKeys("Maker");
//		driver.findElement(By.xpath("//*[@id=\"form_id\"]/div[1]/div[3]/div")).click();
//		Select objSelect6 = new Select(driver.findElement(By.id("company")));
//		objSelect6.selectByVisibleText("2 Feb oganisation");
//		driver.findElement(By.id("department_id")).sendKeys("ITc");
//		driver.findElement(By.xpath("//*[@id=\"form_id\"]/div[1]/div[10]/div")).click();
//		Select objSelect7 = new Select(driver.findElement(By.id("role_set_id")));
//		objSelect7.selectByVisibleText("Universiteit");
//		driver.findElement(By.xpath("//*[@id=\"form_id\"]/div[1]/div[11]/div")).click();
//		Select objSelect8 = new Select(driver.findElement(By.id("skill_set_id")));
//		objSelect8.selectByVisibleText("Team Skills");
//		driver.findElement(By.xpath("//*[@id=\"form_id\"]/div[1]/div[12]/div")).click();
//		Select objSelect9 = new Select(driver.findElement(By.id("language")));
//		objSelect9.selectByVisibleText("English");
//		WebElement web1=driver.findElement(By.xpath("//*[@id=\"form_id\"]/div[2]/button[2]"));
//		web1.click();
		driver.findElement(By.xpath("//*[@id=\"team_block\"]/div/div/nav/ul/li[6]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[4]/td[12]/div[1]/button[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"addTeamLeaderModal\"]/div/div/div[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[4]/td[12]/div[1]/button[2]")).click();
		System.out.println("============ successfully open add new team form =================");
	}
}
