package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestersCcafe {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testerscafe.in");
		driver.manage().window().maximize();
		
		WebElement web = driver.findElement(By.xpath("//li[@id='menu-item-2166']"));
		Actions act = new Actions(driver);
		
		act.moveToElement(web).perform();
		
		List<WebElement> links=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//a"));
		int total_count=links.size();
		for(int i=0;i<total_count;i++) {
			WebElement element =links.get(i);
			String text=element.getAttribute("innerHTML");
			System.out.println("Link name is "+text);
			
			if(text.equalsIgnoreCase("About Us")) {
				element.click();
			}
		}
		
	}

	

}
