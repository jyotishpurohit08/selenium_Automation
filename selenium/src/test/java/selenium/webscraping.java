package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class webscraping {

	public static void main(String[] args) throws Exception {

		String strXpath;
		List <WebElement> searchpageResults =null;
		List <String> allLinkText = new ArrayList<String>();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		for (int i = 1; i <= 5; i++) {

			if (i>1) {
				strXpath = "//a[@class='fl' and text()='"+i+"']";
				driver.findElement(By.xpath(strXpath)).click();
				Thread.sleep(2000);
			}
			searchpageResults = driver.findElements(By.xpath("//div[@class='rc']/h3/a"));

			for (WebElement link : searchpageResults) {

				allLinkText.add(link.getText());
			}
		}

		for (String eachLinkText : allLinkText) {
			String s=searchpageResults.get(5).getText();
			System.out.println("test is coming"+eachLinkText);
			
		}
	}
}
