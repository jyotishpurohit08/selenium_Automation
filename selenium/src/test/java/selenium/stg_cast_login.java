package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stg_cast_login {
	
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
		driver.get("http://stg.clicked.jp/cast/landing");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		if (driver.findElement(By.xpath("/html/body/div/div/div/form/button")).isDisplayed()) {
			WebElement clickBtn1 = driver.findElement(By.xpath("/html/body/div/div/div/form/button"));
			clickBtn1.click();
		} else {
			System.out.println("No such button found");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='__next']/child::div/child::div/child::button")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@name='tid']")).sendKeys("rohit.we2code@gmail.com");
		driver.findElement(By.xpath("//input[@name='tpasswd']")).sendKeys("rohitsir@123");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@class='MdBtn01']")).click();
		System.out.println("successfully login");
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("document.getElementsByClassName(\"chakra-input css-1c6j008\")[0].value='1'\r\n"
	    		+ "1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		
		
	
	}

}
