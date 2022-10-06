import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
	public static void main(String[] args) {

		WebDriver wd = null;

		System.setProperty("webdriver.chrome.driver", "C:\\tools\\seleniumtools\\chromedriver_win32\\chromedriver.exe");
		wd = new ChromeDriver();

		wd.manage().window().maximize();
		wd.get("http://localhost:5500/login.html");
		String sourceCurrentPagePath = wd.getCurrentUrl();
		System.out.println("sourceCurrentPagePath:  " + sourceCurrentPagePath);

//	Registration form
		
		wd.findElement(By.xpath("//*[@id='n']")).sendKeys("sai");
		wd.findElement(By.xpath("//*[@id='a']")).sendKeys("20");
		wd.findElement(By.xpath("//*[@id='name']")).sendKeys("sai@gmail.com");
		wd.findElement(By.xpath("//*[@id='pw']")).sendKeys("123");
		wd.findElement(By.xpath("//*[@id='rgstr_btn']")).click();

		
		
		Alert alertRef = wd.switchTo().alert(); // give the alert box reference
		System.out.println(alertRef.getText()); // alert box content
//		alertRef.accept();  // click ok bututon of alert box
		
		
//      Reset button 
//		WebElement resetButtonRef = wd.findElement(By.id("b"));
//		resetButtonRef.click();
		
		
	}
	
}
