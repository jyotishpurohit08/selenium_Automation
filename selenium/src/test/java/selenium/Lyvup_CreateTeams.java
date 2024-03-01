package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lyvup_CreateTeams {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.lyvup.com/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("admin@welikeyou.nl");
		driver.findElement(By.id("password")).sendKeys("yF=GY2uz@RnR");
		driver.findElement(By.className("remember_me")).click();
		driver.findElement(By.id("dologin")).click();
		System.out.println("=================successfully login=================");
		driver.findElement(By.className("ml-1")).click();
		driver.findElement(By.xpath("//a[@class='s-menu-bar-item'][3]")).click();
		driver.findElement(By.xpath("//a[@id='addbutton']")).click();
		System.out.println("-----------------------1");
		WebElement acctype = driver.findElement(By.id("account_type"));
		Select acc = new Select(acctype);
		acc.selectByIndex(2);
		System.out.println("------------------2-----------------");
		driver.findElement(By.id("account_name")).sendKeys("Automate");
		System.out.println("----------------3------------");
		WebElement Org = driver.findElement(By.id("company_id"));
		Select Organi = new Select(Org);
		Organi.selectByIndex(3);
		System.out.println("-------------4-----------------");
		driver.findElement(By.id("department")).sendKeys("Automating");
		// Thread.sleep(6000L);
         System.out.println("----------------5-------------");
		WebElement Selector = driver.findElement(By.id("roleset"));
		Select set = new Select(Selector);
		set.selectByIndex(3);
		System.out.println("------------------6-----------------");
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//div[@class='filter-option-inner-inner']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Team Skills']")).click();
       System.out.println("--------------7-----------------");
		WebElement lang = driver.findElement(By.id("language"));
		Select language = new Select(lang);
		language.selectByIndex(3);
		System.out.println("--------------------8--------------");
		driver.findElement(By.xpath("//a[@class='btn btn-default'][normalize-space()='Volgende']")).click();
		// Thread.sleep(5000L);
		driver.findElement(By.xpath("//input[@id='team_leader_name']")).sendKeys("TLautomate");
		driver.findElement(By.xpath("//input[@id='team_leader_last_name']")).sendKeys("TL@autom");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("976525517");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sona@gmail.com");
		WebElement web = driver.findElement(By.xpath("//select[@id='position']"));
		Select webfun = new Select(web);
		webfun.selectByIndex(4);
		driver.findElement(By.xpath("//span[@class='ml-1']")).click();
		driver.findElement(By.xpath("(//a[@onclick='nextClicked();'])[1]")).click();
		// Thread.sleep(3000L);
		driver.findElement(By.id("user_f_name")).sendKeys("Sonal");
		driver.findElement(By.id("user_l_name")).sendKeys("Sachdev");
		driver.findElement(By.id("user_phone")).sendKeys("57255");
		driver.findElement(By.id("user_email")).sendKeys("userautonate@gmail.com");
		WebElement domain = driver.findElement(By.id("user_position"));
		Select Domsel = new Select(domain);
		Domsel.selectByIndex(3);
		driver.findElement(By.xpath("//a[normalize-space()='Voeg Lid toe']")).click();
		System.out.println("==============successfully compeleted================");
	}

}
