import java.time.Duration;
import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Web {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\New driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://3.20.17.1");
		driver.manage().window().maximize();

//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//Thread.sleep(8000);

//Fluent wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
				"body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > header:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(7) > p:nth-child(1)")));
// invalid Login here
		driver.findElement(By.xpath(
				"//a[@class='MuiTypography-root MuiTypography-inherit MuiLink-root MuiLink-underlineAlways nav-item desktop-visible testt css-15kjgm']//p[@class='MuiTypography-root MuiTypography-body1 css-9l3uo3'][normalize-space()='Login']"))
				.click();
		driver.findElement(By.id("email")).sendKeys("com");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//refresh the window here		
		driver.get("http://3.20.17.1");
		driver.navigate().refresh();
		driver.findElement(By.xpath(
				"//a[@class='MuiTypography-root MuiTypography-inherit MuiLink-root MuiLink-underlineAlways nav-item desktop-visible testt css-15kjgm']//p[@class='MuiTypography-root MuiTypography-body1 css-9l3uo3'][normalize-space()='Login']"))
				.click();
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

		// invalid Login here
		driver.findElement(By.id("email")).sendKeys("QA@yl.com");
		driver.findElement(By.id("password")).sendKeys("lili");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// refresh the window here
		driver.get("http://3.20.17.1");
		driver.navigate().refresh();
		driver.findElement(By.xpath(
				"//a[@class='MuiTypography-root MuiTypography-inherit MuiLink-root MuiLink-underlineAlways nav-item desktop-visible testt css-15kjgm']//p[@class='MuiTypography-root MuiTypography-body1 css-9l3uo3'][normalize-space()='Login']"))
				.click();
		WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		// invalid Login here
		driver.findElement(By.id("email")).sendKeys("QA@yil;opmail.com");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// refresh the window here
		driver.get("http://3.20.17.1");
		driver.navigate().refresh();
		driver.findElement(By.xpath(
				"//a[@class='MuiTypography-root MuiTypography-inherit MuiLink-root MuiLink-underlineAlways nav-item desktop-visible testt css-15kjgm']//p[@class='MuiTypography-root MuiTypography-body1 css-9l3uo3'][normalize-space()='Login']"))
				.click();
		WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		// invalid Login here
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
