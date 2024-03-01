package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lyvup_Addgoal {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.lyvup.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("lyvup@protonmail.com");
		driver.findElement(By.id("password")).sendKeys("yF=GY2uz@RnR");
		driver.findElement(By.className("remember_me")).click();
		driver.findElement(By.id("dologin")).click();
		System.out.println("============ successfully login=====================");
		// Select objSelect3 = new Select(driver.findElement(By.id("current_account")));
		// objSelect3.selectByValue("194");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement val = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/header/nav/ul/li[4]/a")));
		val.click();
		WebElement val2 = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[1]/div[1]/div[1]/div[2]/button")));
		val2.click();
		driver.findElement(By.id("skills")).click();
		// Select se = new
		// Select(driver.findElement(By.xpath("//*[@id=\"skills\"]']")));

		// System.out.println("Select the Option by value 194");

		// select.selectByValue("194");
		// System.out.println("Select value is: " +
		// select.getFirstSelectedOption().getText());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("===========select skill=================");
		Select objSelect = new Select(driver.findElement(By.id("skills")));
		objSelect.selectByVisibleText("Stress resistant");
		// WebElement val3 =
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"goal_type\"]")));
		// val3.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("goal_type")).click();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("===========select skill type =================");
		Select objSelect1 = new Select(driver.findElement(By.id("goal_type")));
		objSelect1.selectByValue("other");

		driver.findElement(By.id("expiry_date")).click();
		driver.findElement(By.id("expiry_date")).sendKeys("2022-01-04");
		// Date date = new SimpleDateFormat("dd/MM/yyyy").parse("12/05/2015");
		driver.findElement(By.className("submitGoal")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("comment")).click();
		driver.findElement(By.id("comment")).sendKeys(
				"THE SOFTWARE IS PROVIDED \"AS IS\" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS");
		driver.findElement(By.className("submitGoal")).click();

		// driver.findElement(By.className("goal-buttons__container gc802")).click();
		System.out.println("============successfully compeleted============");
	}

}
