package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lyvup_Sendgroupfeedbackrequest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.lyvup.com/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("lyvup@protonmail.com");
		driver.findElement(By.id("password")).sendKeys("yF=GY2uz@RnR");
		driver.findElement(By.className("remember_me")).click();
		driver.findElement(By.id("dologin")).click();
		System.out.println("===============successfully login===============");
		driver.findElement(By.id("thumbs__container")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement val = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/form/div[1]/div[2]/div[1]/label[2]")));
		val.click();
		driver.findElement(By.id("select-all")).click();
		driver.findElement(By.id("selected-members__container")).click();
		driver.findElement(By.id("praiseComment"))
				.sendKeys("send group feedback request to all team member ..........");
		driver.findElement(By.className("defaultButton")).click();
		System.out.println("=============successfully compeleted================");

	}

}
