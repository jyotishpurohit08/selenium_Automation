package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Expense_report {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://script.google.com/macros/s/AKfycbwn-Ozf7fr7JzHxaeVQEurl6t1mD5DTdOT74UDfvQRmWCOieUWKN3FXPG2yP6vzZUQJ/exec");
		driver.manage().window().maximize();
        System.out.println("successfully open");
        Thread.sleep(10000);
//       WebElement dropdown= driver.findElement(By.xpath("//*[@id=\"name\"]"));
//        Select select =new Select(dropdown);
//      select.deselectByVisibleText("jyotish.we2code@gmail.com");

      driver.findElement(By.xpath("document.getElementById(\"businesspurp\").value = \"jyotishhdghd\";"));
	}

}
