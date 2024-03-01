package selenium;

import java.awt.Desktop.Action;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class comdata {

	public static void main(String[] args) throws RuntimeException, IOException {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.csr.gov.in/content/csr/global/master/home/home/csr-expenditure--geographical-distribution/companies.companiesDataApi.html?methodName=companies&fy=FY%202020-21&orderType=DESC&orderColumn=amnt_spent&pageSize=20&pageNumber=2&_=1667813216779");
		driver.manage().window().maximize();
		WebElement sourcetextarea= driver.findElement(By.xpath("/html/body/pre"));
		Actions action = new Actions(driver);
		action.keyDown(sourcetextarea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		WebElement destinationarea=driver.findElement(By.name("jyotish.sheet"));
		action.keyDown(destinationarea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
	
	}

}
