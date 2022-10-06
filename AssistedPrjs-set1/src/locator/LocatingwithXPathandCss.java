package locator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingwithXPathandCss {
	public static void main(String[] args) {

		WebDriver wd = null;

		System.setProperty("webdriver.chrome.driver", "C:\\tools\\seleniumtools\\chromedriver_win32\\chromedriver.exe");
		wd = new ChromeDriver();
		// Login-email validation
		
		wd.manage().window().maximize();
		wd.get("http://localhost:5500/ph5-Ass-set1.html");
		String sourceCurrentPagePath = wd.getCurrentUrl();
		System.out.println("sourceCurrentPagePath:  " + sourceCurrentPagePath);
		System.out.println();
		
//		CSS Selector Tag and ID format:
		wd.findElement(By.cssSelector("input#n1")).sendKeys("sai@gmail.com");

//		CSS Selector Tag and Class format:
//		wd.findElement(By.cssSelector("input.pass")).sendKeys("123");
		
//		Absolute XPath format:		
		wd.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/input[2]")).sendKeys("123");
		

//		Relative XPath format:
		wd.findElement(By.xpath("//*[@id='b1']")).click();		
		
		Alert alertRef = wd.switchTo().alert(); // give the alert box reference
		System.out.println(alertRef.getText()); // alert box content
//		alertRef.accept(); // click ok bututon of alert box
//		wd.close(); // close the application.
		
//      Reset button 
//		WebElement resetButtonRef = wd.findElement(By.id("b2"));
//		resetButtonRef.click();

		

	}

}
