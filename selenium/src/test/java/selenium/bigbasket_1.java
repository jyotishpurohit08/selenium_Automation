package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bigbasket_1 {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/cl/fruits-vegetables/?nc=nb");
		driver.manage().window().maximize();
		System.out.println("============= successfully open ===================");
      
		List<WebElement> lst1 = driver
				.findElements(By.tagName("a"));
		System.out.println("total tags are: "+lst1.size());
		for (int i=0;i<lst1.size(); i++) {
			System.out.println("Link on page are "+lst1.get(i).getAttribute("href"));
			System.out.println("Link on page are "+lst1.get(i).getText());
		}
	}

}
