package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class user_r {
	
	public static boolean isDisplayed(By by, WebDriver driver) {
		try {
			driver.findElement(by).isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://stg.clicked.jp/user/landing");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebDriverWait wait10 = new WebDriverWait(driver, 20);
		WebElement ele10 = wait10
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/form/button")));
		if (driver.findElement(By.xpath("/html/body/div/div/div/form/button")).isDisplayed()) {
			WebElement clickBtn1 = driver.findElement(By.xpath("/html/body/div/div/div/form/button"));
			clickBtn1.click();
		} else {
			System.out.println("No such button found");
		}
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginbtn")));
		driver.findElement(By.id("loginbtn")).click();
		System.out.println("successfully click");
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		WebElement ele1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='tid']")));
		driver.findElement(By.xpath("//input[@name='tid']")).sendKeys("shivanik.we2code@gmail.com");
		driver.findElement(By.xpath("//input[@name='tpasswd']")).sendKeys("we2code");
		System.out.println("successfully fill username and passwoard");
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		WebElement ele2 = wait2.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='mdFormGroup01Btn']/child::button")));
		driver.findElement(By.xpath("//div[@class='mdFormGroup01Btn']/child::button")).click();
		System.out.println("successfully click login button");
		WebDriverWait wait8 = new WebDriverWait(driver, 50);
		WebElement ele8 = wait8.until(ExpectedConditions.elementToBeClickable(By.id("//*[@id=\"__next\"]/div")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)", "");
		WebDriverWait wait3 = new WebDriverWait(driver, 20);
		WebElement ele3 = wait3.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//span[@class='chakra-checkbox__control css-xxkadm']")));
		driver.findElement(By.xpath("//span[@class='chakra-checkbox__control css-xxkadm']")).click();
		WebDriverWait wait4 = new WebDriverWait(driver, 20);
		WebElement ele4 = wait4.until(ExpectedConditions.elementToBeClickable(By.id("conbtn")));
		driver.findElement(By.id("conbtn")).click();
		System.out.println("successfully login");
		WebDriverWait wait5 = new WebDriverWait(driver, 20);
		WebElement ele5 = wait5.until(ExpectedConditions.elementToBeClickable(By.id("userName")));
		driver.findElement(By.name("userName")).sendKeys("w2c_harry");

		// radio-2
		Select select = new Select(driver.findElement(By.name("frequent_drinking_area")));
		select.selectByVisibleText("長野");
		// driver.findElement(By.name("frequent_drinking_area")).click();
		Select select1 = new Select(driver.findElement(By.id("field-1")));
		select1.selectByVisibleText("30代前半");

		WebElement checkbox = driver.findElement(
				By.xpath("//body/*[@id=\"__next\"]/div/div[2]/form/div[5]/div[1]/div[2]/div/div/label[1]/span[2]"));
		if (!checkbox.isSelected()) {

			// creating a reference
			JavascriptExecutor js1 = (JavascriptExecutor) driver;

			// calling the method
			js1.executeScript("document.querySelector('input[value=飲めます]').click()", args);

			System.out.println("check already");
		} else {
			System.out.println("check already" + checkbox.getText());
		}

		WebElement checkbox1 = driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/form/div[5]/div[2]/div[2]/div/div/label[1]/input"));
		if (!checkbox.isSelected()) {

			// creating a reference
			JavascriptExecutor js2 = (JavascriptExecutor) driver;

			// calling the method
			js2.executeScript("document.querySelector('input[value=紙巻]').click()", args);

			System.out.println("check already");
		} else {
			System.out.println("check already" + checkbox.getText());
		}
		WebDriverWait wait6 = new WebDriverWait(driver, 20);
		WebElement ele6 = wait6.until(ExpectedConditions.elementToBeClickable(By.name("user_description")));
		driver.findElement(By.name("user_description")).sendKeys("dfhsgusdfbjdsgsdbd fsgsdhs");
		WebDriverWait wait7 = new WebDriverWait(driver, 20);
		WebElement ele7 = wait7.until(ExpectedConditions
				.elementToBeClickable(By.id("//div[@class='button_box css-0']/child::div/child::button")));
		WebElement ele9 = driver.findElement(By.xpath("//div[@class='button_box css-0']/child::div/child::button"));
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click();", ele9);
	

	}

}
