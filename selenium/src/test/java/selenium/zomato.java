package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class zomato {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.zomato.com/indore");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Burger")).click();
		List<WebElement> product = driver.findElements(By.tagName("a"));
		int count = product.size();
		System.out.println("========= the number of link avilable on the page ============" + count);
		int n=8;
		int m=0;
		for (int i = 1; i <= count; i++) {
			System.out.println(i);
			if ((i-1) % 3 == 0 && i>1) {
				n++;
				m=0;
			}
			m++;
			System.out.println("========= n ====&&&&&&&&&&&&&&&&&&========" + n);
			System.out.println(m+"----------- Shope Name ---------" + i);
			WebElement web = driver
					.findElement(By.xpath("//*[@id=\"root\"]/div/div["+n+"]/div/div[" + m + "]/div/div/a[2]/div[1]/h4"));
			WebElement web1 = driver
					.findElement(By.xpath("//*[@id=\"root\"]/div/div["+n+"]/div/div[" + m + "]/div/div/a[2]/div[2]/p[2]"));
			WebElement web2 = driver.findElement(
					By.xpath("//*[@id=\"root\"]/div/div["+n+"]/div/div[" + m + "]/div/div/a[2]/div[1]/div/div"));
			WebElement web3 = driver
					.findElement(By.xpath("//*[@id=\"root\"]/div/div["+n+"]/div/div[" + m + "]/div/div/a[1]/div[3]"));
			WebElement web4 = driver
					.findElement(By.xpath("//*[@id=\"root\"]/div/div["+n+"]/div/div[" + m + "]/div/div/a[1]/div[2]/img"));
			System.out.println("Shope_Name = " + web.getText());
			System.out.println("Price = " + web1.getText());
			System.out.println("Rating = " + web2.getText());
			System.out.println("Discount = " + web3.getText());
			System.out.println("Image = " + web4.getAttribute("src"));
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div["+n+"]/div/div[" + m + "]/div/div/a[2]/div[1]/h4"))
					.click();
			List<WebElement> sub_product = driver.findElements(By.tagName("h4"));
			int sub_count = sub_product.size();
			System.out.println("================ the number of link avilable on the page ================" + sub_count);
			for (int j = 1; j <= 1; j++) {
				System.out.println("---------- Product Name -----------" + j);
				WebElement sub_web = driver.findElement(
						By.xpath("//*[@id=\"root\"]/div/main/div/section[4]/section/section[2]/section[2]/div[2]/div["
								+ j + "]/div/div/div[2]/div/div/h4"));
				System.out.println("Product Name = " + sub_web.getText());
				WebElement sub_web1 = driver.findElement(
						By.xpath("//*[@id=\"root\"]/div/main/div/section[4]/section/section[2]/section[2]/div[2]/div["
								+ j + "]/div/div/div[2]/p"));
				System.out.println("Discription = " + sub_web1.getText());

			}
			driver.navigate().back();

		}
	}
}
