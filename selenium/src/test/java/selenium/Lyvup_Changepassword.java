package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lyvup_Changepassword {

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
		System.out.println("===========successfully login========");
		driver.findElement(By.className("profile_name")).click();
		driver.findElement(By.xpath("//a[@href='/profile/21449']")).click();
		driver.findElement(By.id("change_password")).click();

		driver.findElement(By.id("new_password")).sendKeys("We2code");
		driver.findElement(By.id("confirm_password")).sendKeys("We2code");
		driver.findElement(By.id("save_pwd_button")).click();

		driver.findElement(By.id("new_password")).clear();
		driver.findElement(By.id("new_password")).sendKeys("We2code@2018");
		driver.findElement(By.id("confirm_password")).clear();
		driver.findElement(By.id("confirm_password")).sendKeys("We2code@2018");
		driver.findElement(By.id("save_pwd_button")).click();
		System.out.println("==============successfully Done==============");
	}

}
