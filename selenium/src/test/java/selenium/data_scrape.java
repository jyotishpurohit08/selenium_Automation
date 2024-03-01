package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class data_scrape {

	public static void main(String[] args) {
		
       WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.milb.com/players");
		List<WebElement> lst = driver.findElements(By.xpath("//*[@id=\"forge-pagebuilder_index\"]/main/div[2]/div[1]/div/div[3]"));
		int lst_Size = lst.size();
	//	List<WebElement> lst1 = driver
//				.findElements(By.xpath("//*[@id=\\\"forge-pagebuilder_index\\\"]/main/div[2]/div[1]/div/div[3]/div/div[1]/div/div/ul/li["+ lst_Size +"]/div[2]/div[1]/span/a"));
	//	System.out.println(lst1.size());
		
		// //*[@id="forge-pagebuilder_index"]/main/div[2]/div[1]/div/div[3]/div/div[2]/div/div/ul/li[1]/div[2]/div[1]/span/a

	
	}
}
