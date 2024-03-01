package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lyvup_login {

	public static void main(String[] args) {

		System.out.println("Hello");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.lyvup.com/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("welikeyou@protonmail.com");
		driver.findElement(By.id("password")).sendKeys("yF=GY2uz@RnR");
		driver.findElement(By.className("remember_me")).click();
		driver.findElement(By.id("dologin")).click();
		System.out.println("=================successfully login=================");

		// driver.findElement(By.className("active-nav")).click();
		driver.findElement(By.xpath("//a[@href='/feedback']")).click();
		driver.findElement(By.id("thumbs__container")).click();
		driver.findElement(By.xpath("//a[@href='/team']")).click();
		driver.findElement(By.xpath("//a[@href='/goals']")).click();
		driver.findElement(By.xpath("//a[@href='/assessment']")).click();
		driver.findElement(By.xpath("//a[@href='/userprograms']")).click();
		driver.findElement(By.xpath("//a[@href='/todo']")).click();
		driver.findElement(By.className("profile_name")).click();
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		System.out.println("==============successfully compeleted================");
		

	}
}
