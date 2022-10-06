package WebApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class search {

	WebDriver webdriver = null;
	String URL = "http://automationpractice.com/index.php";

	@Test
	public void searchProduct() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\tools\\seleniumtools\\chromedriver_win32\\chromedriver.exe");			
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(URL);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webdriver.manage().window().maximize();
		Actions actions = new Actions(webdriver);
		WebElement womenTab = webdriver.findElement(By.linkText("WOMEN"));
		WebElement TshirtTab = webdriver
				.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul//a[@title='T-shirts']"));
		actions.moveToElement(womenTab).moveToElement(TshirtTab).click().perform();
		Thread.sleep(2000);

		// Get Product Name
		String ProductName = webdriver
				.findElement(By.xpath(
						"/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]"))
				.getText();
		System.out.println(ProductName);
		webdriver.findElement(By.id("search_query_top")).sendKeys(ProductName);
		webdriver.findElement(By.name("submit_search")).click();

		// Get Name of Searched Product
		String SearchResultProductname = webdriver
				.findElement(By.xpath(
						"/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]"))
				.getText();

		// Verify that correct Product is displaying after search
		if (ProductName.equalsIgnoreCase(SearchResultProductname)) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case Failed");
		}

	}

}