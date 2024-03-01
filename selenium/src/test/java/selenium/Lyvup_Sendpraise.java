package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lyvup_Sendpraise {

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
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElement(By.id("thumbs__container")).click();
		// WebElement thumb =
		// driver.findElement(By.xpath("//*[@id="team-member__container"]/div[1]/label/img)]"));
		// /html/body/div[3]/main/form/div[1]/div[5]/div[1]/label/img
		// thumb.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		System.out.println("===========Click on POP_UP_MODAL=================");
		WebElement thumb = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/form/div[1]/div[5]/div[1]/label/img")));
		thumb.click();
		WebElement text = wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("/html/body/div[3]/main/form/div[2]/div/div/aside/div/div[2]/div/label[1]/div/div[1]/div")));
		text.click();

		driver.findElement(By.id("selected-members__container")).click();
		System.out.println("===========Write praise =================");
		driver.findElement(By.id("praiseComment")).sendKeys("send praise to TL..........");
		System.out.println("==========send  praise=================");
		driver.findElement(By.className("defaultButton")).click();
		System.out.println("==================successfully compeleted============");
	}

}
