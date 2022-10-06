import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) {

		WebDriver wd = null;

		System.setProperty("webdriver.chrome.driver", "C:\\tools\\seleniumtools\\chromedriver_win32\\chromedriver.exe");
		wd = new ChromeDriver();

//		wd.manage().window().maximize();
		wd.get("http://localhost:5500/login.html");
		String sourceCurrentPagePath = wd.getCurrentUrl();
		System.out.println("sourceCurrentPagePath:  " + sourceCurrentPagePath);
		System.out.println();
		// Login-email validation
		WebElement emailIdRef = wd.findElement(By.id("n1"));
		WebElement passwordRef = wd.findElement(By.id("n2"));
		WebElement submitButtonRef = wd.findElement(By.id("b1"));

		emailIdRef.sendKeys("sai@gmail.com");
		passwordRef.sendKeys("123");
		submitButtonRef.click();
		Alert alertRef = wd.switchTo().alert(); // give the alert box reference
		System.out.println(alertRef.getText()); // alert box content
		alertRef.accept(); // click ok bututon of alert box
//		wd.close(); // close the application.
		
//      Reset button 
//		WebElement resetButtonRef = wd.findElement(By.id("b2"));
//		resetButtonRef.click();

		

	}

}
