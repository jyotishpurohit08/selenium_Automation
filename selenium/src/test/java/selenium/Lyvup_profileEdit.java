package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lyvup_profileEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.lyvup.com/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("lyvup@protonmail.com");
		driver.findElement(By.id("password")).sendKeys("yF=GY2uz@RnR");
		driver.findElement(By.className("remember_me")).click();
		driver.findElement(By.id("dologin")).click();
		 System.out.println("============successfully login==============");
		driver.findElement(By.className("profile_name")).click();
		driver.findElement(By.xpath("//a[@href='/profile/21449']")).click();
		driver.findElement(By.id("profile_edit")).click();
		driver.findElement(By.id("phone")).clear();
		driver.findElement(By.id("phone")).sendKeys("96325815");
		driver.findElement(By.id("last_name")).clear();
		driver.findElement(By.id("last_name")).sendKeys("Rathod");
		driver.findElement(By.id("position")).click();
		driver.findElement(By.id("hobbies")).clear();
		driver.findElement(By.id("hobbies")).sendKeys("Dancing");
		driver.findElement(By.id("about")).clear();
		driver.findElement(By.id("about")).sendKeys("hello .....lyvup is here");
		driver.findElement(By.id("save_button")).click();
//		      WebDriver driver=new ChromeDriver();
//		     driver.manage().timeouts().implicitlyWait(20, TimeUnit, SECONDS);
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"invite-others\"]/a/p"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
		WebElement ele1=driver.findElement(By.xpath("//*[@id=\"page\"]/header/nav/ul/li[13]/a"));
		JavascriptExecutor js1= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele1);
	//	driver.findElement(By.className("profile_name")).click();
	//	driver.findElement(By.xpath("//a[@href='/logout']")).click();
		System.out.println("==================successfully compeleted============");
	}

}

// driver.findElement(By.className("form-control w3-input")).click();
