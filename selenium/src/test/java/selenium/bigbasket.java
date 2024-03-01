package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bigbasket {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bigbasket.com/cl/fruits-vegetables/?nc=nb#!page=6");
		driver.manage().window().maximize();
		int waitingtime = 3000;
		List<WebElement> product = driver.findElements(By.tagName("a"));
		int count = product.size();
		System.out.println("the number of link avilable on the page" + count);
		int n = 1;
		for (int i = 1; i <= count; i++) {

			System.out.println(i);
			n = i;
			if (i % 5 == 0) {
				n = i + 1;
			}
			driver.findElement(By.xpath(
					"//*[@id=\"dynamicDirective\"]/product-deck/section/div[2]/div[4]/div[1]/div/div/div[2]/div/div["
							+ n + "]/product-template/div/div[4]/div[1]/a"))
					.click();
			Thread.sleep(waitingtime);
			System.out.println("=======successfully click ======" + i);
			Thread.sleep(2000);
			WebElement web = driver.findElement(By.id("about_0"));
			System.out.println(web.getText());
			driver.navigate().back();
			System.out.println("============= successfully back ===============");
			Thread.sleep(5000);
			
			
		}
	}
}
