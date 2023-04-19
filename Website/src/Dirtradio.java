import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dirtradio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\New driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
driver.get("https://dirtradio.com/");


//Scroll the page here
//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("window.scrollBy(250,2500)", "");
driver.findElement(By.className("nav-link")).click();
//driver.findElement(By.id("email_input")).sendKeys("1231456787");


Thread.sleep(50);
//	driver.close();
	
	}
	
	

}
