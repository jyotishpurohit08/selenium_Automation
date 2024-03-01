package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class winnin {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.winni.in/plants");
		driver.manage().window().maximize();
		 List<WebElement> product = driver.findElements(By.tagName("li"));
			int count = product.size();
			System.out.println("the number of link avilable on the page" + count);
		for (int i = 1; i <= count; i++) {
		 driver.findElement(By.xpath("//html/body/main/div[2]/div[2]/div[2]/ul/li["+ i +"]")).click();
		 WebElement web = driver
					.findElement(By.xpath("//*[@id=\"highlights\"]/div/div"));
		 System.out.println("Discription = " + web.getText());
		 System.out.println("----------Description-----------" );
			
  	   driver.close();
	  
	}

	
		
	}
}

