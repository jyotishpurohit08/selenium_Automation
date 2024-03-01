package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nurserylive {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://nurserylive.com/pages/buy-plants-online-in-indore");
		driver.manage().window().maximize();
       driver.findElement(By.className("live-search-button")).click();
       List<WebElement> product = driver.findElements(By.tagName("a"));
		int count = product.size();
		System.out.println("the number of link avilable on the page" + count);
       for (int i = 1; i <= count; i++) {
    	   WebElement web = driver
					.findElement(By.xpath("//li[@id='snize-product-5143359783052']"));
    	   web.click();
    	   WebElement web1 = driver
					.findElement(By.xpath("//div[@class='crm_product_ld']"));
    	   System.out.println("Description = " + web1.getText());
    	   System.out.println("----------Description-----------" );
    	   driver.navigate().back();
     	}
	}
}

