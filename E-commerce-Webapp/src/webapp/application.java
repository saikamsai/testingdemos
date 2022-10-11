package webapp;

import java.awt.Toolkit;
import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

@Test
public class application {
	String URL = "https://www.flipkart.com/";
	WebDriver wd = null;

	@BeforeClass()
	public void startBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\seleniumtools\\chromedriver_win32\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
	}

	@Test(priority = 1)
	public void Pageloadtime() throws InterruptedException {
		long start = System.currentTimeMillis();
		wd.get(URL);
		long finish = System.currentTimeMillis();
		long totalms = finish - start;
		long totalTime = totalms / 1000;
		System.out.println("-------------- Test Case-1 ---------------------------- \n");
		System.out.println("-->Page load time - " + totalTime + " sec \n");

	}

	@Test(priority = 2)
	public void Search() throws InterruptedException {
		wd.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		wd.findElement(By.xpath("//img[@alt='Mobiles & Tablets']")).click();
		wd.findElement(By.className("_3704LK")).sendKeys("iPhone 13");
		wd.findElement(By.className("_3704LK")).sendKeys(Keys.ENTER);
		System.out.println("-------------- Test Case-2 ---------------------------- \n");
		System.out.println("-->Searched the product- iphone 13 \n");
		wd.findElement(By.cssSelector(
				"#container > div > div._1kfTjk > div._1rH5Jn > div._2Xfa2_ > div._1cmsER > form > div > button"))
				.click();
		Thread.sleep(3000);
		WebElement i = wd.findElement(By.xpath(
				"//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img"));
		// Javascript executor to check image
		Boolean p = (Boolean) ((JavascriptExecutor) wd).executeScript("return arguments[0].complete "
				+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

		// verify if status is true
		if (p) {
			System.out.println("-->Images are loaded \n");
		} else {
			System.out.println("-->images are not loaded \n");
		}

	}

	@Test(priority = 3)
	public void Scroll() throws InterruptedException {
		WebElement i = wd.findElement(By.xpath("//div[@id='container']"));
		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("arguments[0].scrollIntoView();", i);
		System.out.println("-------------- Test Case-3 ----------------------------");
		System.out.println("-->Scroll Feature is available \n");

		wd.navigate().refresh();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(wd).withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		WebElement frequency = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver wd) {
				return wd.findElement(By.cssSelector("._396cs4._3exPp9"));
			}
		});
		System.out.println("-->contents refreshed and wait time 60 sec polling frequency is 2 sec \n");
	}

	@Test(priority = 4)
	public void Download() throws InterruptedException {

		wd.findElement(By.cssSelector(
				"#container > div > div._1kfTjk > div._1rH5Jn > div._2Xfa2_ > div._1cmsER > form > div > button"))
				.click();
		Thread.sleep(3000);

		WebElement im = wd.findElement(By.xpath(
				"//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img"));
		Boolean q = (Boolean) ((JavascriptExecutor) wd).executeScript("return arguments[0].complete "
				+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", im);

		if (q) {
			System.out.println("-------------- Test Case-4 ----------------------------");
			System.out.println("-->Images are downloaded just before scrolling \n");
		} else {
			System.out.println("-------------- Test Case-4 ----------------------------");
			System.out.println("-->Images are not downloaded \n");
		}
		JavascriptExecutor js = (JavascriptExecutor) wd;

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println("*** Navigated to bottom of the page *** \n");

		int cscreenReso = Toolkit.getDefaultToolkit().getScreenResolution();
		System.out.println("-->Browser-Chrome Screen resolution is " + cscreenReso);

	}
	
	@Test(priority=5)
	public void diffBrowser() {
		WebDriver wd1 = null;
		System.setProperty("webdriver.gecko.driver",
				"C:\\tools\\seleniumtools\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		wd1 = new FirefoxDriver();
		wd1.get("https://www.flipkart.com/");
		int screenReso = Toolkit.getDefaultToolkit().getScreenResolution();
		System.out.println("-------------- Test Case-5 ----------------------------");
		System.out.println("-->Firefox Screen resolution is " + screenReso);
		System.out.println();

	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		wd.close();
	}

}
