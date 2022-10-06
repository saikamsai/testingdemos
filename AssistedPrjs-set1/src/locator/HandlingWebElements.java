package locator;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWebElements {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\tools\\seleniumtools\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriver d = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		// text-box
		driver.findElement(By.id("firstName")).sendKeys("saikam");

		driver.findElement(By.id("lastName")).sendKeys("Reddy");

		driver.findElement(By.id("userEmail")).sendKeys("sai@gmail.com");

		// radio button
		driver.findElement(By.className("custom-control-label")).click();
		String label = driver.findElement(By.className("custom-control-label")).getText();

//		// Drop Down list
//		Select fruits = new Select(d.findElement(By.id("fruits")));
//		fruits.selectByVisibleText("Banana");
//		fruits.selectByIndex(1);
//
//		// Link
//		d.findElement(By.id("help")).click();
//		String linkText = d.findElement(By.id("help")).getText();
//
//		// Frame
//		d.switchTo().frame("iframe1");
//		d.switchTo().frame("id of the element");
//
//		// Swiching between tabs in same browser
//		d.findElement(By.linkText("Twitter Advertising Blog")).click();
//		ArrayList<String> tabs2 = new ArrayList<String>(d.getWindowHandles());
//		d.switchTo().window(tabs2.get(1));
//		d.switchTo().window(tabs2.get(0));
//
//		// Web table/Html table
//		// No.of Columns
//		List<WebElement> col = d.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
//		System.out.println("No of cols are : " + col.size());
//		// No.of rows
//		List<WebElement> rows = d.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
//		System.out.println("No of rows are : " + rows.size());
//
//		// Image
//		d.get("https://www.facebook.com/login/identify?ctx=recover");
//		// click on the "Facebook" logo on the upper left portion
//		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();
//		if (d.getTitle().equals("Facebook - log in or sign up")) {
//			System.out.println("We are back at Facebook's homepage");
//		} else {
//			System.out.println("We are NOT in Facebook's homepage");
//
//		}
	}
}
