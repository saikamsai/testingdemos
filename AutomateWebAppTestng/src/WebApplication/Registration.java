package WebApplication;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Registration {

	WebDriver webdriver = null;

	String URL = "http://automationpractice.com/index.php";

	@Test
	public void registration() {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\seleniumtools\\chromedriver_win32\\chromedriver.exe");	
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(URL);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webdriver.manage().window().maximize();
		webdriver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		webdriver.findElement(By.name("email_create")).sendKeys("sai@12gmail.com");
		webdriver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();

		webdriver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("Saikam");
		webdriver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("Reddy");
		webdriver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("Sai123@");

		webdriver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Saikam");
		webdriver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Reddy");

		webdriver.findElement(By.xpath("//*[@id='address1']")).sendKeys("C-14,Main Street");

		webdriver.findElement(By.xpath("//*[@id='city']")).sendKeys("Carolina");

		Select sState = new Select(webdriver.findElement(By.xpath("//*[@id='id_state']")));
		sState.selectByVisibleText("Puerto Rico");

		webdriver.findElement(By.xpath("//*[@id='postcode']")).sendKeys("66666");

		Select sCountry = new Select(webdriver.findElement(By.xpath("//*[@id='id_country']")));
		sCountry.selectByVisibleText("United States");

		webdriver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys("123456789");
		webdriver.findElement(By.xpath("//*[@id='alias']")).sendKeys("Home");
		webdriver.findElement(By.xpath("//*[@id='submitAccount']")).click();
	}
}