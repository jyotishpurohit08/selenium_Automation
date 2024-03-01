package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class floweraura {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.floweraura.com/plants/indore");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Flowers")).click();
		List<WebElement> product = driver.findElements(By.tagName("a"));
		int count = product.size();
		System.out.println("the number of link avilable on the page" + count);
		for (int i = 1; i <= count; i++) {
			WebElement web = driver.findElement(By.xpath(
					"//*[@id=\"flowerauraReactApp\"]/div[4]/div/div[5]/div[3]/div/div[1]/div[" + i + "]/div[1]"));
			web.click();
		// driver.navigate().to("https://www.floweraura.com/plants/indore");
		 driver.close();
		}
	}
}
