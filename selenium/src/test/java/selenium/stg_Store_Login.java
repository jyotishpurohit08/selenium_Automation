package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class stg_Store_Login {
	
	public static boolean isDisplayed(By by, WebDriver driver) {
		try {
			driver.findElement(by).isDisplayed();
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://stg.clicked.jp/store/landing");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		SoftAssert softassert = new SoftAssert();
		if (driver.findElement(By.xpath("/html/body/div/div/div/form/button")).isDisplayed()) {
			WebElement clickBtn1 = driver.findElement(By.xpath("/html/body/div/div/div/form/button"));
			clickBtn1.click();
		} else {
			System.out.println("No such button found");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='chakra-button landing_page_green_outline_btn css-taj3dd']"))
				.click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@name='tid']")).sendKeys("shivanik.we2code@gmail.com");
		System.out.println("successfully fill email");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@name='tpasswd']")).sendKeys("we2code");
		System.out.println("successfully fill passwoard");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@class='MdBtn01']")).click();
		System.out.println("successfully click login button");
		Thread.sleep(15000);
		
		}

}
