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

public class Lyvup_Addteamgoal {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.lyvup.com/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("welikeyou@protonmail.com");
		driver.findElement(By.id("password")).sendKeys("yF=GY2uz@RnR");
		driver.findElement(By.className("remember_me")).click();
		driver.findElement(By.id("dologin")).click();
		System.out.println("============successfully login==============");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement val = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/header/nav/ul/li[4]/a")));
		val.click();
		driver.findElement(By.className("team-goals-button")).click();
		driver.findElement(By.id("skills")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("===========select skill=================");
		Select objSelect = new Select(driver.findElement(By.id("skills")));
		objSelect.selectByValue("127");
		System.out.println("===========select skill type =================");
		Select objSelect1 = new Select(driver.findElement(By.id("goal_type")));
		objSelect1.selectByValue("Improve");

		driver.findElement(By.id("expiry_date")).click();
		System.out.println("============select Date ================");
		driver.findElement(By.id("expiry_date")).sendKeys("2022-01-03");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("comment")).click();
		System.out.println("=============Fill Description===============");
		driver.findElement(By.id("comment")).sendKeys(
				"Permission to use, copy, modify, and/or distribute this software for any purpose with or without fee is hereby granted, provided that the above copyright notice and this permission notice appear in all copies.OFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABI");
		System.out.println("===========submit team goal=================");
		driver.findElement(By.className("submitGoal")).click();
		System.out.println("==========successfully Done===========");
	}

}
